package com.oopsw.school;

public class Person {
	private String name;
	private char gender;

	public Person(){}
	public Person(String name, char gender) {
		setName(name);
		setGender(gender);
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
	
	public void print(){
		System.out.println("이름: " + name);
		System.out.println("성별: " + gender);
	}
}
