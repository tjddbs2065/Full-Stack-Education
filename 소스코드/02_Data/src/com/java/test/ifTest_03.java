package com.java.test;

public class ifTest_03 {
	public static void main(String[] args) {
		int input = 14;
		
		String message = "";
		
		if(input % 2 == 0) message += "¦�� ";
		if(input % 7 == 0) message += "7�� ��� ";
		
		message += "��";
		
		
		System.out.println(message);
	}
}
