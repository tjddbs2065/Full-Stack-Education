package com.oopsw.school;

public class Teacher extends Person{
	private String teacherNumber;

	
	public Teacher(String teacherNumber, String name) {
		super(name);
		setTeacherNumber(teacherNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) return false;
		if(teacherNumber != ((Teacher)obj).getTeacherNumber()) return false;
		return true;
	}



	@Override
	public String toString() {
		return super.toString() + "\n교사번호: " + teacherNumber;
	}

	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	
	
	
}
