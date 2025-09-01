import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** 배성윤 */
public class JDBCTest_02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. uri 정보
		String uri = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "hr";
		String pw = "hr";
		
		// 3. DBMS 연동
		Connection connection = DriverManager.getConnection(uri, id, pw);
		
		// 4. statement 생성
		String sql = "select employee_id, salary from employees where salary between 6000 and 9000";
		Statement statement = connection.createStatement();
		
		// 5. statement 실행을 통해 resultset 반환
		ResultSet resultSet = statement.executeQuery(sql);
		
		StringBuffer stringBuffer = new StringBuffer();
		
		// 6. resultset의 다음이 없을(false) 때까지 반복
		while(resultSet.next()){
			stringBuffer.append(resultSet.getString(1) + " " + resultSet.getFloat(2)+"\n");
		}
		System.out.println(stringBuffer);
		
		// 7. 사용 끝난 후 자원 반환
		resultSet.close();
		statement.close();
		connection.close();		
	}
}
