package com.oopsw.test;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

/** �輺�� */
public class SchoolTest {

	public static void main(String[] args) {
		
		[] people = new Person[] {
			new Teacher("22-10553", "ȫ�浿"),
			new Student("25-12345", "��ö��")
		};		
		
//		Person tmp = new Student("25-12345", "��ö��");
		Person tmp = new Teacher("22-10553", "ȫ�浿");
		
		for(Person p : people){
			if(p.toString().equals(tmp.toString())) {
				System.out.println("====�Է°� �ߺ�====");
				System.out.println(tmp.toString());		
				System.out.println("===============");	
			}
		}
		
	}
}
