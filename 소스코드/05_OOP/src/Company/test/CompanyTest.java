package Company.test;

import Company.Company;
import Company.DepartmentHead;
import Company.Employee;

/** 배성윤 */
public class CompanyTest {

	public static void main(String[] args) {
				
		Employee[] employees = { 
				new Employee("22-10553", "김철수", 2_800_000),
				new Employee("22-10492", "김영희", 2_900_000),
				new DepartmentHead("16-10234", "홍부장", 4_200_000, "기획"),
				new DepartmentHead("14-10212", "놀부장", 3_800_000, "개발"),
				new Employee("25-10111", "아무개", 1_500_000)
		};
		
		Company company = new Company(employees);
		
		// 평균 급여
		System.out.println("회사 전 직원 평균 급여: "+company.averageSalary());
		double avg = 0; int count = 0;
		for(int i = 0; i < employees.length; i++){
			if(employees[i] != null) avg += employees[i].getSalary();
		}
		avg /= employees.length;
		System.out.println(avg);
		
		// 가장 높은 급여
		int highestSalary = company.getHighestSalary();
		Employee[] richEmp = company.getEmployees(highestSalary);
		
		System.out.println("====부자 사원====");
		for(Employee emp : richEmp)
			emp.print();
		System.out.println("==============");
		
		// 부장의 급여
		DepartmentHead departmentHead = company.getDepartmentHead("개발");
		System.out.println("부장 부서: "+departmentHead.getSalary());
		
	}
	
}
