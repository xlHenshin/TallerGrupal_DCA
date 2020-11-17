package controller;

import java.util.ArrayList;

import model.Logic;
import model.Package;

public class ControlBuy {

	private Logic logic;
	
	public ControlBuy() {
		
		logic = Logic.getInstance();
	}
	public ArrayList<Package> getPackageList() {
		return logic.getPackageList();
	}
}
