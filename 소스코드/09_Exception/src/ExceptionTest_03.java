//3. CheckedException - API �ִ� ���
public class ExceptionTest_03 {
	public static void main(String[] args) {
		
		try {
			Class.forName("String"); // new String();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("���� ����");
	}
}
