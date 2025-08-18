package Company;

public class Employee {
	private String empNum;
	private String name;
	private int salary;

	public Employee(String empNum, String name, int salary) {
		this.empNum = empNum;
		this.name = name;
		this.salary = salary;
	}

	public void print(){
		System.out.println("사원번호: " + getEmpNum());
		System.out.println("사원이름: " + getName());
		System.out.println("사원급여: " + getSalary());
	}
	
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
