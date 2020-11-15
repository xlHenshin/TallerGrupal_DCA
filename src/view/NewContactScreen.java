package view;

import processing.core.PApplet;

public class NewContactScreen extends ScreenFather {

	public NewContactScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/newcontact.png");
		
	}

}
