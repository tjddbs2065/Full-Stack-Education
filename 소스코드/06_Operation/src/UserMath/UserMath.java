package UserMath;

public class UserMath {
	// default ������ ����
	private UserMath(){}
	
	// �� ���� �Է��ؼ� �ִ��� Ȯ��
	/** �ִ� Ȯ�� */
	public static int max(int num1, int num2){
		return Math.max(num1, num2);
	}
	
	// �� ���� �Է��ؼ� �ּڰ��� Ȯ��
	public static int min(int num1, int num2){
		return Math.min(num1, num2);
	}
	
	// �����ڵ带 �Է��ϸ� �ش� ���ڸ� Ȯ��
	public static char unicode(int code){
		return (char) code;
	}
	
	// ������ �Է��ϸ� ����(A 90, B80, C70, F)�� Ȯ��
	public static char grade(int score){
		char grade = 'F';
		
		if(score <= 100 && score > 90) grade = 'A';
		else if(score > 80) grade = 'B';
		else if(score > 70) grade = 'C';
		else if(score > 60) grade = 'D';
		
		return grade;
	}
	
	
	
}
