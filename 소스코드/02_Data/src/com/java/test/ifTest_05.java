package com.java.test;

/** �輺��*/
public class ifTest_05 {

	public static void main(String[] args) {
		// ���� �Կ��� �޾Ƽ� �ش� ���� Ȯ��
		// ex) 1���� 31�ϱ��� �Դϴ�.
		// ex) 2���� 28�ϱ��� �Դϴ�.
		
		int input = 4;
		int days = 30;
		
		// �� �� üũ
		if(input < 1 || input > 12) {
			System.out.println("�ùٸ� ���� �Է����ּ���.");
			return;
		}
		
		// �ϼ� ���
		if(input == 2){
			days = 28;
		}
		else if (input < 8) {
			if (input % 2 != 0) days = 31;
		}
		else {
			if (input % 2 == 0) days = 31;
		}
		
		System.out.println(input + "���� " + days + "�ϱ��� �Դϴ�.");
	}
}
