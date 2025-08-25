import java.util.Date;
import java.util.Random;

// UI 역할
public class LottoTest {
	public static void main(String[] args) {
		System.out.println(new Date().toString());	// 1. 객체만 호출하여 출력 // 사용 후 메모리에서 알아서 해제
		System.out.println(Math.random());			// 2. static으로 객체 사용 // 변수나 동적 할당 없이 사용 가능
		Random random = new Random();
		System.out.println(random.nextInt(2));		// 3. 변수에 객체 할당하여 사용 // 선언한 것을 통해 메서드를 반복해서 사용하기 위해
	}
}
