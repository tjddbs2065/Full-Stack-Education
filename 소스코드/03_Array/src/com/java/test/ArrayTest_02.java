package com.java.test;

// ������ �Է¹޴´�.
// 1�� 1��, 2�� 2��, 3�� 5�� ����
// ������ ������ ����� Ȯ��

/** �輺�� */
public class ArrayTest_02 {
	public static void main(String[] args) {
		// �Է� - database
		int[][] scores = {{100},{90, 89},{70, 60, 50, 40, 30}}; // ����� ���ÿ� �ʱ�ȭ
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
		
		// ó��
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				total += scores[i][j];
				avg++; // �� ����
			}
		}
		avg = total / avg; // ��� ���
		
		// ���
		System.out.println("total: " + total);
		System.out.println("average: " + avg);
	}
}
