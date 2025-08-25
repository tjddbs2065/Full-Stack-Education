import java.util.HashSet;

// Math�� ��� �޼��尡 static
public class UserLotto {
	private UserLotto() { }
	
	public static String numbers(){
		return numbers(false);
	}
	
	public static String numbers(boolean flag) {
		StringBuffer sBuffer = new StringBuffer(); // �ӽ� ����
		HashSet<Integer> lotto = new HashSet<>();
		
		getLotto(lotto); // 1
		sBuffer.append(lotto.toString());
		
		if(flag){
			sBuffer.append("���ʽ� ��ȣ: ");
			sBuffer.append(bonusNumber(lotto));
		}
		
		return sBuffer.toString();
	}
	
	private static Object bonusNumber(HashSet<Integer> lotto) {
		int bonusNumber = 0;
		while(true){
			bonusNumber = getNumber();
			if(lotto.add(bonusNumber)) break;
		}
		return bonusNumber;
	}

	private static void getLotto(HashSet<Integer> lotto){
		while(lotto.size() < 6) lotto.add(getNumber());
		
	}

	private static Integer getNumber() {
		int num = (int) (Math.random() * 45) + 1;
		
		return num;
	}

}
