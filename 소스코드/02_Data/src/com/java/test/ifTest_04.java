package com.java.test;

/** �輺�� */
public class ifTest_04 {
	
	public static void main(String[] args) throws Exception {
		int input = 0;
		String message = "";
		
		// #1
		if(input < 1) {
			message += "��";
		}
		else{
			if(input % 2 == 0) message += "¦�� ";
			if(input % 7 == 0) message += "7�� ��� ";
		}
		
		// #2
//		if(input == 0) {
//			message += "\n��";
//			System.out.println(message);
//			return;
//		}
//		
//		if(input % 2 == 0) message += "¦�� ";
//		if(input % 7 == 0) message += "7�� ��� ";

		
		
		// #3
//		try {
//			if(input == 0) throw new Exception("�Է°��� 0 �Դϴ�.");
//			
//			if(input % 2 == 0) message += "¦�� ";
//			if(input % 7 == 0) message += "7�� ��� ";
//			
//		}catch(Exception e){
//			message += e;
//		}
//		finally {
//			message += "\n��";
//		}
		
		
		
		
		System.out.println(message);
	}
}
