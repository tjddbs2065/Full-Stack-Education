package Office;

public class OfficeTest {
	public static void main(String[] args) {
		int numberOfEmployees = 5;
		IEmployeeBiz empBiz = new ManagerList(numberOfEmployees);
		
		empBiz.addEmployee(new Manager("19-10553", "�����", "1��"));
		empBiz.addEmployee(new Manager("20-10483", "�����", "2��"));
		empBiz.addEmployee(new Employee("23-10213", "ȫ�浿"));
		empBiz.addEmployee(new Employee("25-10184", "��浿"));
		empBiz.addEmployee(new Employee("25-10421", "��ö��"));
		empBiz.addEmployee(new Manager("1004-1004", "������", "0��"));

		System.out.println(empBiz);

		Employee tmpEmployee = new Employee("25-10184", "��浿");
		System.out.println("[" + empBiz.isEmployee(tmpEmployee)+"] " + tmpEmployee);
		
		tmpEmployee = new Employee("21-10184", "��浿");
		System.out.println("[" + empBiz.isEmployee(tmpEmployee)+"] " + tmpEmployee);
		
		
		System.out.println(((ManagerList)empBiz).getOfficeNumber("19-10553"));
		System.out.println(((ManagerList)empBiz).getOfficeNumber("20-10483"));
	}
	
}
