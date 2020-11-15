package view;

import processing.core.PApplet;

public class ShoppingScreen extends ScreenFather {

	public ShoppingScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/Shopping Cart.png");
		}

}