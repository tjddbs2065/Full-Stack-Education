package com.java.test;

/** �輺�� */
public class SwitchTest_02 {
	public static void main(String[] args) {
		
		String inputModel = "�ֽ� ��";
		
//		inputModel = "�⺻ ��";
		inputModel = "��� ��";
//		inputModel = "�ְ�� ��";
		
		String message = "";
		
		switch (inputModel) {
		case "�ְ�� ��":
			message = "���� ���� ";
		case "��� ��":
			message = "����� " + message;
		case "�⺻ ��":
			message = "�ڵ��� " + message;
			break;
		default:
			message = "�ش��ϴ� ���� �����ϴ�.";
			break;
		}
		
		System.out.println(message);
	}
}
