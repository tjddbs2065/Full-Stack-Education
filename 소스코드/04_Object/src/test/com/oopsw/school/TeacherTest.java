package test.com.oopsw.school;

import com.oopsw.school.TeacherVO;

/** �輺�� */
public class TeacherTest {

	public static void main(String[] args) {		
		int numberOfTeachers = 3;
		
		TeacherVO[] teachers = new TeacherVO[numberOfTeachers];
		
		teachers[0] = new TeacherVO("22-10553", "����", "��ö��", "����");
//		teachers[0] = new TeacherVO();
//		teachers[0] = new TeacherVO("00-00000", "����", "�ƹ���", "����");
		teachers[1] = new TeacherVO("23-10273", "����", "������", "����");
		teachers[2] = new TeacherVO("20-10032", "�ѱ���", "ȫ�浿", "����");
		
		for(int i = 0; i < teachers.length; i++){
			if(teachers[i].getSubject().equals("����"))
				teachers[i].printInfo();
		}
	}

}
