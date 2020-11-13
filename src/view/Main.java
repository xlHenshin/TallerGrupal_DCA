package view;

import processing.core.PApplet;
import processing.event.MouseEvent;

public class Main extends PApplet {

	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	InitialScreen IS;
	
	public void settings() {
		size(1440, 810);
		IS= new InitialScreen(0,this);
	}
	
	public void setup() {
		
	}
	
	public void draw() {
		background(0);
		IS.drawImage();
	}
	
	public void keyPressed() {
		
	}
	
	public void mouseClicked() {
		
	}
	public void mouseWheel(MouseEvent event) {
		if (event.getCount() == 1.0) {
			IS.scrollingPlus();
		}
		if (event.getCount() == -1.0) {
			IS.scrollingMinus();
		}
	}
}
