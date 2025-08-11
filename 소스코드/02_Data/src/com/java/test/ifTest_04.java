package com.java.test;

/** 배성윤 */
public class ifTest_04 {
	
	public static void main(String[] args) throws Exception {
		int input = 0;
		String message = "";
		
		// #1
		if(input < 1) {
			message += "끝";
		}
		else{
			if(input % 2 == 0) message += "짝수 ";
			if(input % 7 == 0) message += "7의 배수 ";
		}
		
		// #2
//		if(input == 0) {
//			message += "\n끝";
//			System.out.println(message);
//			return;
//		}
//		
//		if(input % 2 == 0) message += "짝수 ";
//		if(input % 7 == 0) message += "7의 배수 ";

		
		
		// #3
//		try {
//			if(input == 0) throw new Exception("입력값이 0 입니다.");
//			
//			if(input % 2 == 0) message += "짝수 ";
//			if(input % 7 == 0) message += "7의 배수 ";
//			
//		}catch(Exception e){
//			message += e;
//		}
//		finally {
//			message += "\n끝";
//		}
		
		
		
		
		System.out.println(message);
	}
}
