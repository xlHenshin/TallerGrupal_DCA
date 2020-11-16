package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.ControlBuy;
import processing.core.PApplet;

public class BuyScreen extends ScreenFather{

	private ControlBuy controlbuy;
	private String [] input;
	private String cardholder, cardnumber, mm, yy, cvv;
	private ControlP5 cp5;
	
	public BuyScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/payment.png");	
		this.app=app;
		
		controlbuy = new ControlBuy();
		cp5 = new ControlP5(app);
		input = new String [5];
		
		input [0] = "Cardholder Name";
		input [1] = "Card Number";
		input [2] = "MM";
		input [3] = "YY";
		input [4] = "CVV";
		
		for (int i = 0; i < input.length; i++) {
			cp5.addTextfield(input[i]).setPosition((app.width / 2) - 118, 329 + (i * 47)).setSize(235, 35)
					.setAutoClear(true);
		}
	}
	
	public void getCardInfo() {
		
		if (app.mouseX > 720 && app.mouseX < 720 + 122
				&& app.mouseY > 625 && app.mouseY < 625 + 27) {
			System.out.println("Click on btn");
			
			cardholder = cp5.get(Textfield.class, "Carholder Name").getText();
			cardnumber = cp5.get(Textfield.class, "Card Number").getText();
			mm = cp5.get(Textfield.class, "MM").getText();
			yy = cp5.get(Textfield.class, "YY").getText();
			cvv = cp5.get(Textfield.class, "CVV").getText();
			
			controlbuy.getCardInfo(cardholder, cardnumber, mm, yy, cvv);
			
			cp5.get(Textfield.class, "Carholder Name").setText("");
			cp5.get(Textfield.class, "Card Number").setText("");
			cp5.get(Textfield.class, "MM").setText("");
			cp5.get(Textfield.class, "YY").setText("");
			cp5.get(Textfield.class, "CVV").setText("");
		}
	}

	
	
}
