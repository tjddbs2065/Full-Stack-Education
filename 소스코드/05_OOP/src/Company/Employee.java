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
		System.out.println("�����ȣ: " + getEmpNum());
		System.out.println("����̸�: " + getName());
		System.out.println("����޿�: " + getSalary());
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
