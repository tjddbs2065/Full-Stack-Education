package test.com.oopsw.school;

import java.util.Scanner;

import com.oopsw.school.Person;

/** �輺�� */
public class TypeTest {
	public static void main(String[] args) {
		int num1 = 10, num2 = 10;
		
		String s1 = "hi";
		String s2 = "hi";
		String s3 = new String("hi");
		String s4 = new String("hi");
		String s5 = s4;
		
		 Person p1 = new Person("ȫ�浿", 'M');
		 Person p2 = new Person("ȫ�浿", 'M');
		 
		 // �ߺ� ���� Ȯ��
		 System.out.println(num1 == num2);
		 
		 System.out.println(s1 == s2); // 		 
		 
		 System.out.println(s3 == s4); // ���� �Ҵ��Ͽ� �ٸ� ��ü�� ����
		 
		 System.out.println(s4 == s5); // String �� ���� �����̱⿡ �޸𸮿����� ��ġ�� �ٸ���. 
		 
		 System.out.println(s3.equals(s4)); // 
		 
		 System.out.println(p1 == p2); // false
		 
		 System.out.println(p1.getClass()+"@"+Integer.toHexString(p1.hashCode()));
		 System.out.println(p1.toString());
		 System.out.println(s1.getClass()+"@"+Integer.toHexString(s1.hashCode()));
		 
	}
}
