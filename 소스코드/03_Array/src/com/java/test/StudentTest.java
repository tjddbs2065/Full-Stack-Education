package com.java.test;

/** 배성윤 */

// 학생의 정보는 학번, 이름, 성별이다.
// 2명의 학생의 정보를 입력하고 확인한다.

public class StudentTest {
	public static void main(String[] args) {
		int num = 2;
		
		// 입력
		String[] studentNumber = new String[num];
		String[] name = new String[num];
		char[] gender = new char[num];

		studentNumber[0] = "20191234";
		name[0] = "김철수";
		gender[0] = 'M';
		
		studentNumber[1] = "20194321";
		name[1] = "김유리";
		gender[1] = 'F';
		
		// 처리
		String info = "";
		for(int i = 0; i < num; i++){
			info += "학번: " + studentNumber[i] + " \n이름: " + name[i] + " \n성별: " + gender[i] + "\n=========\n";
		}
	
		// 출력
		System.out.println(info);
	}
}
