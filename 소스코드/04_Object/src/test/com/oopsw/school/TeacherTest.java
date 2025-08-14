package test.com.oopsw.school;

import com.oopsw.school.TeacherVO;

/** 배성윤 */
public class TeacherTest {

	public static void main(String[] args) {		
		int numberOfTeachers = 3;
		
		TeacherVO[] teachers = new TeacherVO[numberOfTeachers];
		
		teachers[0] = new TeacherVO("22-10553", "영어", "김철수", "남자");
//		teachers[0] = new TeacherVO();
//		teachers[0] = new TeacherVO("00-00000", "수학", "아무개", "여자");
		teachers[1] = new TeacherVO("23-10273", "국어", "김유리", "여자");
		teachers[2] = new TeacherVO("20-10032", "한국사", "홍길동", "남자");
		
		for(int i = 0; i < teachers.length; i++){
			if(teachers[i].getSubject().equals("수학"))
				teachers[i].printInfo();
		}
	}

}
