JDBC
- 자바에서 데이터베이스에 접근하기 위한 표준 API
- API 문서를 확인하면 java.sql 패키지의 interface의 수가 클래스의 수보다 많다.
- API에는 SQL에 대한 표준 규격만 정해놓고, DB의 세부 구현은 벤더사에서 하게 하기 때문이다.
- 실제 사용자는 JDBC API를 통해 DB를 사용한다.

DriverManager: VM에서 돌아가며, DB 드라이버가 있으면 이를 관리해주는 역할을 하는 클래스.
- JDBC의 드라이버 로딩과 Connection 관리를 담당하는 관리자 역할을 한다.
- `Class.forName("oracle.jdbc.driver.OracleDriver")`를 통해 수동으로 드라이버를 DriverManager에 등록한다.
- `DriverManager.getConnection(url, user, password)`를 통해 url에 맞는 드라이버를 찾아서 DB와 연결된 `Connection` 객체를 반환한다.
	- 반환 타입은 `java.sql.Connection` 인터페이스이지만, 실제 구현체는 드라이버 벤더사에서 제공한다.

- JVM 시작 시 db 드라이버가 로드되고, 드라이버 구현체가 DriverManager에 자신을 등록한다.

- `DriverManager.getConnection(url, user, password)`를 호출하면 DriverManager는 등록된 드라이버 목록을 순회하면서, url을 처리할 수 있는 드라이버를 찾는다.
- 해당 드라이버가 db와 실제 연결을 맺고 `Connection` 객체를 반환한다.
- `Class.forName()`: JVM의 메모리에 로드하면서 클래스의 static 블록을 실행한다.
	- 드라이버의 `Driver` 클래스 안에는 DriverManager에 등록을 수행하는 static 코드가 들어있다.
	- 때문에 순서대로, JVM이 클래스를 로딩, static 블록 실행, 드라이버 객체가 생성되어 `DriverManager`에 등록이 된다.

##### 원리 흐름
1. `Class.forName("드라이버클래스")` 실행 → JVM이 클래스 로딩.
2. 드라이버 클래스의 **static 블록**이 실행 → `DriverManager.registerDriver()` 호출.
3. `DriverManager`에 드라이버 인스턴스가 등록됨.
4. 이후 `DriverManager.getConnection()`이 해당 드라이버를 찾아서 연결 수행


- 서버와 클라이언트 두 입장에서 input과 output은 서로의 입장에서 다르게 해석될 수 있다. 때문에 sql 요청은 statement, 결과는 resultset이라는 인터페이스로 처리를 한다.


##### 실습
- jdbc: 어떤 db를 사용하더라도 공통된 환경을 제공하는 api(일종의 framework)이다.
- 드라이버가 처음 로딩 되려면 라이브러리가 있어야 하지만 처음에는 ide나 java에서 이를 알지 못하기에, db를 설치하고 생성된 jdbc 라이브러리를 참조 시켜줘야 한다.
- 실습에서는 외부 참조를 통해 ojdbc5.jar를 참조시켜 사용한다.
	- jar: 여러개로 나뉜 자바 코드를 합쳐 놓은 것
- 프로젝트 환경에 jdbc 클래스의 경로를 지정해주어야 한다.
- 