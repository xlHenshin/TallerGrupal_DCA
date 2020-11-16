package model;

import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic extends PApplet {

	private LinkedList<Contact> contactList;
	private ArrayList<User> userList;
	private ArrayList<Package> packageList;
	private ArrayList<Package> buyList;
	
	private static PApplet app;
	
	private static Logic unicaInstance;
	
	private Logic(PApplet app) {
		Logic.app = app;
		userList = new ArrayList<User>();
		contactList = new LinkedList<Contact>();
		
		User cristian= new User("Cristian", "Mendez", "crisdamencast@gmail.com", "12345", "Colombiano", "1234567", app);
		userList.add(cristian);
		
		Contact elon= new Contact("Elon", "Musk", "espeiseks@egomusk.com", "49", "Sudafricano", "00000", app);
		Contact amber= new Contact("Amber", "Heard", "johnnydepp@gmail.com", "34", "Estadounidense", "11111", app);
		Contact cara= new Contact("Cara", "Delevigne", "trioespacial@gmail.com", "28", "Inglesa", "22222", app);
		
		contactList.add(elon);
		contactList.add(amber);
		contactList.add(cara);
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
	
	
	public void newContactForm(String firstName, String lastName, String email, String age, String nationality,
			String cellphoneNumber) {
		
		Contact newContact = new Contact(firstName, lastName, email, age, nationality, cellphoneNumber, app);
		contactList.add(newContact);
		
		for(int i = 0; i<contactList.size();i++) {
			
			System.out.println(">>>>>>>>><<<<<<<<<<");
			System.out.println(contactList.get(i).getName());
			System.out.println(contactList.get(i).getLastName());
			System.out.println(contactList.get(i).getMail());
			System.out.println(contactList.get(i).getAge());
			System.out.println(contactList.get(i).getNationality());
			System.out.println(contactList.get(i).getCellNumber());
			System.out.println(">>>>>>>>><<<<<<<<<<");
		}
	}
	
	public void writeArray() {
		
	}

	public LinkedList<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(LinkedList<Contact> contactList) {
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
