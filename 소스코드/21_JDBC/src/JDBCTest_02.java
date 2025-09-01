import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** �輺�� */
public class JDBCTest_02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. uri ����
		String uri = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "hr";
		String pw = "hr";
		
		// 3. DBMS ����
		Connection connection = DriverManager.getConnection(uri, id, pw);
		
		// 4. statement ����
		String sql = "select employee_id, salary from employees where salary between 6000 and 9000";
		Statement statement = connection.createStatement();
		
		// 5. statement ������ ���� resultset ��ȯ
		ResultSet resultSet = statement.executeQuery(sql);
		
		StringBuffer stringBuffer = new StringBuffer();
		
		// 6. resultset�� ������ ����(false) ������ �ݺ�
		while(resultSet.next()){
			stringBuffer.append(resultSet.getString(1) + " " + resultSet.getFloat(2)+"\n");
		}
		System.out.println(stringBuffer);
		
		// 7. ��� ���� �� �ڿ� ��ȯ
		resultSet.close();
		statement.close();
		connection.close();		
	}
}
