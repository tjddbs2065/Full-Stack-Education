package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class OOPTest {
	public static void main(String[] args) {
		Student s1 = new Student("200101001", "홍길동", 'M');
//		s1.print();
		
		Teacher t1 = new Teacher("t001", "수학", "김철수", 'M');
//		t1.print();
		
		// 사이즈가 44, 55, 66, S, M, L
		int size = 'S';
		
		// 학생 또는 교사의 정보를 입력하고 확인한다.
		// 다형성(1. 상속관계, 2. 재정의 메서드가 필수, 3. 부모로 선언하고 자식으로 생성)
		Person p = new Student("200101001", "홍길동", 'M');
		p.print();
		p = t1;
		p.print();
		
	}
	
}
