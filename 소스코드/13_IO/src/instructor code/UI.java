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
				e.printStackTrace(); //���� �޼��� ���� ��� - ���α׷� ����
			} catch(Exception e){
				System.out.println(e.getMessage());
				throw new Exception("new ����, �ٸ� �޼��� ����");
			}
		}//while
	}	
	private void menu() throws Exception {
		System.out.print("Q�� �Է��ϸ� ���� : ");
		//String m=br.readLine();
		String m=br.nextLine();
		if(m==null || m.equals("Q")){
			fileWriter.close();
			throw new Exception("����");
		}
		//1.�׶� �׶� �����Ѵ�. 2 �����ϸ� close�Ҷ� ȣ��ȴ�-�Ѳ����� ����
		fileWriter.write(m+"\n");
//		fileWriter.flush();
	}
	public static void main(String[] args)  {
		try {
			new UI();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("���� ����");
		}			
	}
}
