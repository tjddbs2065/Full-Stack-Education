package UserMath;

public class UserMathTest {
	public static void main(String[] args) {
		System.out.println(UserMath.max(10, 11));
		System.out.println(UserMath.max(11, 11));

		System.out.println(UserMath.min(10, 11));
		System.out.println(UserMath.min(11, 11));

		System.out.println(UserMath.unicode(65));
		System.out.println(UserMath.unicode(-65));
		
		System.out.println(UserMath.grade(100));
		System.out.println(UserMath.grade(80));
		System.out.println(UserMath.grade(10));
	}
}
