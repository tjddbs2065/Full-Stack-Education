package test.com.oopsw.school;

import com.oopsw.school.*;

public class StudentTest {

	public static void main(String[] args) {
		// ����
		int number = 10;
		
		//�л��� ������ �Է�(����� ���� Ÿ��)
		StudentVO s1 = new StudentVO();
		StudentVO s2 = new StudentVO("200101001", "ȫ�浿", 'S');

//		s2.setStudentNumber("02001002");
		s2.setName("ȫ");
		s2.setGender('X');
		
		System.out.println(s2.getStudentNumber());
		System.out.println(s2.getName());
		System.out.println(s2.getGender());
		
		System.out.println(s1.getStudentNumber());
		System.out.println(s1.getName());
		System.out.println(s1.getGender());
	}

}
