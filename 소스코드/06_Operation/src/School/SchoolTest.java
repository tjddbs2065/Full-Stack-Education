package School;

/** �輺�� */
public class SchoolTest {
	public static void main(String[] args) {
		School school = new School(3);
		System.out.println(school);
		school.add(new Student("22-10553", "ȫ�浿"));
//		school.add(new Student("21-20202", "�ƹ���"));
		school.add(new Teacher("24-10324", "�迵��"));
		school.add(new Teacher("24-10324", "�迵��"));
//		school.add(new Teacher("22-10553", "ȫ�浿")); // ���� ���Ƶ� Ŭ������ �ٸ��� �ߺ� �ƴ�
		school.add(new Student("22-10553", "ȫ�浿")); // �ߺ� �� üũ
		school.add(new Teacher("21-20202", "�ƹ���"));

		System.out.println(school);
	}
}
