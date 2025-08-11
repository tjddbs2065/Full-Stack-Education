package com.java.test;

/** 기본형 자료형 - 정수 */
public class DataTypeTest {
	public static void main(String[] args) {
		//요구 사항
		//월을 입력
		int month1 = 10;
		byte month2 = 10; // vm 범위체크
		
		//50%  입력
		float f1 = 0.5f; // 근사값

		byte b1 = 10 + 10; // 자바 컴파일러가 변수에 자료형을 체크
		
		byte b2 = (byte) (b1 + 10); // byte, short -> int
		byte b3 = Byte.MAX_VALUE;
		int i = Integer.MAX_VALUE;
		
		System.out.println(b3);
		System.out.println(i);

		
		byte b5 = 5, b6 = 6;
		System.out.println(b5 & b6); // 4
		System.out.println(b5 | b6); // 7
		System.out.println(b5 ^ b6); // 3
		
		
		
		
	} // main
} // class
