package com.study.lottery;

import java.util.HashSet;
import java.util.Set;
/** ¹è¼ºÀ± */
public class Lottery {
	private Set<Integer> numbers;
	private int bonus;
	
	public static final int NUM_COUNT = 6;
	public static final int MAX_NUM = 45;
	
	public Lottery(){
		rollNumbers();
	}
	
	public void rollNumbers(){
		getNumbers();
		getBonus();
	}
	
	private void getNumbers(){
		numbers = new HashSet<>();
		
		while(numbers.size() < NUM_COUNT)
			numbers.add(getRandomNumber());
	}
	private void getBonus(){
		bonus = 0;
		
		while(true){
			bonus = getRandomNumber();
			if(!numbers.contains(bonus)){
				break;
			}
		}
	}
	static public int getRandomNumber(){
		return (int)(Math.random() * MAX_NUM) + 1;
	}
	
	@Override
	public String toString() {
//		rollNumbers();
		return "Lottery =" + numbers + ", bonus=[" + bonus + "]";
	}
	
}
