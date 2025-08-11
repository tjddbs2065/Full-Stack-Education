package com.java.test;

/** 배성윤 */
public class SwitchTest_02 {
	public static void main(String[] args) {
		
		String inputModel = "최신 모델";
		
//		inputModel = "기본 모델";
		inputModel = "고급 모델";
//		inputModel = "최고급 모델";
		
		String message = "";
		
		switch (inputModel) {
		case "최고급 모델":
			message = "지도 서비스 ";
		case "고급 모델":
			message = "썬루프 " + message;
		case "기본 모델":
			message = "자동차 " + message;
			break;
		default:
			message = "해당하는 모델이 없습니다.";
			break;
		}
		
		System.out.println(message);
	}
}
