// 1. RuntimeException - API�� ���� ���
public class ExceptionTest_01 {
	public static void main(String[] args) {

		try { // ���� ��ġ
			System.out.println(args[0]); // �̸� ���� ��Ȳ�� üũ			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("��������");
		
	}
}
