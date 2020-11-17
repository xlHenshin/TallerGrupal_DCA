package controller;

import java.util.ArrayList;

import model.Logic;
import model.User;

public class ControlLogin {

private Logic logic;
	
	public ControlLogin() {
	
		logic= Logic.getInstance();
	}
	
	public ArrayList<User> getUserList() {
		return logic.getUserList();
	}
	
}
