import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UI {
	//private BufferedReader br;
	private Scanner br;
	private FileWriter fileWriter;
	public UI() throws Exception{	
		//br=new BufferedReader(new InputStreamReader(System.in));
		br=new Scanner(System.in);
		fileWriter = new FileWriter("out.txt", true);
		
		while(true){
			try {
				menu();
			} catch (IOException e) {
				e.printStackTrace(); //에러 메세지 정도 출력 - 프로그램 지속
			} catch(Exception e){
				System.out.println(e.getMessage());
				throw new Exception("new 예외, 다른 메세지 전달");
			}
		}//while
	}	
	private void menu() throws Exception {
		System.out.print("Q를 입력하면 종료 : ");
		//String m=br.readLine();
		String m=br.nextLine();
		if(m==null || m.equals("Q")){
			fileWriter.close();
			throw new Exception("종료");
		}
		//1.그때 그때 저장한다. 2 생략하면 close할때 호출된다-한꺼번에 저장
		fileWriter.write(m+"\n");
//		fileWriter.flush();
	}
	public static void main(String[] args)  {
		try {
			new UI();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("정상 종료");
		}			
	}
}
