// 1. RuntimeException - API가 없는 경우
public class ExceptionTest_01 {
	public static void main(String[] args) {

		try { // 안전 장치
			System.out.println(args[0]); // 미리 예외 상황을 체크			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("정상종료");
		
	}
}
