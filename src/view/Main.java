package view;

import processing.core.PApplet;
import processing.event.MouseEvent;

public class Main extends PApplet {

	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	InitialScreen initialscreen;
	LoginScreen loginscreen;
	RegisterScreen registerscreen;
	ContactScreen contactscreen;
	BillScreen billscreen;
	BuyScreen buyscreen;
	NewContactScreen newcontactscreen;
	TotalScreen totalscreen;
	
	public int schange=0;
	
	
	
	public void settings() {
		size(1440, 810);
	}
	
	public void setup() {
		
		initialscreen= new InitialScreen(0,this);
		loginscreen= new LoginScreen(0,this);
		registerscreen= new RegisterScreen(0,this);
		contactscreen= new ContactScreen(0,this);
		billscreen= new BillScreen(0,this);
		buyscreen= new BuyScreen(0,this);
		newcontactscreen= new NewContactScreen(0,this);
		totalscreen= new TotalScreen(0,this);
	}
	
	public void draw() {
		background(0);
		
		switch (schange) {
		case 0:
			initialscreen.drawImage();
			break;
			
		case 1:
			
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			
			break;
			
		case 6: 
			
			break;
			
		case 7:
			
			break;
			
		case 8: 
			
			break;
			
		default:
			
			break;
		}
	}
	
	public void keyPressed() {
		
	}
	
	public void mouseClicked() {
		
		initialscreen.button();
		schange = initialscreen.getChange();
		System.out.println(initialscreen.getChange());
		
		
	}
	public void mouseWheel(MouseEvent event) {
		if (event.getCount() == 1.0) {
			initialscreen.scrollingPlus();
		}
		if (event.getCount() == -1.0) {
			initialscreen.scrollingMinus();
		}
	}
}
