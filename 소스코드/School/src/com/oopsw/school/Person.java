package com.oopsw.school;

public class Person {
	private String name;

	public Person(String name) {
		setName(name);
	}
	
	@Override
	public String toString() {
		return "¿Ã∏ß: " + name;
	}

	@Override
	public boolean equals(Object obj) {
		if(getName() != ((Person)obj).getName()) return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
