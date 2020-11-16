package view;

import java.util.LinkedList;

import controller.ControlContact;
import model.Contact;
import processing.core.PApplet;

public class ContactScreen extends ScreenFather {

	private ControlContact controlcontact;
	
	private int change=3;
	public ContactScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/contacts.png");
		
		controlcontact= new ControlContact(this.app);
	}
	
	public LinkedList<Contact> contactList(){
		return controlcontact.contactList();
	}
	
	public void sortList() {
		
		if (app.mouseX > 646 && app.mouseX < 646 + 84
				&& app.mouseY > 324 && app.mouseY < 324 + 16) { // 	SortBy First Name
			controlcontact.sortName();
		}
		
		if (app.mouseX > 742 && app.mouseX < 742 + 84
				&& app.mouseY > 324 && app.mouseY < 324 + 16) { // 	SortBy Last Name
			
		}
		
		if (app.mouseX > 835 && app.mouseX < 835 + 50
				&& app.mouseY > 324 && app.mouseY < 324 + 16) { // 	SortBy Email
			
		}
		
		if (app.mouseX > 898 && app.mouseX < 898 + 50
				&& app.mouseY > 324 && app.mouseY < 324 + 16) { // 	SortBy Age
			
		}
		
		if (app.mouseX > 968 && app.mouseX < 968 + 84
				&& app.mouseY > 324 && app.mouseY < 324 + 16) { // 	SortBy Nationality
			
		}
		
		if (app.mouseX > 1056 && app.mouseX < 1056 + 125
				&& app.mouseY > 324 && app.mouseY < 324 + 16) { // 	SortBy Cellphone Number
			
		}
		
	}
	
	public void button() {
		if (app.mouseX > 647 && app.mouseX < 647 + 137
				&& app.mouseY > 40 && app.mouseY < 40 + 19) {// 	InitialScreen Button 
			change = 0;
		}
		if (app.mouseX > 825 && app.mouseX < 825 + 65
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // 	Contacts Button
			
			change = 3;
		}
			
		if (app.mouseX > 975 && app.mouseX < 975 + 45
				&& app.mouseY > 40 && app.mouseY < 40 + 19) // Login Button
			change = 1;
		
		if (app.mouseX > 1096 && app.mouseX < 1096 + 82
				&& app.mouseY > 40 && app.mouseY < 40 + 19) {// Register
				
			change = 2;
		}
			
		
		if (app.mouseX > 647 && app.mouseX < 647 + 137
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // 	InitialScreen Button 
			
			change = 5;
		}
		
		if (app.mouseX > 646 && app.mouseX < 646 + 194
				&& app.mouseY > 605 && app.mouseY < 605 + 45) { // 	NewContact Button 
			
			change = 6;
		}
	}
	
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	
}
