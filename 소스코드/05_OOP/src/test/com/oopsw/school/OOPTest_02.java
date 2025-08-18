package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

/** 배성윤 */
public class OOPTest_02 {
	public static void main(String[] args) {

		int numOfPeople = 3;
		
		Person[] people = new Person[numOfPeople];
		
		// 입력
		people[0] = new Student("200101001", "홍길동", 'M');
		people[1] = new Teacher("t001", "수학", "김철수", 'M');
		people[2] = new Student("200101004", "김영희", 'F');
		
		//출력
		//정보 중에서 학생의 정보를 확인 - 학번
		for(Person person : people){
			if (person instanceof Student) {
				Student s = (Student)person;
				System.out.println(s.getStudentNumber());
			}
		}
	}
	
}
