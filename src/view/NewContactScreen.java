package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.ControlBuy;
import controller.ControlNewContact;
import processing.core.PApplet;


public class NewContactScreen extends ScreenFather {

	private ControlNewContact controlnewcontact;
	private String[] inputs;
	private String firstName, email, nacionality, lastName, age, cellphoneNumber;
	private PApplet app;
	private ControlP5 cp5;

	public NewContactScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/newcontact.png");
		this.app=app;

		controlnewcontact = new ControlNewContact();
		cp5 = new ControlP5(app);
		inputs = new String [6];

		inputs [0] = "First Name";
		inputs [1] = "Email";
		inputs [2] = "Nacionality";
		inputs [3] = "Last Name";
		inputs [4] = "Age";
		inputs [5] = "Cellphone Number";

		for (int i = 0; i < inputs.length; i++) {

			cp5.addTextfield(inputs[i]).setPosition((app.width / 2) - 118, 329 + (i * 47)).setSize(235, 35)
			.setAutoClear(true);
		}

	}

	public void getUserInfo() {

		if (app.mouseX > 720 && app.mouseX < 720 + 122
				&& app.mouseY > 625 && app.mouseY < 625 + 27) {
			System.out.println("Click on btn");

			firstName = cp5.get(Textfield.class, "First Name").getText();
			email = cp5.get(Textfield.class, "Email").getText();
			nacionality = cp5.get(Textfield.class, "Nacionality").getText();
			lastName = cp5.get(Textfield.class, "Last Name").getText();
			age = cp5.get(Textfield.class, "Age").getText();
			cellphoneNumber = cp5.get(Textfield.class, "Cellphone Number").getText();

			controlnewcontact.getUserInfo(firstName, email, nacionality, lastName, age, cellphoneNumber);

			cp5.get(Textfield.class, "Carholder Name").setText("");
			cp5.get(Textfield.class, "Card Number").setText("");
			cp5.get(Textfield.class, "MM").setText("");
			cp5.get(Textfield.class, "YY").setText("");
			cp5.get(Textfield.class, "CVV").setText("");
		}
	}



}
