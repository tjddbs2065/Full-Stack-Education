// abstract - ������ X, ������ X, static,
interface SuperD{
	String SUPER_NAME = "SuperD"; // public static final ���� ���� = ��� ���
	
	void print();
	void methodD();
}

interface SuperF{
	void print();
	void methodF();
}

class SubDF implements SuperD, SuperF{

	@Override
	public void methodF() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodD() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceTest {
	public static void main(String[] args) {
		
	}
}
