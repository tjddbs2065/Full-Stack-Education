package Company.test;

import Company.Company;
import Company.DepartmentHead;
import Company.Employee;

/** �輺�� */
public class CompanyTest {

	public static void main(String[] args) {
				
		Employee[] employees = { 
				new Employee("22-10553", "��ö��", 2_800_000),
				new Employee("22-10492", "�迵��", 2_900_000),
				new DepartmentHead("16-10234", "ȫ����", 4_200_000, "��ȹ"),
				new DepartmentHead("14-10212", "�����", 3_800_000, "����"),
				new Employee("25-10111", "�ƹ���", 1_500_000)
		};
		
		Company company = new Company(employees);
		
		// ��� �޿�
		System.out.println("ȸ�� �� ���� ��� �޿�: "+company.averageSalary());
		double avg = 0; int count = 0;
		for(int i = 0; i < employees.length; i++){
			if(employees[i] != null) avg += employees[i].getSalary();
		}
		avg /= employees.length;
		System.out.println(avg);
		
		// ���� ���� �޿�
		int highestSalary = company.getHighestSalary();
		Employee[] richEmp = company.getEmployees(highestSalary);
		
		System.out.println("====���� ���====");
		for(Employee emp : richEmp)
			emp.print();
		System.out.println("==============");
		
		// ������ �޿�
		DepartmentHead departmentHead = company.getDepartmentHead("����");
		System.out.println("���� �μ�: "+departmentHead.getSalary());
		
	}
	
}
