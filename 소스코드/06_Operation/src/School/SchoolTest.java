package School;

/** ¹è¼ºÀ± */
public class SchoolTest {
	public static void main(String[] args) {
		School school = new School(3);
		System.out.println(school);
		school.add(new Student("22-10553", "È«±æµ¿"));
//		school.add(new Student("21-20202", "¾Æ¹«°³"));
		school.add(new Teacher("24-10324", "±è¿µÈñ"));
		school.add(new Teacher("24-10324", "±è¿µÈñ"));
//		school.add(new Teacher("22-10553", "È«±æµ¿")); // °ªÀÌ °°¾Æµµ Å¬·¡½º°¡ ´Ù¸£¸é Áßº¹ ¾Æ´Ô
		school.add(new Student("22-10553", "È«±æµ¿")); // Áßº¹ °ª Ã¼Å©
		school.add(new Teacher("21-20202", "¾Æ¹«°³"));

		System.out.println(school);
	}
}
