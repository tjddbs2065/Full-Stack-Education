package com.oopsw.school;

public class Student extends Person{ // 1
	// 2
	private String studentNumber;
	
	public Student(String studentNumber, String name, char gender) {
		super(name, gender);
		System.out.println("[Student] 생성자");
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	// overriding = 상속받은 메서드의 구현부를 변경
	@Override
	public void print(){
		System.out.println(studentNumber);
		super.print();
	}
	
	
}
