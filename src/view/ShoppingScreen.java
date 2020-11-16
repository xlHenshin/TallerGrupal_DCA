package view;

import processing.core.PApplet;

public class ShoppingScreen extends ScreenFather {
private int change=0;
	public ShoppingScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/shoppingcart.png");
		}
	public void button() {
		if (app.mouseX > 647 && app.mouseX < 647 + 137
				&& app.mouseY > 40 && app.mouseY < 40 + 19) // 	InitialScreen Button 
			change = 0;
		
		if (app.mouseX > 825 && app.mouseX < 825 + 65
				&& app.mouseY > 40 && app.mouseY < 40 + 19) // 	Contacts Button
			change = 3;
		
		if (app.mouseX > 975 && app.mouseX < 975 + 45
				&& app.mouseY > 40 && app.mouseY < 40 + 19) // Login Button
			change = 1;
		
		if (app.mouseX > 1096 && app.mouseX < 1096 + 82
				&& app.mouseY > 40 && app.mouseY < 40 + 19) // Register
			change = 2;
		
		if (app.mouseX > 647 && app.mouseX < 647 + 137
				&& app.mouseY > 40 && app.mouseY < 40 + 19) // 	InitialScreen Button 
			change = 0;
		if (app.mouseX > 1123 && app.mouseX < 1123 + 115
				&& app.mouseY > 547 && app.mouseY < 547 + 31) // 	Payment Button
			change = 5;
		if (app.mouseX > 928 && app.mouseX < 928 + 179
				&& app.mouseY > 547 && app.mouseY < 547 + 31) // 	Payment Button
			change = 0;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	
}