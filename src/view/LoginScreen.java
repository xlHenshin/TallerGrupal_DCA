package view;

import processing.core.PApplet;

public class LoginScreen extends ScreenFather{

	public LoginScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/Login.png");
	}

}
