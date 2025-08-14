package com.oopsw.school;

public class Student extends Person{ // 1
	// 2
	private String studentNumber;
	
	public Student(String studentNumber, String name, char gender) {
		super(name, gender);
		System.out.println("[Student] ������");
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	// overriding = ��ӹ��� �޼����� �����θ� ����
	@Override
	public void print(){
		System.out.println(studentNumber);
		super.print();
	}
	
	
}
