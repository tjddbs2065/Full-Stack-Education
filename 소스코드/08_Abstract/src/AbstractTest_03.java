//3. 출력, 성별 확인, .... 모든 업무의 구현부를 결정할 수 없는 상황.

abstract class SuperC{
	public abstract void print();
	public abstract void methodC();
}

class SubC extends SuperC{

	@Override
	public void print() {
		System.out.println("[SubC] : print()");
		
	}

	@Override
	public void methodC() {
		System.out.println("[SubC] : methodC()");
		
	}
	
}

public class AbstractTest_03 {
	public static void main(String[] args) {
		SuperC c;
		c = new SubC();
		c.print(); c.methodC();
	}
}
