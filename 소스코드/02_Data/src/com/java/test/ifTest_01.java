package com.java.test;
import java.io.IOException;
import java.util.Scanner;

/** �帧-�⺻, ���, ���� (exception) */
public class ifTest_01 {
	public static void main(String[] args) throws IOException{

		// ������ �Է¹޾Ƽ� ¦���� Ȯ���ϼ���.
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input % 2 == 0) System.out.println("¦��");
		else System.out.println("Ȧ��");
		
		
		int tmp = System.in.read();
		System.out.println(tmp);
	}
}
