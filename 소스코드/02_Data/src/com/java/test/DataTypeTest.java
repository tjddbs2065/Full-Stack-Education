package com.java.test;

/** �⺻�� �ڷ��� - ���� */
public class DataTypeTest {
	public static void main(String[] args) {
		//�䱸 ����
		//���� �Է�
		int month1 = 10;
		byte month2 = 10; // vm ����üũ
		
		//50%  �Է�
		float f1 = 0.5f; // �ٻ簪

		byte b1 = 10 + 10; // �ڹ� �����Ϸ��� ������ �ڷ����� üũ
		
		byte b2 = (byte) (b1 + 10); // byte, short -> int
		byte b3 = Byte.MAX_VALUE;
		int i = Integer.MAX_VALUE;
		
		System.out.println(b3);
		System.out.println(i);

		
		byte b5 = 5, b6 = 6;
		System.out.println(b5 & b6); // 4
		System.out.println(b5 | b6); // 7
		System.out.println(b5 ^ b6); // 3
		
		
		
		
	} // main
} // class
