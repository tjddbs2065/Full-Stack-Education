package test.com.oopsw.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.oopsw.dao.CustomerDAO;
import com.oopsw.dao.CustomerDAOImpl;

public class JunitCustomerTest {
	static CustomerDAO c;
	

	/** 모든 테스트의 처음에 실행 */
	@BeforeClass
	public static void allTestStart() throws Exception {
		System.out.println("allTestStart()");

		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("[Driver] Load OK");
		String uri = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection connection = DriverManager.getConnection(uri, "hr", "hr");
		System.out.println("[Driver] Connect OK");
		connection.setAutoCommit(false);
		
		c = new CustomerDAOImpl(connection);
	}

	/** 모든 테스트의 마지막에 실행 */
	@AfterClass
	public static void allTestEnd() throws Exception {
		System.out.println("allTestEnd()");
	}

//	@Before
	public void unitTestStart() throws Exception {
		System.out.println("unitTestStart()");
	}

//	@After
	public void unitTestEnd() throws Exception {
		System.out.println("unitTestEnd()");
		
	}

//	@Test
	public void trueTest() {
		assertTrue(1 == 2);
	}
//	@Test
	public void falseTest(){
		assertFalse("hi" == new String("hi"));
	}
	
	@Test
	public void addCustomerTest(){
		assertTrue(c.add("auto commit", "000-0000-0000"));
		assertTrue(c.add("test customer", "000-0000-0000", 100));
	}
	
	@Test
	public void updatePointTest(){
		System.out.println("[updatePointTest]");
		assertTrue(c.updatePoint(47, 1234));
	}
	
	@Test
	public void removeCustomerTest(){
		System.out.println("[removeCustomerTest]");
		assertTrue(c.removeCustomer(47));
	}
	
	@Test
	public void getPointTest(){		
		assertEquals(0, c.getPoint(47));
		assertThat(10, is(c.getPoint(47)));
	}
}