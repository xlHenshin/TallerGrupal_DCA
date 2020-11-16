package controller;

import model.Logic;

public class ControlBuy {

	private Logic logic;
	
	public ControlBuy() {
		
		logic = Logic.getInstance();
	}
	
	
	public void getCardInfo(String cardholder, String cardnumber, String mm, String yy, String cvv) {
		
		logic.buyCreditForm(cardholder, cardnumber, mm, yy, cvv);
	}

}
