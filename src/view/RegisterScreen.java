package view;

import processing.core.PApplet;

public class RegisterScreen extends ScreenFather {

	public RegisterScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/registration.png");
		}

}
