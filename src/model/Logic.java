package model;

import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic extends PApplet {

	private LinkedList<Person> contactList;
	private ArrayList<Person> userList;
	private ArrayList<Package> packageList;
	private ArrayList<Package> buyList;
	private static PApplet app;
	
	private static Logic unicaInstance;
	
	private Logic(PApplet app) {
		Logic.app = app;
	}
	
	public static Logic getInstance() {
		if(unicaInstance == null) {
			unicaInstance = new Logic(app);
		}
		return unicaInstance;
	}

	
	public void drawPackages() {
		
	}
	
	public void buttonPressed() {
		
	}
	
	public void logic() {
		
	}
	
	public void newUserForm() {
		
	}
	
	
	public void newContactForm() {
		
	}
	
	public void writeArray() {
		
	}

	public LinkedList<Person> getContactList() {
		return contactList;
	}

	public void setContactList(LinkedList<Person> contactList) {
		this.contactList = contactList;
	}

	public ArrayList<Person> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<Person> userList) {
		this.userList = userList;
	}

	public ArrayList<Package> getPackageList() {
		return packageList;
	}

	public void setPackageList(ArrayList<Package> packageList) {
		this.packageList = packageList;
	}

	public ArrayList<Package> getBuyList() {
		return buyList;
	}

	public void setBuyList(ArrayList<Package> buyList) {
		this.buyList = buyList;
	}

	
	
	
}
