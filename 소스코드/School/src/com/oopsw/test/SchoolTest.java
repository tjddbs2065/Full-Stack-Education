package com.oopsw.test;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

/** ¹è¼ºÀ± */
public class SchoolTest {

	public static void main(String[] args) {
		
		[] people = new Person[] {
			new Teacher("22-10553", "È«±æµ¿"),
			new Student("25-12345", "±èÃ¶¼ö")
		};		
		
//		Person tmp = new Student("25-12345", "±èÃ¶¼ö");
		Person tmp = new Teacher("22-10553", "È«±æµ¿");
		
		for(Person p : people){
			if(p.toString().equals(tmp.toString())) {
				System.out.println("====ÀÔ·Â°ª Áßº¹====");
				System.out.println(tmp.toString());		
				System.out.println("===============");	
			}
		}
		
	}
}
