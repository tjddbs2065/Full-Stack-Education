package com.java.test;

/** �輺�� */
// ����� 44, 55, 66, 77 �ִ�. ==> �Է�, ���
public class ArrayTest_01 {
	public static void main(String[] args) {


		int[] size;
		
		// �迭�� Ŭ������ ���� ������ ��ü
		size = new int[4];
		
		System.out.println(size);
		System.out.println(size);
		
//		for(int i = 0; i < 4; i++)
//			System.out.println(size[i]);
//
		char[] cs = {'a', 'b', 'c'};
		
		for(int i = 0; i < cs.length; i++)
			System.out.println(cs[i]);
		
		cs = new char[5];
		for(int i = 0; i < cs.length; i++)
			System.out.println(cs[i]);
		System.out.println("end");
		
	} // main
}
