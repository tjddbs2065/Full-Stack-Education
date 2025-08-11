package com.java.test;
/** 배성윤 */
public class SwitchTest {
	public static void main(String[] args) {
		int month = 0;
		int days = 31;
		
		if(month <= 0 || month >= 13)
		
		// 업무를 기준
		switch (month) {
		case 2:
			days = 28;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		}

		System.out.println(month + "월은 " + days + "일 입니다.");
	}
}
