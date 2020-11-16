package model;

import processing.core.PApplet;

public class Contact extends Person{

	private String age;
	private PApplet app;

	public Contact(String name, String lastName, String mail, String age, String nationality, String cellNumber, PApplet app) {
		super(name, lastName, mail, nationality, cellNumber, app);
		this.app=app;
		this.age=age;
	}
	
	public void drawData(int x, int y, PApplet app) {

		//System.out.println(name+lastName+mail+age+nationality+cellNumber);
		
		app.text(name, x, y);
		app.text(lastName, x+ 20*4, y );
		app.text(mail, x+ 45*4, y );
		app.text(age, x+ 62*6, y );
		app.text(nationality, x+ 105*4, y );
		app.text(cellNumber, x + 135*4, y);

	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	
}
