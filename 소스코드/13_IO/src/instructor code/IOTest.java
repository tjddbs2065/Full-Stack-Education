import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {
	public static void main(String[] args) throws IOException {
		System.out.println("1234ABCD�ѱ�");	
		//InputStream is=System.in;  //������ ��ü--���Ÿ��
		//byte-->char �ɼ� �߰� - ����Ÿ��
		InputStreamReader isr=new InputStreamReader(System.in);//������ ����-�ʼ� 
		//char -->String
		BufferedReader br=new BufferedReader(isr);
		String m=br.readLine();
		System.out.println(m);
		br.close();
		isr.close(); //�ڿ��� ��ȯ
//		int input=isr.read();
//		System.out.println(input+" "+(char)input);		
	
	}
}
