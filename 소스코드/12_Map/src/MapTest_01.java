import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapTest_01 {
	public static void main(String[] args) {
		// vm 정보를 확인
		Properties properties = System.getProperties();
//		System.out.println(properties.keySet());
		Set<Object> keys = properties.keySet();
		
		for (Object key : keys) {
			System.out.println(key.toString() + " = " + System.getProperty(key.toString()));
		}
		
		// 1.5
		Map<String, String> map = System.getenv();
		for(String key : map.keySet()){
			System.out.println(key + " => " + map.get(key));
		}


	}
}
