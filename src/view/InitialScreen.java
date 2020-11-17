package view;

import processing.core.PApplet;
import processing.core.PImage;

public class InitialScreen extends ScreenFather{

	private int change = 0;
	
	private int ticketOne=0;
	private int ticketTwo=0;
	private int ticketThree=0;
	
	private boolean tOne=false;
	private boolean tTwo=false;
	private boolean tThree=false;
	
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
	
	public void packageOne() {
		if (app.mouseX > 938 && app.mouseX < 938 + 14
				&& app.mouseY > 1500 + posY && app.mouseY < 1500 + 14 + posY) { //Aumentar tickets
				
				if (ticketOne >= 3) {
					System.out.println("Only Three tickets are allowed");
				} else {
					ticketOne+=1;
				}
				
				System.out.println(ticketOne);
		}
		
		if (app.mouseX > 990 && app.mouseX < 990 + 14
				&& app.mouseY > 1500 + posY && app.mouseY < 1500 + 14 + posY) { //Disminuir tickets
			
			if (ticketOne <= 0) {
				System.out.println("Add a ticket");
			} else {
				ticketOne-=1;
			}
			
			System.out.println(ticketOne);
		}
		
		if (app.mouseX > 1056 && app.mouseX < 1056 + 128
				&& app.mouseY > 1468 + posY && app.mouseY < 1468 + 65 + posY) { // 	buy now Button 
			if (ticketOne==0) {
				
				System.out.println("Add a ticket to buy");
			}else {
				
				tOne = true;
				change = 8;
			}
			
			}
		}
	
	public void packageTwo() {
		
		if (app.mouseX > 381 && app.mouseX < 381 + 14
				&& app.mouseY > 2886 + posY && app.mouseY < 2886 + 14 + posY) { //Aumentar tickets
			
			if (ticketTwo >= 3) {
				System.out.println("Only Three tickets are allowed");
			} else {
				ticketTwo+=1;
			}
			
			System.out.println(ticketTwo);
		}
		
		if (app.mouseX > 434 && app.mouseX < 434 + 14
				&& app.mouseY > 2886 + posY && app.mouseY < 2886 + 14 + posY) { //Disminuir tickets
			
			if (ticketTwo <= 0) {
				System.out.println("Add a ticket");
			} else {
				ticketTwo-=1;
			}
			
			System.out.println(ticketTwo);
		}
		
		if (app.mouseX > 501 && app.mouseX < 501 + 128
				&& app.mouseY > 2854 + posY && app.mouseY < 2854 + 65 + posY) { // 	buy now Button 
			
			if (ticketTwo==0) {
				
				System.out.println("Add a ticket to buy");
			}else {
				
				tTwo = true;
				change = 8;
			}
			
		}
	}
	
	public void packageThree() {
		
		if (app.mouseX > 997 && app.mouseX < 997 + 14
				&& app.mouseY > 3879 + posY && app.mouseY < 3879 + 14 + posY) { //Aumentar tickets
			
			if (ticketThree >= 3) {
				System.out.println("Only Three tickets are allowed");
			} else {
				ticketThree+=1;
			}
			
			System.out.println(ticketThree);
		}
		
		if (app.mouseX > 1050 && app.mouseX < 1050 + 14
				&& app.mouseY > 3879 + posY && app.mouseY < 3879 + 14 + posY) { //Disminuir tickets
			if (ticketThree <= 0) {
				System.out.println("Add a ticket");
			} else {
				ticketThree-=1;
			}
			
			System.out.println(ticketThree);
		}
		
		if (app.mouseX > 1091 && app.mouseX < 1091 + 128
				&& app.mouseY > 3846 + posY && app.mouseY < 3846 + 65 + posY) { // 	buy now Button 
			
			if (ticketThree==0) {
				
				System.out.println("Add a ticket to buy");
			}else {
				
				tThree = true;
				change = 8;
			}
		}
	}
	
	public void button() {
		//System.out.println("presionado initial");
		
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
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

	public int getTicketOne() {
		return ticketOne;
	}

	public void setTicketOne(int ticketOne) {
		this.ticketOne = ticketOne;
	}

	public int getTicketTwo() {
		return ticketTwo;
	}

	public void setTicketTwo(int ticketTwo) {
		this.ticketTwo = ticketTwo;
	}

	public int getTicketThree() {
		return ticketThree;
	}

	public void setTicketThree(int ticketThree) {
		this.ticketThree = ticketThree;
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
	
	
	
	}

