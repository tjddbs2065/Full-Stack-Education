package com.java.test;

import java.util.Scanner;

/** �輺�� */
public class LoopTest_03 {
	public static void main(String[] args) {
		// �� ���� �Է¹޾� �������� ���
		// ������ = 2 ~ 9��
		// ���η� ���
		Scanner sc = new Scanner(System.in);
		
		int startNum = 1, endNum = 1;
		while(true){
			System.out.print("���� �� �Է�: ");
			startNum = sc.nextInt();
			
			if(startNum > 1 && startNum <= 9) break;
		}
		while(true){
			System.out.print("���� �� �Է�("+startNum+"���� ���ų� ū ��): ");
			endNum = sc.nextInt();
			
			if(endNum >= startNum && endNum <= 9) break;
		}
		
		
		String multiTable = "";
		for(int i = 1; i <= 9; i++){
			for(int num = startNum; num <= endNum; num++){
				multiTable += num + " * " + i + " = " + num * i + "\t";
			}
			multiTable += "\n";
		}
		System.out.println(multiTable);
		
	}
}
