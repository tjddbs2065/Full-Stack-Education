/** VO - data 묶기 위해 사용하는 객체
 * 
 * 1. 1 테이블 당 1개의 VO
 * 2. 업무에서 검색 컬럼들을 확인 VO하기 위해 공통 사용
 * 3. Join, SubQuery에서 사용될 데이터의 묶음 
 * 4. Collection, Map 활용
 *  */
public class EmployeeVO {
	private int employeeId;
	private String name;
	private float salary;

	public EmployeeVO(){ }
	
	public EmployeeVO(int employeeId, float salary) {
		this(employeeId, null, salary);
	}
	
	public EmployeeVO(int employeeId, String name, float salary) {
		super();
		setEmployeeId(employeeId);
		setName(name);
		setSalary(salary);
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeVO [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]\n";
	}
}
