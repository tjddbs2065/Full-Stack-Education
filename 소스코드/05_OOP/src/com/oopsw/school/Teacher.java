package com.oopsw.school;

public class Teacher extends Person{
	private String teacherNumber;
	private String subject;
	
	public Teacher(String teacherNumber, String subject, String name, char  gender) {
		super(name, gender);
		setTeacherNumber(teacherNumber);
		setSubject(subject);
		this.subject = subject;
	}

	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void print() {
		System.out.println("교사번호: " + teacherNumber);
		System.out.println("과목: " + subject); // getSubject()를 사용하지 않는 이유가 뭘까?
		super.print();
	}
	
	
		
}
