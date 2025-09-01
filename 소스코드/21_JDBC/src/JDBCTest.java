import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String className = "oracle.jdbc.driver.OracleDriver"; // 클래스 경로
		// 1. 드라이버 로딩
		Class.forName(className);
		System.out.println("Driver Loading OK");
		
		// 2. DBMS 연동
		String uri = "jdbc:oracle:thin:@127.0.0.1:1521:XE"; // db uri 경로
		String id = "hr";
		String pw = "hr";
		
		Connection connection = DriverManager.getConnection(uri, id, pw);
		
		System.out.println("DB Connection Ok");
		
		// 3, 4. 업무에 따라 SQL 확인
		String sql = "select employee_id, first_name, salary from employees";
		Statement statement = connection.createStatement();
		ResultSet rSet = statement.executeQuery(sql);
		
		while(rSet.next()){
			System.out.println(rSet.getInt(1) + " " + rSet.getString(2) + " " + rSet.getFloat(3));
		}
		
		// 5. 자원 반환
		rSet.close();
		statement.close();
		connection.close();
		
		System.out.println("프로그램 종료");
	}
}
