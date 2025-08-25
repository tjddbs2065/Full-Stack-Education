import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {
	public static void main(String[] args) throws IOException {
		System.out.println("1234ABCD한글");
		InputStream is = System.in; // 정해진 객체를 --노드 타입
		
		// byte -> char / 옵션 추가 - 필터 타입
		InputStreamReader isr = new InputStreamReader(is); // 생성자 연결 -- 필수
//		int input = isr.read();
//		System.out.println((char)input + " " + input);
		
		BufferedReader br = new BufferedReader(isr);
		String m = br.readLine();
		System.out.println(m);
		
		br.close();
		isr.close();
		is.close();
	}
}
