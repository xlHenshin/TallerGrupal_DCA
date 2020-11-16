package controller;

import model.Logic;

public class ControlNewContact {

	private Logic logic;
	
	public ControlNewContact() {
		
		logic = Logic.getInstance();
	}
	
	
	public void getUserInfo(String firstName, String email, String nacionality, String lastName, String age, String cellphoneNumber) {
		
		logic.newContactForm(firstName, email, nacionality, lastName, age, cellphoneNumber);
	}

}

