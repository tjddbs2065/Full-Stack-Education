package com.oopsw.school;

/** 배성윤 */
public class TeacherVO {
	private String number;
	private String subject;
	private String name;
	private String gender;
	
	public TeacherVO() {}

	public TeacherVO(String number, String subject, String name, String gender) {
		setNumber(number);
		setSubject(subject);
		setName(name);
		setGender(gender);
	}
	
	public void printInfo(){
		StringBuilder sb = new StringBuilder();
		
		if(getNumber() == null || getSubject() == null 
				|| getName() == null || getGender() == null)
			sb.append("올바른 정보를 입력하세요");
		else{
			sb.append("교사번호: " + getNumber());
			sb.append("\n담당과목: " + getSubject());
			sb.append("\n교사이름: " + getName());
			sb.append("\n교사성별: " + getGender());
		}
		System.out.println(sb);
	}

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
