package view;

import processing.core.PApplet;
import processing.core.PImage;

public class InitialScreen extends ScreenFather{

	private int change = 0;
	
	public InitialScreen(int posY,PApplet app) {
		super (posY,app);
		screen = app.loadImage("../resources/Initial.png");
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
		if (app.mouseX > 815 && app.mouseX < 815 + 60
				&& app.mouseY > 37 + posY && app.mouseY < 37 + 19 + posY) // 	Contacts Button
			change = 3;
		
		if (app.mouseX > 966 && app.mouseX < 966 + 60
				&& app.mouseY > 37 + posY && app.mouseY < 37 + 19 + posY) // Login Button
			change = 1;
		
		if (app.mouseX > 1092 && app.mouseX < 1092 + 96
				&& app.mouseY > 37 + posY && app.mouseY < 37 + 19 + posY) // Register
			change = 2;
		if (app.mouseX > 647 && app.mouseX < 647 + 137
				&& app.mouseY > 37 + posY && app.mouseY < 37 + 19 + posY) // 	InitialScreen Button 
			change = 0;
		if (app.mouseX > 184 && app.mouseX < 184 + 180
				&& app.mouseY > 419 + posY && app.mouseY < 419 + 35 + posY) // 	Register free Button 
			change = 2;
		if (app.mouseX > 1056 && app.mouseX < 1056 + 128
				&& app.mouseY > 1468 + posY && app.mouseY < 1468 + 65 + posY) // 	buy now Button 
			change = 8;
		if (app.mouseX > 501 && app.mouseX < 501 + 128
				&& app.mouseY > 2854 + posY && app.mouseY < 2854 + 65 + posY) // 	buy now Button 
			change = 8;
		if (app.mouseX > 1091 && app.mouseX < 1091 + 128
				&& app.mouseY > 3846 + posY && app.mouseY < 3846 + 65 + posY) // 	buy now Button 
			change = 8;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}
	

	}

