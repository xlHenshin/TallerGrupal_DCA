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
	ShoppingScreen shoppingscreen;
	
	public int schange=1; //Acá se cambia pantalla
	
	
	
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
		shoppingscreen= new ShoppingScreen(0,this);
	}
	
	public void draw() {
		background(0);
		
		switch (schange) {
		case 0:
			initialscreen.drawImage();
			break;
			
		case 1:
			loginscreen.drawImage();
			break;
			
		case 2:
			registerscreen.drawImage();
			break;
			
		case 3:
			contactscreen.drawImage();
			break;
			
		case 4:
			billscreen.drawImage();
			break;
			
		case 5:
			buyscreen.drawImage();
			break;
			
		case 6: 
			newcontactscreen.drawImage();
			break;
			
		case 7:
			totalscreen.drawImage();
			break;
			
		case 8: 
			shoppingscreen.drawImage();
			break;
			
		default:
			
			break;
		}
	}
	
	public void keyPressed() {
		
	}
	
	public void mouseClicked() {
		
		System.out.println("X= "+ mouseX);
		System.out.println("Y= "+ mouseY);
		
		switch (schange) {
		case 0:
			initialscreen.drawImage();
			break;
			
		case 1:
			loginscreen.drawImage();
			break;
			
		case 2:
			registerscreen.drawImage();
			break;
			
		case 3:
			contactscreen.drawImage();
			break;
			
		case 4:
			billscreen.drawImage();
			break;
			
		case 5:
			buyscreen.drawImage();
			break;
			
		case 6: 
			newcontactscreen.drawImage();
			break;
			
		case 7:
			totalscreen.drawImage();
			break;
			
		case 8: 
			shoppingscreen.drawImage();
			break;
			
		default:
			
			break;
		}
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
