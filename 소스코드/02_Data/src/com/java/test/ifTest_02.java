package com.java.test;
import java.util.Scanner;

/** �輺�� */
public class ifTest_02 {
	public static void main(String[] args) {

		// �Է°��� ¦�� �̰ų� 7�� ������� Ȯ���ϼ���.
		// ¦�� or 7�� ���? 
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input % 2 == 0) System.out.println("¦���Դϴ�.");
		if(input % 7 == 0) System.out.println("7�� ����Դϴ�.");
	}
}