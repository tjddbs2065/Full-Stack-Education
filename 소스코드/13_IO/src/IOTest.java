import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {
	public static void main(String[] args) throws IOException {
		System.out.println("1234ABCD�ѱ�");
		InputStream is = System.in; // ������ ��ü�� --��� Ÿ��
		
		// byte -> char / �ɼ� �߰� - ���� Ÿ��
		InputStreamReader isr = new InputStreamReader(is); // ������ ���� -- �ʼ�
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
