package com.java.test;

public class Student {
	private String studentNumber;
	private String name;
	private char gender;
	
	public Student(){
		this.studentNumber = "";
		this.name = "";
		this.gender = 'M';
	}
	
	public Student(String studentNumber, String name, char gender){
		this.studentNumber = studentNumber;
		this.name = name;
		this.gender = gender;
	}
	
	public void print(){
		StringBuilder sb = new StringBuilder();
		sb.append("학번: " + studentNumber);
		sb.append("\n이름: " + name);
		sb.append("\n성별: " + gender);
		
		System.out.println(sb);
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
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
