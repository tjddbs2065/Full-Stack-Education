import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SystemTest {
	public static void main(String[] args) throws FileNotFoundException {

		System.setOut(new PrintStream("./sys.txt"));
		
		System.out.println("�ý��ۿ��� �⺻ ����� ����ͷ� ������ ������");
		
		
	}
}
