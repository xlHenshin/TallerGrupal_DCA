package view;

import processing.core.PApplet;

public class ContactScreen extends ScreenFather {

	public ContactScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/contacts.png");
	}

}
