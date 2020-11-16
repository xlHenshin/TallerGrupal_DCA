package model;

import processing.core.PApplet;

public class Contact extends Person{

	public Contact(String name, String lastName, String mail, String nationality, String cellNumber, PApplet app) {
		super(name, lastName, mail, nationality, cellNumber, app);
		this.app=app;
	}

	
}
