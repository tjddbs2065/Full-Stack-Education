package com.java.test;

/** 배성윤*/
public class ifTest_05 {

	public static void main(String[] args) {
		// 월을 입역을 받아서 해당 일을 확인
		// ex) 1월은 31일까지 입니다.
		// ex) 2월은 28일까지 입니다.
		
		int input = 4;
		int days = 30;
		
		// 월 값 체크
		if(input < 1 || input > 12) {
			System.out.println("올바른 월을 입력해주세요.");
			return;
		}
		
		// 일수 계산
		if(input == 2){
			days = 28;
		}
		else if (input < 8) {
			if (input % 2 != 0) days = 31;
		}
		else {
			if (input % 2 == 0) days = 31;
		}
		
		System.out.println(input + "월은 " + days + "일까지 입니다.");
	}
}
