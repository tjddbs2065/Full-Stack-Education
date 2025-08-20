//1 클래스에 지정자로 abstract를 쓰면 new 뒤에 생성자를 못쓴다.
// 추상 클래스는 다형성을 필수로 사용하기 위한 클래스 - WindowAdapter(상속만 유도)
abstract class SuperA{ // 1.1
//	private SuperA(){}
	public SuperA(){
		System.out.println("SuperA()");
	}
}

// 1.3 자식 클래스가 필수
class SubA extends SuperA{
	public SubA(){System.out.println("SubA");}
}

public class AbstractTest_01 {
	public static void main(String[] args) {
		SuperA a1; // 지역변수는 초기화 필수
//		a1 = new SuperA(); // 1.2 new를 사용 불가(=동적할당 불가)
		a1 = new SubA(); // 1.4 
		
		System.out.println(a1); // 부모의 생성자가 호출된다.
	}
}
