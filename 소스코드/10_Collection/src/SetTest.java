import java.util.*; // ��Ű�� �� ��� ��ü Ȱ��

// 1. � ���� N�� �����ϴµ� ������ Ȯ���ϰ� �ʹ�.
// 2. � ���� N�� �����ϴµ� �ߺ� �������� �ʴ´�. 
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
//		System.out.println(c.add(1234)); // 1.5���� int -> Integer�� �ڵ� ��ȯ
//		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("ȫ�浿")));

//		System.out.println(c.add(1234)); // 1.5���� int -> Integer�� �ڵ� ��ȯ
//		System.out.println(c.add("hi"));
		System.out.println(c.add(new UserObject("ȫ�浿")));
		
		System.out.println(c); // callback ���� - �����ֱ� �޼���
	}
}
