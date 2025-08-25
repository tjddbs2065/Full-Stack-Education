import java.util.jar.Attributes.Name;

public class Student {
	public Student(String stNum, String name) {
		this.stNum = stNum;
		this.name = name;
	}
	private String stNum;
	private String name;
	@Override
	public String toString() {
		return "Student [stNum=" + stNum + ", name=" + name + "]";
	}
	
	
}
