package controller;

import model.Logic;

public class ControlNewContact {

	private Logic logic;
	
	public ControlNewContact() {
		
		logic = Logic.getInstance();
	}

	public void getContactInfo(String firstName, String lastName, String email, String age, String nationality,
			String cellphoneNumber) {
		
		logic.newContactForm(firstName, lastName, email, age, nationality, cellphoneNumber);
	}

}

