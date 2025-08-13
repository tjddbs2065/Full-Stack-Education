package test.com.oopsw.school;

import com.oopsw.school.*;

public class StudentTest {

	public static void main(String[] args) {
		// 정수
		int number = 10;
		
		//학생의 정보를 입력(사용자 정의 타입)
		StudentVO s1 = new StudentVO();
		StudentVO s2 = new StudentVO("200101001", "홍길동", 'S');

//		s2.setStudentNumber("02001002");
		s2.setName("홍");
		s2.setGender('X');
		
		System.out.println(s2.getStudentNumber());
		System.out.println(s2.getName());
		System.out.println(s2.getGender());
		
		System.out.println(s1.getStudentNumber());
		System.out.println(s1.getName());
		System.out.println(s1.getGender());
	}

}
