package view;

import processing.core.PApplet;

public class TotalScreen extends ScreenFather{

	public TotalScreen(float posY, PApplet app) {
		super(posY, app);
		// TODO Auto-generated constructor stub
		screen = app.loadImage("../resources/succesful.png");
	}

}
