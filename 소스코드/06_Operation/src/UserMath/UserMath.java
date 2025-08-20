package UserMath;

public class UserMath {
	// default 생성자 제공
	private UserMath(){}
	
	// 두 수를 입력해서 최댓값을 확인
	/** 최댓값 확인 */
	public static int max(int num1, int num2){
		return Math.max(num1, num2);
	}
	
	// 두 수를 입력해서 최솟값을 확인
	public static int min(int num1, int num2){
		return Math.min(num1, num2);
	}
	
	// 유니코드를 입력하면 해당 문자를 확인
	public static char unicode(int code){
		return (char) code;
	}
	
	// 점수를 입력하면 학점(A 90, B80, C70, F)을 확인
	public static char grade(int score){
		char grade = 'F';
		
		if(score <= 100 && score > 90) grade = 'A';
		else if(score > 80) grade = 'B';
		else if(score > 70) grade = 'C';
		else if(score > 60) grade = 'D';
		
		return grade;
	}
	
	
	
}
