package model;

import processing.core.PApplet;

public class User extends Person{

	public User(String name, String lastName, String mail, String nationality, int cellNumber, PApplet app) {
		super(name, lastName, mail, nationality, cellNumber, app);
		this.app=app;
	}


}
