import java.util.HashMap;
import java.util.Map;

public class MapTest_02 {
	public static void main(String[] args) {
		
		// 1 ~ 3����� �л��� ���� - (�й�, �̸�) Ȯ���ϰ� �ʹ�.
		Map<String, String> m1 = new HashMap<>();
		
		m1.put("1��", "test");
		m1.put("2��", "�ƹ���");
		m1.put("3��", "ȫ�浿");
		m1.put("3��", "�̼���");
		
		System.out.println(m1);
		
		Map<Integer, Student> m2 = new HashMap<>();
		m2.put(1, new Student("1234", "test"));
		m2.put(2, new Student("1111", "hihi"));
		System.out.println(m2.toString());
	}
}
