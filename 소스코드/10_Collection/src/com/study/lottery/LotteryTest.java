package com.study.lottery;

/** ¹è¼ºÀ± */
public class LotteryTest {
	public static void main(String[] args) {
		Lottery lottery = new Lottery();

		System.out.println(lottery);
		
		lottery.rollNumbers();
		System.out.println(lottery);
	}
}
