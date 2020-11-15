package view;

import processing.core.PApplet;

public class BillScreen extends ScreenFather{

	public BillScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/Bill.png");
	}

}
