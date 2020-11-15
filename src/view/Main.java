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
	
	public int schange=2; //Acá se cambia pantalla
	
	
	
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
			
			if (mouseX > 825 && mouseX < 825 + 65
					&& mouseY > 48 && mouseY < 48 + 10) // 	Contacts Button
				schange = 3;
			
			if (mouseX > 975 && mouseX < 975 + 45
					&& mouseY > 48 && mouseY < 48 + 10) // Login Button
				schange = 1;
			
			if (mouseX > 1096 && mouseX < 1096 + 82
					&& mouseY > 48 && mouseY < 48 + 10) // Register
				schange = 2;

			if (mouseX > 543 && mouseX < 543 + 47
					&& mouseY > 48 && mouseY < 48 + 10) // 	About Button ( por si acaso )
				schange = 3;
			
			if (mouseX > 363 && mouseX < 363 + 106
					&& mouseY > 48 && mouseY < 48 + 10) // 	InitialScreen Button 
				schange = 3;
			
			if (mouseX > 256 && mouseX < 256 + 17
					&& mouseY > 48 && mouseY < 48 + 10) // 	Option Button (por si acaso)
				schange = 3;
			
			break;
			
		case 2:
			
			if (mouseX > 825 && mouseX < 825 + 65
					&& mouseY > 48 && mouseY < 48 + 10) // 	Contacts Button
				schange = 3;
			
			if (mouseX > 975 && mouseX < 975 + 45
					&& mouseY > 48 && mouseY < 48 + 10) // Login Button
				schange = 1;
			
			if (mouseX > 1096 && mouseX < 1096 + 82
					&& mouseY > 48 && mouseY < 48 + 10) // Register
				schange = 2;

			if (mouseX > 543 && mouseX < 543 + 47
					&& mouseY > 48 && mouseY < 48 + 10) // 	About Button ( por si acaso )
				schange = 3;
			
			if (mouseX > 363 && mouseX < 363 + 106
					&& mouseY > 48 && mouseY < 48 + 10) // 	InitialScreen Button 
				schange = 3;
			
			if (mouseX > 256 && mouseX < 256 + 17
					&& mouseY > 48 && mouseY < 48 + 10) // 	Option Button (por si acaso)
				schange = 3;
			break;
			
		case 3:
			
			if (mouseX > 825 && mouseX < 825 + 65
					&& mouseY > 48 && mouseY < 48 + 10) // 	Contacts Button
				schange = 3;
			
			if (mouseX > 975 && mouseX < 975 + 45
					&& mouseY > 48 && mouseY < 48 + 10) // Login Button
				schange = 1;
			
			if (mouseX > 1096 && mouseX < 1096 + 82
					&& mouseY > 48 && mouseY < 48 + 10) // Register
				schange = 2;

			
			if (mouseX > 363 && mouseX < 363 + 106
					&& mouseY > 48 && mouseY < 48 + 10) // 	InitialScreen Button 
				schange = 3;
			
			if (mouseX > 256 && mouseX < 256 + 17
					&& mouseY > 48 && mouseY < 48 + 10) // 	Option Button (por si acaso)
				schange = 3;
			
			
			break;
			
		case 4:
			
			if (mouseX > 825 && mouseX < 825 + 65
					&& mouseY > 48 && mouseY < 48 + 10) // 	Contacts Button
				schange = 3;
			
			if (mouseX > 975 && mouseX < 975 + 45
					&& mouseY > 48 && mouseY < 48 + 10) // Login Button
				schange = 1;
			
			if (mouseX > 1096 && mouseX < 1096 + 82
					&& mouseY > 48 && mouseY < 48 + 10) // Register
				schange = 2;

			if (mouseX > 543 && mouseX < 543 + 47
					&& mouseY > 48 && mouseY < 48 + 10) // 	About Button ( por si acaso )
				schange = 3;
			
			if (mouseX > 363 && mouseX < 363 + 106
					&& mouseY > 48 && mouseY < 48 + 10) // 	InitialScreen Button 
				schange = 3;
			
			if (mouseX > 256 && mouseX < 256 + 17
					&& mouseY > 48 && mouseY < 48 + 10) // 	Option Button (por si acaso)
				schange = 3;
			
			if (mouseX > 673 && mouseX < 673 + 101
					&& mouseY > 586 && mouseY < 586 + 28) // 	Cancel Button
				schange = 3; //CAMBIAR
			
			break;
			
		case 5:
			
			if (mouseX > 825 && mouseX < 825 + 65
					&& mouseY > 48 && mouseY < 48 + 10) // 	Contacts Button
				schange = 3;
			
			if (mouseX > 975 && mouseX < 975 + 45
					&& mouseY > 48 && mouseY < 48 + 10) // Login Button
				schange = 1;
			
			if (mouseX > 1096 && mouseX < 1096 + 82
					&& mouseY > 48 && mouseY < 48 + 10) // Register
				schange = 2;

			if (mouseX > 543 && mouseX < 543 + 47
					&& mouseY > 48 && mouseY < 48 + 10) // 	About Button ( por si acaso )
				schange = 3;
			
			if (mouseX > 363 && mouseX < 363 + 106
					&& mouseY > 48 && mouseY < 48 + 10) // 	InitialScreen Button 
				schange = 3;
			
			if (mouseX > 256 && mouseX < 256 + 17
					&& mouseY > 48 && mouseY < 48 + 10) // 	Option Button (por si acaso)
				schange = 3;
			
			if (mouseX > 600 && mouseX < 600 + 100
					&& mouseY > 627 && mouseY < 627 + 28) // 	Cancel Button
				schange = 3; //CAMBIAR
			
			break;
			
		case 6: 

			if (mouseX > 825 && mouseX < 825 + 65
					&& mouseY > 48 && mouseY < 48 + 10) // 	Contacts Button
				schange = 3;
			
			if (mouseX > 975 && mouseX < 975 + 45
					&& mouseY > 48 && mouseY < 48 + 10) // Login Button
				schange = 1;
			
			if (mouseX > 1096 && mouseX < 1096 + 82
					&& mouseY > 48 && mouseY < 48 + 10) // Register
				schange = 2;

			if (mouseX > 543 && mouseX < 543 + 47
					&& mouseY > 48 && mouseY < 48 + 10) // 	About Button ( por si acaso )
				schange = 3;
			
			if (mouseX > 363 && mouseX < 363 + 106
					&& mouseY > 48 && mouseY < 48 + 10) // 	InitialScreen Button 
				schange = 3;
			
			if (mouseX > 256 && mouseX < 256 + 17
					&& mouseY > 48 && mouseY < 48 + 10) // 	Option Button (por si acaso)
				schange = 3;
			
			break;
			
		case 7:

			
			break;
			
		case 8: 

			if (mouseX > 825 && mouseX < 825 + 65
					&& mouseY > 48 && mouseY < 48 + 10) // 	Contacts Button
				schange = 3;
			
			if (mouseX > 975 && mouseX < 975 + 45
					&& mouseY > 48 && mouseY < 48 + 10) // Login Button
				schange = 1;
			
			if (mouseX > 1096 && mouseX < 1096 + 82
					&& mouseY > 48 && mouseY < 48 + 10) // Register
				schange = 2;

			if (mouseX > 543 && mouseX < 543 + 47
					&& mouseY > 48 && mouseY < 48 + 10) // 	About Button ( por si acaso )
				schange = 3;
			
			if (mouseX > 363 && mouseX < 363 + 106
					&& mouseY > 48 && mouseY < 48 + 10) // 	InitialScreen Button 
				schange = 3;
			
			if (mouseX > 256 && mouseX < 256 + 17
					&& mouseY > 48 && mouseY < 48 + 10) // 	Option Button (por si acaso)
				schange = 3;
			
			if (mouseX > 1123 && mouseX < 1123 + 115
					&& mouseY > 547 && mouseY < 547 + 31) // 	Payment Button
				schange = 3; //CAMBIAR
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
