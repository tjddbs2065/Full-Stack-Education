import java.util.HashMap;
import java.util.Map;

public class MapTest_02 {
	public static void main(String[] args) {
		
		// 1 ~ 3등까지 학생의 정보 - (학번, 이름) 확인하고 싶다.
		Map<String, String> m1 = new HashMap<>();
		
		m1.put("1등", "test");
		m1.put("2등", "아무개");
		m1.put("3등", "홍길동");
		m1.put("3등", "이순신");
		
		System.out.println(m1);
		
		Map<Integer, Student> m2 = new HashMap<>();
		m2.put(1, new Student("1234", "test"));
		m2.put(2, new Student("1111", "hihi"));
		System.out.println(m2.toString());
	}
}
