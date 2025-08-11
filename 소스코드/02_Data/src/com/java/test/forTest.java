package com.java.test;

/** ¹è¼ºÀ± */
public class forTest {
	public static void main(String[] args) {
		int startNum = 0;
		int endNum = 10;
		StringBuilder nums = new StringBuilder();
		
		for(int i = startNum; i <= endNum; i++)
			nums.append(" "+i);
		
		System.out.println(nums);
	}
}
