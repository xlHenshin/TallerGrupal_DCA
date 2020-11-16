package model;

import processing.core.PApplet;

public class Contact extends Person{

	private String age;

	public Contact(String name, String lastName, String mail, String age, String nationality, String cellNumber, PApplet app) {
		super(name, lastName, mail, nationality, cellNumber, app);
		this.app=app;
		this.age=age;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	
}
