package com.java.test;

import java.util.Scanner;

/** �輺�� */
public class loopTest_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 1;
		
		// �Է�
		while(true){
			System.out.print("������ �Է�: ");
			num = sc.nextInt();
			if(num >= 2 && num <= 9) break;
		}
		
		// ó��
		String multiTable = "";
		boolean isEnd = false;
		int value = num;
		for(int i = 1; i <= 9; value += num){
			multiTable += num + " * " + i++ + " = " + value + "\n";
		}

		// ó��
		System.out.println(multiTable);
	}
}
