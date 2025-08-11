package com.java.test;

public class ifTest_03 {
	public static void main(String[] args) {
		int input = 14;
		
		String message = "";
		
		if(input % 2 == 0) message += "짝수 ";
		if(input % 7 == 0) message += "7의 배수 ";
		
		message += "끝";
		
		
		System.out.println(message);
	}
}
