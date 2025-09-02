##### DB / 서비스 구조 관련
- 여러 서비스가 하나의 DB를 공유하면 DB 모델링이 반드시 필요하다.
- MSA 환경에서는 각 서비스가 자체 DB를 보유하는 경우가 많다.
- 전통적으로 MyBatis가 가장 많이 사용되었으나, JPA는 좋은 기능에도 불구하고 활용 빈도가 낮았다.
- MSA와 JPA가 결합되며 활용도가 높아졌다.

##### JDBC
- JDBC(Java Database Connectivity): Java와 DB를 연결하기 위한 API
- 관련 패키지로는 `java.sql.*`가 있다.
- 일반적으로 인터페이스보다 클래스가 많지만, `java.sql`은 인터페이스가 더 많다
	- SQL 표준만 정의하고 구현은 DB 벤더사에서 제공
	- 이는 DB마다 SQL이 달라 Java에서 구현부를 제공할 수 없기 때문
	- 벤더사에(DB제공자)가 구현체(JDBC Driver)를 제공한다.
- Driver Manager
	- 여러 DB 드라이버를 관리하는 드라이버 관리자
	- 클라이언트 요청에 맞은 드라이버를 찾아 연결을 생성
	- OS의 드라이버 관리자와 유사한 역할을 한다.
- SQL 입력과 결과
	- 요청: `Statement`(또는 `PreparedStatement`)
	- 결과: `ResultSet`
- ※ 어떤 DB라도 동일한 방식으로 접근할 수 있게 하는 표준화된 API(프레임워크 성격)



- 서버 연결 특징
	- 연결 자체에 시간이 오래 걸리므로, 보통 연결을 일정 시간 유지한다.
	- 단점: 단순 작업에도 서버 리소스를 오래 점유한다.
- 드라이버 로딩
	- DB 설치 시 함께 제공되는 JDBC 라이브러리(JAR 파일)이 필요하다.
	- 프로젝트 환경에 JDBC 클래스 경로 지정 필수
- SQL 인젝션 방지
	- 입력값을 문자열로 직접 연결하지 말고 `?` 바인딩 문법을 사용해야 한다.


##### DriverManager의 역할
- `DriverManager`는 DB드라이버들을 관리하고, Connection을 생성하는 관리자 클래스이다.
- JVM 내에서 동작하며, JDBC 드라이버가 있으면 이를 관리한다.
- 주요 책임
	- JDBC 드라이버 로딩 관리
	- 드라이버 등록 및 해제
	- DB 연결 요청 처리(`getConnection`)

##### 드라이버 로딩 과정
- `Class.forName("oracle.jdbc.driver.OracleDriver")` 호출
	- JVM이 해당 클래스를 메모리에 로드한다.
	- 이때 클래스의 static 블록이 실행된다.
- 드라이버 클래스의 static 블록 실행
	- static 블록 안에는 보통 `DriverManager.registerDriver(new OracleDriver())` 같은 등록을 위한 코드가 들어있다.
	- 즉, 드라이버 구현체가 자신을 `DriverManager`에 등록한다.

##### Connection 생성 과정
- 애플리케이션 코드에서 `DriverManager.getConnection(url, user, password)`호출
- `DriverManager`는 등록된 드라이버 목록을 순회하며 각 드라이버에게 해당 url을 처리할 수 있는지 확인한다.
- url을 처리할 수 있는 드라이버가 발견되면, 해당 드라이버가 실제 DB와 연결을 맺고 `Connection` 객체를 생성해 반환한다.
- 반환 타입은 `java.sql.Connection` 인터페이스이지만, 실제 구현체는 DB 벤더사에서 제공한다.