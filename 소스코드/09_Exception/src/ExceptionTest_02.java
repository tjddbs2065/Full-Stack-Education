import java.util.Scanner;

// 2. RuntimeException - API�� ���� ���
public class ExceptionTest_02 {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
		}
		catch(RuntimeException e){
			e.printStackTrace();
		}
		
		
		System.out.println("���� ����");
	}
}
