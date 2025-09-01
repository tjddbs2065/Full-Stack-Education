import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/** 배성윤 */

public class EmployeeDAO {
	private Connection connection;
	
	/** throw ClassNotFoundExxception, SQLException */
	public EmployeeDAO() throws ClassNotFoundException, SQLException{
		String className = "oracle.jdbc.driver.OracleDriver";
		Class.forName(className);
		System.out.println("Driver Loading OK");
		
		// 2. uri 정보
		String uri = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "hr";
		String pw = "hr";
		
		// 3. DBMS 연동
		connection = DriverManager.getConnection(uri, id, pw);
		System.out.println("DB Connection OK");
	}
	
	// 모든 사원의 사번, 이름, 급여를 확인
	public Collection<EmployeeVO> getEmployees(){
		Collection<EmployeeVO> list = new ArrayList<EmployeeVO>();
		
		String sql = "select employee_id, first_name, salary from employees";
		
		try{
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				list.add(new EmployeeVO(resultSet.getInt(1),resultSet.getString(2),resultSet.getFloat(3)));
			}
		
		} catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	// 사원의 급여 최소값, 최대값에 해당하는 사원의 사번, 급여를 확인
	public Collection<EmployeeVO> getEmployeesBySalary(int startSalary, int endSalary){
		List<EmployeeVO> list = new ArrayList<>(); 
		String sql = "select employee_id, salary from employees where salary between " + startSalary + " and " + endSalary;
		
		try{
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				list.add(new EmployeeVO(resultSet.getInt(1), resultSet.getFloat(2)));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	public Collection<EmployeeVO> getEmployees(String name){
		List<EmployeeVO> list = new ArrayList<>(); 
		String sql = "select employee_id, salary from employees where first_name = ? and salary=?";
		
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try{
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name); // 자동으로 '(single quotation을 붙여준다)
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				list.add(new EmployeeVO(resultSet.getInt(1), name, resultSet.getFloat(2)));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(resultSet != null) resultSet.close();
			}catch(SQLException e) {e.printStackTrace();
			}
			
			try{
				if(preparedStatement != null) preparedStatement.close();
			}catch(SQLException e){e.printStackTrace();
			}
		}
		return list;
	}
}
