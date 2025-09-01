/** VO - data ���� ���� ����ϴ� ��ü
 * 
 * 1. 1 ���̺� �� 1���� VO
 * 2. �������� �˻� �÷����� Ȯ�� VO�ϱ� ���� ���� ���
 * 3. Join, SubQuery���� ���� �������� ���� 
 * 4. Collection, Map Ȱ��
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
