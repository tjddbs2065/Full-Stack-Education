package test.com.oopsw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.oopsw.dao.CustomerDAOImpl;
import com.oopsw.dao.CustomerDAO;

public class MainTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("[Driver] Load OK");
		String uri = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection connection = DriverManager.getConnection(uri, "hr", "hr");
		System.out.println("[Driver] Connect OK");
		
		CustomerDAO c = new CustomerDAOImpl(connection);
		
//		System.out.println(c.add("ȫ�浿", "010-1111-1111"));
		System.out.println(c.updatePoint(210, 50));
//		System.out.println(c.removeCustomer(24));
//		System.out.println(c.getPoint(20));
	}
}
