package com.java.test;

import java.util.Scanner;

/** 배성윤 */
public class LoopTest_03 {
	public static void main(String[] args) {
		// 두 수를 입력받아 구구단을 출력
		// 구구단 = 2 ~ 9단
		// 세로로 출력
		Scanner sc = new Scanner(System.in);
		
		int startNum = 1, endNum = 1;
		while(true){
			System.out.print("시작 값 입력: ");
			startNum = sc.nextInt();
			
			if(startNum > 1 && startNum <= 9) break;
		}
		while(true){
			System.out.print("종료 값 입력("+startNum+"보다 같거나 큰 수): ");
			endNum = sc.nextInt();
			
			if(endNum >= startNum && endNum <= 9) break;
		}
		
		
		String multiTable = "";
		for(int i = 1; i <= 9; i++){
			for(int num = startNum; num <= endNum; num++){
				multiTable += num + " * " + i + " = " + num * i + "\t";
			}
			multiTable += "\n";
		}
		System.out.println(multiTable);
		
	}
}
