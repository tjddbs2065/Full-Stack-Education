package com.oopsw.school;

public class Person extends Object {
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
		System.out.println("�̸�: " + name);
		System.out.println("����: " + gender);
	}
	// Data �߽��� ��ü�� Overriding�� ����
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // �̰͵� �޼���� �������̵� �ؼ� ���� �ٲ�� �ͺ��� �Ҿ������� �ʳ�?
			return false;
		Person other = (Person) obj;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
