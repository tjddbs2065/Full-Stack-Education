package com.java.test;
import java.util.Scanner;

/** 배성윤 */
public class ifTest_02 {
	public static void main(String[] args) {

		// 입력값이 짝수 이거나 7의 배수인지 확인하세요.
		// 짝수 or 7의 배수? 
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input % 2 == 0) System.out.println("짝수입니다.");
		if(input % 7 == 0) System.out.println("7의 배수입니다.");
	}
}