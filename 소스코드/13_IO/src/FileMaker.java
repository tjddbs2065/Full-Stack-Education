import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMaker {

	private File file;
	private BufferedWriter bw;
	
	public FileMaker(File file) {
		this.file = file;
		
		try {
			createFile();
			createBuffer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void createBuffer() throws IOException{
		bw = new BufferedWriter(new FileWriter(file));
	}
	public void createFile() throws IOException{
		if(file.exists()) {
			file.createNewFile();
		}
	}
	public void write(String message) throws IOException {
		bw.write(message);
	}
	public void save() {
		try {
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
