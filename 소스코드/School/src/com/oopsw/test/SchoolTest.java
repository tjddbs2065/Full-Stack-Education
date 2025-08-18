package com.oopsw.test;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

/** �輺�� */
public class SchoolTest {

	public static void main(String[] args) {
		
		Person[] people = new Person[2];
		
		Student student = new Student("25-12345", "��ö��");
		Teacher teacher = new Teacher("22-10553", "ȫ�浿"); 
		people[0] = student;
		people[1] = teacher;
				
		if(people[0] != null)
			System.out.println(people[0].toString());
		System.out.println();
		if(people[1] != null)
			System.out.println(people[1].toString());
		System.out.println();
		

		Person tmp = new Student("25-12345", "��ö��");
//		Person tmp = new Teacher("22-10553", "ȫ�浿");
		
		for(Person p : people){
			if(p.equals(tmp)) {
				System.out.println("====�Է°� �ߺ�====");
				System.out.println(tmp.toString());		
				System.out.println("===============");	
			}
		}
	}
}
