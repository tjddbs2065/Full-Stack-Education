import java.util.Date;
import java.util.Random;

// UI ����
public class LottoTest {
	public static void main(String[] args) {
		System.out.println(new Date().toString());	// 1. ��ü�� ȣ���Ͽ� ��� // ��� �� �޸𸮿��� �˾Ƽ� ����
		System.out.println(Math.random());			// 2. static���� ��ü ��� // ������ ���� �Ҵ� ���� ��� ����
		Random random = new Random();
		System.out.println(random.nextInt(2));		// 3. ������ ��ü �Ҵ��Ͽ� ��� // ������ ���� ���� �޼��带 �ݺ��ؼ� ����ϱ� ����
	}
}
