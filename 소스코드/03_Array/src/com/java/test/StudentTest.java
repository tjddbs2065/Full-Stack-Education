package com.java.test;

/** �輺�� */

// �л��� ������ �й�, �̸�, �����̴�.
// 2���� �л��� ������ �Է��ϰ� Ȯ���Ѵ�.

public class StudentTest {
	public static void main(String[] args) {
		int num = 2;
		
		// �Է�
		String[] studentNumber = new String[num];
		String[] name = new String[num];
		char[] gender = new char[num];

		studentNumber[0] = "20191234";
		name[0] = "��ö��";
		gender[0] = 'M';
		
		studentNumber[1] = "20194321";
		name[1] = "������";
		gender[1] = 'F';
		
		// ó��
		String info = "";
		for(int i = 0; i < num; i++){
			info += "�й�: " + studentNumber[i] + " \n�̸�: " + name[i] + " \n����: " + gender[i] + "\n=========\n";
		}
	
		// ���
		System.out.println(info);
	}
}
