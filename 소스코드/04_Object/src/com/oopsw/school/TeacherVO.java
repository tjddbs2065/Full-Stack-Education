package com.oopsw.school;

/** �輺�� */
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
			sb.append("�ùٸ� ������ �Է��ϼ���");
		else{
			sb.append("�����ȣ: " + getNumber());
			sb.append("\n������: " + getSubject());
			sb.append("\n�����̸�: " + getName());
			sb.append("\n���缺��: " + getGender());
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
