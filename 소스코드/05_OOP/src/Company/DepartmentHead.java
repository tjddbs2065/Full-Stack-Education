package Company;

public class DepartmentHead extends Employee{
	private String department;

	public DepartmentHead(String empNum, String name, int salary, String department) {
		super(empNum, name, salary);
		this.department = department;
	}
	
	@Override
	public void print(){
		super.print();
		System.out.println("ºÎ ¼­ ¸í: " + getDepartment());
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}	
}
