package com.oopsw.school;

public class Student extends Person{
	private String studentNumber;
	
	public Student(String studentNumber, String name) {
		super(name);
		setStudentNumber(studentNumber);		
	}

	@Override
	public String toString() {
		return super.toString() + "\nÇĞ¹ø: " + studentNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) return false;
		if(getStudentNumber() != ((Student)obj).getStudentNumber()) return false;
		return true;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
}
