package com.java.test;
/** �輺�� */
public class SwitchTest {
	public static void main(String[] args) {
		int month = 0;
		int days = 31;
		
		if(month <= 0 || month >= 13)
		
		// ������ ����
		switch (month) {
		case 2:
			days = 28;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		}

		System.out.println(month + "���� " + days + "�� �Դϴ�.");
	}
}
