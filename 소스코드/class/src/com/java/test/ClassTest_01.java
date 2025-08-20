package com.java.test;

public class ClassTest_01 {
	public static void main(String[] args) {
		Student student = new Student("20191234", "±èÀ¯¸®", 'F');
		
		System.out.println(student.getStudentName());
		System.out.println(student.getName());
		System.out.println(student.getGender());
	}
}
class Student{
	private String studentName;
	private String name;
	private char gender;
	
	public Student(String studentNumber, String name, char gender){
		this.studentName = studentNumber;
		this.name = name;
		this.gender = gender;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

}
