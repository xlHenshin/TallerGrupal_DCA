package view;

import processing.core.PApplet;
import processing.core.PImage;

public class InitialScreen extends ScreenFather{

	public InitialScreen(int posY,PApplet app) {
		super (posY,app);
		screen = app.loadImage("../resources/Landing.png");
	}

	public void scrollingPlus() {
		if (posY<=0 && posY>-3960) {
			posY-=30;
		}
	}
	public void scrollingMinus() {
		if (posY<0 && posY>=-3960) {
			posY+=30;
			System.out.println(posY);
		}

	}
}
