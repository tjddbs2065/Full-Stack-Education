import java.util.*; // 패키지 내 모든 객체 활용

// 1. 어떤 값을 N개 저장하는데 순서를 확인하고 싶다.
// 2. 어떤 값을 N개 저장하는데 중복 저장하지 않는다. 
public class SetTest {
	public static void main(String[] args) {
		Collection c;
		c = new ArrayList();
//		c = new HashSet();
		printAll(c);
		
		c = new HashSet(c);
		printAll(c);
	}
	
	public static void printAll(Collection<UserObject> c){
//		System.out.println(c.add(1234)); // 1.5부터 int -> Integer로 자동 변환
//		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("홍길동")));

//		System.out.println(c.add(1234)); // 1.5부터 int -> Integer로 자동 변환
//		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("홍길동")));
		
		System.out.println(c); // callback 패턴 - 생명주기 메서드
	}
}
