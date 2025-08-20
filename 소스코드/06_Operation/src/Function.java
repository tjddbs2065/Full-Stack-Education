
public class Function {
	private Function(){}
	
	public static int max(int num1, int num2){
		int n = num1;
		
		if(n < num2) n = num2;
		
		return n;
	}
	public static int min(int num1, int num2){
		int n = num1;
		
		if(n > num2) n = num2;
		
		return n;
	}

	public static char unicode(int code){
		return (char) code;
	}
	
	public static char grade(int score){
		char grade = 'F';
		
		if(score <= 100 && score > 90) grade = 'A';
		else if(score > 80) grade = 'B';
		else if(score > 70) grade = 'C';
		else if(score > 60) grade = 'D';
		
		return grade;
	}
}
