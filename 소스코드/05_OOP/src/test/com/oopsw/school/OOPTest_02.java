package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

/** �輺�� */
public class OOPTest_02 {
	public static void main(String[] args) {

		int numOfPeople = 3;
		
		Person[] people = new Person[numOfPeople];
		
		// �Է�
		people[0] = new Student("200101001", "ȫ�浿", 'M');
		people[1] = new Teacher("t001", "����", "��ö��", 'M');
		people[2] = new Student("200101004", "�迵��", 'F');
		
		//���
		//���� �߿��� �л��� ������ Ȯ�� - �й�
		for(Person person : people){
			if (person instanceof Student) {
				Student s = (Student)person;
				System.out.println(s.getStudentNumber());
			}
		}
	}
	
}
