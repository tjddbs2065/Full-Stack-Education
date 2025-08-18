package Company;

public class Company {
	
	private final static int MAX_EMPLOYEES = 5;
	private Employee[] employees;

	public Company() {
		employees = null;
	}
	public Company(Employee[] employees) {
		this.employees = employees;
	}
	
	public int totalSalary(){
		int total = 0;
		for(Employee employee : employees)
			total += employee.getSalary();
		
		return total;
	}
	public double averageSalary(){
		double avg = (double)totalSalary() / employees.length;
		
		return avg;
	}
	public int getHighestSalary(){
		int highestSalary = employees[0].getSalary();
		
		for(Employee employee : employees){
			if(highestSalary < employee.getSalary()) 
				highestSalary = employee.getSalary();
		}
		
		return highestSalary;
	}
	public Employee[] getEmployees(int salary){
		Employee[] tmp = new Employee[MAX_EMPLOYEES];
		
		int idx = 0;
		for(Employee emp : employees)
			if(emp.getSalary() == salary)
				tmp[idx++] = emp;

		Employee[] highestSalaryEmps = new Employee[idx];
		for(int i = 0; i < idx; i++)
			highestSalaryEmps[i] = tmp[i];
		
		return highestSalaryEmps;
	}
	
	public DepartmentHead getDepartmentHead(String department){
		DepartmentHead departmentHead = null;
		
		for(Employee emp : employees){
			if(emp instanceof DepartmentHead){
				DepartmentHead tmpHead = (DepartmentHead)emp;
				if(tmpHead.getDepartment().equals(department)){
					departmentHead = (DepartmentHead) emp;
					break;
				}
			}
		}
		
		return departmentHead;
	}
	
	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
}
