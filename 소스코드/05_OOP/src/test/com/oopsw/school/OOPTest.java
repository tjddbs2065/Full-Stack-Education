package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class OOPTest {
	public static void main(String[] args) {
		Student s1 = new Student("200101001", "ȫ�浿", 'M');
//		s1.print();
		
		Teacher t1 = new Teacher("t001", "����", "��ö��", 'M');
//		t1.print();
		
		// ����� 44, 55, 66, S, M, L
		int size = 'S';
		
		// �л� �Ǵ� ������ ������ �Է��ϰ� Ȯ���Ѵ�.
		// ������(1. ��Ӱ���, 2. ������ �޼��尡 �ʼ�, 3. �θ�� �����ϰ� �ڽ����� ����)
		Person p = new Student("200101001", "ȫ�浿", 'M');
		p.print();
		p = t1;
		p.print();
		
	}
	
}
