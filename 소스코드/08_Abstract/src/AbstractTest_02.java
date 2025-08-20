// 사람의 정보를 출력한다. 정보중에서 이름 등이 있다. = 유연성(지금 결정, 나중에 결정)
abstract class SuperB{ // 선배가 미리 틀 제공
	public void methodB(){} // 구현부 있다. = 업무가 명확
	public abstract void print();
}

// 추상 클래스르르 상속받은 추상 메서드는 재정의 필수
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
		b.print(); // 재정의
	}
}