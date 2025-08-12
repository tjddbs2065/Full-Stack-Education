package com.java.test;

// 점수를 입력받는다.
// 1등 1명, 2등 2명, 3등 5명 정의
// 점수의 총점과 평균을 확인

/** 배성윤 */
public class ArrayTest_02 {
	public static void main(String[] args) {
		// 입력 - database
		int[][] scores = {{100},{90, 89},{70, 60, 50, 40, 30}}; // 선언과 동시에 초기화
//		int[][] scores = new int[3][];
//		scores[0] = new int[1];
//		scores[1] = new int[2];
//		scores[2] = new int[5];
//		scores[0][0] = 100;
//		scores[1][0] = 90;
//		scores[1][1] = 89;
//		scores[2][0] = 70;
//		scores[2][1] = 60;
//		scores[2][2] = 50;
//		scores[2][3] = 40;
//		scores[2][4] = 30;
		
		
		int total = 0;
		double avg = 0;
		
		// 처리
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				total += scores[i][j];
				avg++; // 총 개수
			}
		}
		avg = total / avg; // 평균 계산
		
		// 출력
		System.out.println("total: " + total);
		System.out.println("average: " + avg);
	}
}
