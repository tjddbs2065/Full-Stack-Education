// abstract - 구현부 X, 생성자 X, static,
interface SuperD{
	String SUPER_NAME = "SuperD"; // public static final 생략 가능 = 상수 취급
	
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
