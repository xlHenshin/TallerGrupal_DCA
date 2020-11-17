package view;

import controller.ControlBuy;
import processing.core.PApplet;

public class ShoppingScreen extends ScreenFather {

	private ControlBuy controlbuy;
	private int change=0;
	private boolean tOne=false;
	private boolean tTwo=false;
	private boolean tThree=false;
	
	private int ticketCase=0;
	
	public ShoppingScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/shoppingcart.png");
		controlbuy= new ControlBuy();
		}
	
	public void checkTicket() {
		
		
		
		if (tOne==true) {
			
			ticketCase=1;
		}
		
		if (tTwo==true) {
			
			ticketCase=2;
		}

		if (tThree==true) {
			
			ticketCase=3;
		}
		
	}
	
	public void paintTicket() {
		
		switch (ticketCase) {
		case 1:
			for (int i = 0; i < controlbuy.getPackageList().size(); i++) {
				if (controlbuy.getPackageList().get(i).getName().equals("Moon")) {
					controlbuy.getPackageList().get(i).drawData(815, 414, app);
				}
			}
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;

		default:
			break;
		}
		
	}
	
	public void button() {
		System.out.println("presionado Shopping");
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

	public boolean istOne() {
		return tOne;
	}

	public void settOne(boolean tOne) {
		this.tOne = tOne;
	}

	public boolean istTwo() {
		return tTwo;
	}

	public void settTwo(boolean tTwo) {
		this.tTwo = tTwo;
	}

	public boolean istThree() {
		return tThree;
	}

	public void settThree(boolean tThree) {
		this.tThree = tThree;
	}

	public int getTicketCase() {
		return ticketCase;
	}

	public void setTicketCase(int ticketCase) {
		this.ticketCase = ticketCase;
	}	
	
}