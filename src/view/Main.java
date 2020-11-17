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

	public boolean error = false;
	public int schange=0; //Acá se cambia pantalla

	
	
	
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
			registerscreen.mostrarP5();
			break;
			
		case 3:
			contactscreen.drawImage();
			
			for (int i = 0; i < contactscreen.contactList().size(); i++) {

				textSize(13);
				fill(0);
				contactscreen.contactList().get(i).drawData(660, 410+(20*i), this);
			}
			break;
			
		case 4:
			billscreen.drawImage();
			break;
			
		case 5:
			buyscreen.drawImage();
			buyscreen.mostrarP5();
			error=buyscreen.isError();
			if (error==true) {
				buyscreen.errorMessage();
			}
			break;
			
		case 6: 
			newcontactscreen.drawImage();
			newcontactscreen.mostrarP5();
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
		System.out.println(schange);
		
		
		switch (schange) {
		case 0:
			initialscreen.button();
			schange=initialscreen.getChange();
			break;
			
		case 1:
			loginscreen.button();
			schange=loginscreen.getChange();
			break;
			
		case 2:
			registerscreen.button();
			schange=registerscreen.getChange();
			
			registerscreen.getUserInfo();
			break;		
			
		case 3:
			contactscreen.button();
			schange=contactscreen.getChange();
			break;
			
		case 4:
			billscreen.button();
			schange=billscreen.getChange();
			break;
			
		case 5:
        
			buyscreen.button();
			schange=buyscreen.getChange();
        //buyscreen.getCardInfo();

			break;
		case 6: 
			newcontactscreen.button();
			schange=newcontactscreen.getChange();
			
			newcontactscreen.getContactInfo();
			break;
			
		case 7:
			totalscreen.button();
			schange=totalscreen.getChange();
			break;
			
		case 8: 
			shoppingscreen.button();
			schange=shoppingscreen.getChange();
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
