package com.java.test;

/** �輺�� */
public class loopTest_01 {
	public static void main(String[] args) {
		StringBuilder nums = new StringBuilder();

		long startTime = System.nanoTime();
		
		for (int i = 0; i < 11; i += 1) {
			nums.append(i + "\n");
		}
		System.out.println(nums);
		
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime + " ns");
	}
}
