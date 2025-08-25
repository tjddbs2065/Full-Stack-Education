import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/** ¹è¼ºÀ± */
public class IOTest_03 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		FileMaker fileMaker = new FileMaker(new File("./out.txt"));
				
		String message = null;
		while(true){
			try {
				message = br.readLine();
				fileMaker.write(message);
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
			
			if(message.equals("Q") || message.equals("q")) break;
			sb.append(message);
		}
		fileMaker.save();
		System.out.println(sb.toString());
	}	
}
