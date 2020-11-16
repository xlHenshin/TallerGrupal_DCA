package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.ControlNewContact;
import processing.core.PApplet;


public class NewContactScreen extends ScreenFather {

	private int change = 6;
	private ControlNewContact controlnewcontact;
	private String[] inputs;
	private String firstName, email, nationality, lastName, age, cellphoneNumber;
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
		inputs [1] = "Last Name";
		inputs [2] = "Email";
		inputs [3] = "Age";
		inputs [4] = "Nationality";
		inputs [5] = "Cellphone Number";

	
		
		for (int i = 0; i < inputs.length; i++) {

			cp5.addTextfield(inputs[i]).setPosition((app.width / 2) - 118, 329 + (i * 47)).setSize(235, 35)
			.setAutoClear(true);
		}

	}

	public void getContactInfo() {

		if (app.mouseX > 940 && app.mouseX < 940 + 190
				&& app.mouseY > 55 && app.mouseY < 555 + 40) {
			System.out.println("Click on btn");
			
			cp5.hide();

			firstName = cp5.get(Textfield.class, "First Name").getText();
			lastName = cp5.get(Textfield.class, "Last Name").getText();
			email = cp5.get(Textfield.class, "Email").getText();
			age = cp5.get(Textfield.class, "Age").getText();
			nationality = cp5.get(Textfield.class, "Nationality").getText();
			cellphoneNumber = cp5.get(Textfield.class, "Cellphone Number").getText();

			controlnewcontact.getContactInfo(firstName,lastName, email,age, nationality, cellphoneNumber);

			cp5.get(Textfield.class, "First Name").setText("");
			cp5.get(Textfield.class, "Last Name").setText("");
			cp5.get(Textfield.class, "Email").setText("");
			cp5.get(Textfield.class, "Age").setText("");
			cp5.get(Textfield.class, "Nationality").setText("");
			cp5.get(Textfield.class, "Cellphone Number").setText("");
		}
	}

public void button () {
	
	
	if (app.mouseX > 647 && app.mouseX < 647 + 137
			&& app.mouseY > 40 && app.mouseY < 40 + 19) { // 	InitialScreen Button 
		change = 0;
	}
	if (app.mouseX > 825 && app.mouseX < 825 + 65
			&& app.mouseY > 40 && app.mouseY < 40 + 19) { // 	Contacts Button
		change = 3;
	}
	if (app.mouseX > 975 && app.mouseX < 975 + 45
			&& app.mouseY > 40 && app.mouseY < 40 + 19) { // Login Button
		change = 1;
	}
	if (app.mouseX > 1096 && app.mouseX < 1096 + 82
			&& app.mouseY > 40 && app.mouseY < 40 + 19) { // Register
		change = 2;
	}
	if (app.mouseX > 941 && app.mouseX < 941 + 192
			&& app.mouseY > 556 && app.mouseY < 556 + 42) { // create contact
		change = 3;
	}
	
	if (app.mouseX > 940 && app.mouseX < 940 + 190
			&& app.mouseY > 55 && app.mouseY < 555 + 40)
		change=3;
}


public int getChange() {
	return change;
}
public void setChange(int change) {
	this.change = change;
}



}
