package com.java.test;
import java.io.IOException;
import java.util.Scanner;

/** 흐름-기본, 대안, 예외 (exception) */
public class ifTest_01 {
	public static void main(String[] args) throws IOException{

		// 정수를 입력받아서 짝수를 확인하세요.
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input % 2 == 0) System.out.println("짝수");
		else System.out.println("홀수");
		
		
		int tmp = System.in.read();
		System.out.println(tmp);
	}
}
