import java.sql.SQLException;

public class EmployeeDAOTest {
	public static void main(String[] args) {
		int startSalary = 6000;
		int endSalary = 9000;
		
		try {
			EmployeeDAO employeeDAO = new EmployeeDAO();
			System.out.println(employeeDAO.getEmployees("Steven"));
			System.out.println(employeeDAO.getEmployees("' or 1 = 1 -- "));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("End");
	}
}
