package controller;

import java.util.LinkedList;

import model.Contact;
import model.Logic;
import processing.core.PApplet;

public class ControlContact {

	private PApplet app;
	private Logic logic;
	
	public ControlContact(PApplet app) {
		
		this.app=app;
		logic = Logic.getInstance();
	}
	
	public LinkedList<Contact> contactList(){
		return logic.getContactList();
		
	}
	
}
