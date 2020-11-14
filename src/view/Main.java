package view;

import processing.core.PApplet;
import processing.event.MouseEvent;

public class Main extends PApplet {

	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	public int Schange=0;
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
		System.out.println("hola");
	}
	
	public void keyPressed() {
		
	}
	
	public void mouseClicked() {
		IS.button();
		Schange = IS.getChange();
		System.out.println(IS.getChange());
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
