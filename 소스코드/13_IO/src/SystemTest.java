import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SystemTest {
	public static void main(String[] args) throws FileNotFoundException {

		System.setOut(new PrintStream("./sys.txt"));
		
		System.out.println("시스템에서 기본 출력을 모니터로 설정해 놓은것");
		
		
	}
}
