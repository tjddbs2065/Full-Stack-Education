// ����� ������ ����Ѵ�. �����߿��� �̸� ���� �ִ�. = ������(���� ����, ���߿� ����)
abstract class SuperB{ // ���谡 �̸� Ʋ ����
	public void methodB(){} // ������ �ִ�. = ������ ��Ȯ
	public abstract void print();
}

// �߻� Ŭ�������� ��ӹ��� �߻� �޼���� ������ �ʼ�
class SubB extends SuperB{

	@Override
	public void print() {
		System.out.println("Sub's print()");
	}
	
}

public class AbstractTest_02 {
	public static void main(String[] args) {
		SuperB b = new SubB();
		b.methodB();
		b.print(); // ������
	}
}