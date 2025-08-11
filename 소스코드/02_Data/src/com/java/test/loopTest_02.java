package com.java.test;

import java.util.Scanner;

/** 硅己辣 */
public class loopTest_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 1;
		
		// 涝仿
		while(true){
			System.out.print("备备窜 涝仿: ");
			num = sc.nextInt();
			if(num >= 2 && num <= 9) break;
		}
		
		// 贸府
		String multiTable = "";
		boolean isEnd = false;
		int value = num;
		for(int i = 1; i <= 9; value += num){
			multiTable += num + " * " + i++ + " = " + value + "\n";
		}

		// 贸府
		System.out.println(multiTable);
	}
}
