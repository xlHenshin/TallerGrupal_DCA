package view;

import processing.core.PApplet;
import processing.core.PImage;

public class InitialScreen extends ScreenFather{

	private int change = 0;
	private int nchange;
	
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
	public void button() {
		if (mouseX > 0 && mouseX < 1440
				&& mouseY > 0 && mouseY < 630 ) {
			nchange=1;
		}
	}

	public int getChange() {
		return change = nchange;
	}

	public void setChange(int change) {
		this.change = change;
	}
	

	}

