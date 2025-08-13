package com.oopsw.school;

// �л� - �й�, �̸�, ����,

/** �輺�� */
public class StudentVO {
	// class�� ��� ������ - �Ϲ������� data�� private ����(public final static int MAX_VALUE=100)
	private String studentNumber;
	private String name = "�̸�����";
	private char gender = 'M';
	
	// �޸� �Ҵ�� ���ÿ� �ʱ�ȭ ������
	// �����ڸ� �������� ������ VM�� �Ű����� ���� �����ڸ� �⺻ ����
	// overloading = �Է°��� �پ缺
	public StudentVO(){}
	public StudentVO(String studentNumber, String name, char gender) {
		setStudentNumber(studentNumber);
		setName(name);
		setGender(gender);
	}
	
	// setXXX, getXXX �Ϲ������� public ����, �޼���� ����Ÿ��, �Ű����� ���� ����
	public String getStudentNumber() {
		return studentNumber;
	}
	private void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && name.length() >= 2)
			this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		switch (gender) {
		case 'M':
		case 'F':
			this.gender = gender;
			break;
		}
	}
	
	

}
