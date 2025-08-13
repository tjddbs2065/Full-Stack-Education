package com.oopsw.school;

// 학생 - 학번, 이름, 성별,

/** 배성윤 */
public class StudentVO {
	// class의 멤버 데이터 - 일반적으로 data는 private 권장(public final static int MAX_VALUE=100)
	private String studentNumber;
	private String name = "이름없음";
	private char gender = 'M';
	
	// 메모리 할당과 동시에 초기화 생성자
	// 생성자를 정의하지 않으면 VM이 매개인자 없는 생성자를 기본 제공
	// overloading = 입력값의 다양성
	public StudentVO(){}
	public StudentVO(String studentNumber, String name, char gender) {
		setStudentNumber(studentNumber);
		setName(name);
		setGender(gender);
	}
	
	// setXXX, getXXX 일반적으로 public 권장, 메서드는 리턴타입, 매개인자 업무 선택
	public String getStudentNumber() {
		return studentNumber;
	}
	private void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && name.length() >= 2)
			this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		switch (gender) {
		case 'M':
		case 'F':
			this.gender = gender;
			break;
		}
	}
	
	

}
