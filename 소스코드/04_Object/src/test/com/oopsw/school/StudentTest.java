package test.com.oopsw.school;

import com.oopsw.school.*;

public class StudentTest {

	public static void main(String[] args) {
		
		//�л��� ������ �Է�(����� ���� Ÿ��)
		StudentVO s1 = new StudentVO();
		StudentVO s2 = new StudentVO("200101001", "ȫ�浿", 'S');

//		s2.setStudentNumber("02001002");
		s2.setName("ȫ");
		s2.setGender('X');
		
		s1.printAll();
		s2.printAll();
	}

}
