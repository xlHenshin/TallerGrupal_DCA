package model;

import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic extends PApplet {

	private LinkedList<Person> contactList;
	private ArrayList<User> userList;
	private ArrayList<Package> packageList;
	private ArrayList<Package> buyList;
	
	private static PApplet app;
	
	private static Logic unicaInstance;
	
	private Logic(PApplet app) {
		Logic.app = app;
		userList = new ArrayList<User>();
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
	
	public void newUserForm(String firstName, String lastName, String email, String password, String nationality,
			String cellphoneNumber) {
		User newUser = new User(firstName, lastName, email, password, nationality, cellphoneNumber, app);
		userList.add(newUser);
		
		for(int i = 0; i<userList.size();i++) {
			
			System.out.println(">>>>>>>>><<<<<<<<<<");
			System.out.println(userList.get(i).getName());
			System.out.println(userList.get(i).getLastName());
			System.out.println(userList.get(i).getPassword());
			System.out.println(userList.get(i).getMail());
			System.out.println(userList.get(i).getNationality());
			System.out.println(userList.get(i).getCellNumber());
			System.out.println(">>>>>>>>><<<<<<<<<<");
		}
	}
	
	
	public void newContactForm(String firstName, String email, String nacionality, String lastName, String age, String cellphoneNumber) {
		
	}
	
	public void writeArray() {
		
	}

	public LinkedList<Person> getContactList() {
		return contactList;
	}

	public void setContactList(LinkedList<Person> contactList) {
		this.contactList = contactList;
	}

	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
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
