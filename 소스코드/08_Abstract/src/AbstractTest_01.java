//1 Ŭ������ �����ڷ� abstract�� ���� new �ڿ� �����ڸ� ������.
// �߻� Ŭ������ �������� �ʼ��� ����ϱ� ���� Ŭ���� - WindowAdapter(��Ӹ� ����)
abstract class SuperA{ // 1.1
//	private SuperA(){}
	public SuperA(){
		System.out.println("SuperA()");
	}
}

// 1.3 �ڽ� Ŭ������ �ʼ�
class SubA extends SuperA{
	public SubA(){System.out.println("SubA");}
}

public class AbstractTest_01 {
	public static void main(String[] args) {
		SuperA a1; // ���������� �ʱ�ȭ �ʼ�
//		a1 = new SuperA(); // 1.2 new�� ��� �Ұ�(=�����Ҵ� �Ұ�)
		a1 = new SubA(); // 1.4 
		
		System.out.println(a1); // �θ��� �����ڰ� ȣ��ȴ�.
	}
}
