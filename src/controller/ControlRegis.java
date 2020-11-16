package controller;

import model.Logic;

public class ControlRegis {

	private Logic logic;
	
	public ControlRegis() {
	
		logic= Logic.getInstance();
	}
	
	public void getUserInfo(String firstName, String lastName, String email, String password, String nationality,
			String cellphoneNumber) {
		
		logic.newUserForm(firstName, lastName, email, password, nationality, cellphoneNumber);
	}

}
