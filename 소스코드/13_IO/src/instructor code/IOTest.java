import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {
	public static void main(String[] args) throws IOException {
		System.out.println("1234ABCD한글");	
		//InputStream is=System.in;  //정해진 객체--노드타입
		//byte-->char 옵션 추가 - 필터타입
		InputStreamReader isr=new InputStreamReader(System.in);//생성자 연결-필수 
		//char -->String
		BufferedReader br=new BufferedReader(isr);
		String m=br.readLine();
		System.out.println(m);
		br.close();
		isr.close(); //자원을 반환
//		int input=isr.read();
//		System.out.println(input+" "+(char)input);		
	
	}
}
