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
		numbers = new HashSet<>();
	}
	
	public void rollNumbers(){
		if(numbers != null)
			numbers = new HashSet<>();
		getNumbers();
		getBonus();
	}
	
	private void getNumbers(){
		while(numbers.size() <= NUM_COUNT-1)
			numbers.add((int)(Math.random()*45)+1);
	}
	private void getBonus(){
		int bonus;
		while(true){
			bonus = (int)(Math.random() * 45) + 1;
			if(!numbers.contains(bonus)){
				this.bonus = bonus;
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "Lottery =" + numbers + ", bonus=[" + bonus + "]";
	}
	
}
