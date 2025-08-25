import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** ¹è¼ºÀ± */
public class IOTest_02 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String message = null;
		while(true){
			try {
				message = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
			
			if(message.equals("Q") || message.equals("q")) break;
			System.out.println(message);
		}
		
		try {
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
