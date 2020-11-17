package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.ControlNewContact;
import processing.core.PApplet;

/**
 * Esta clase contiene métodos para
 * el funcionamiento de la pantalla de New Contacts 
 * @author Andrés Burgos, Cristian Mendez, Angélica Cruz
 *
 */


public class NewContactScreen extends ScreenFather {

	private int change = 6;
	private ControlNewContact controlnewcontact;
	private String[] inputs;
	private String firstName, email, nationality, lastName, age, cellphoneNumber;
	private PApplet app;
	private ControlP5 cp5;

	
	/**Constructor
	 * @param posY
	 * @param app
	 */
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

	
		cp5.hide();
		

		cp5.addTextfield(inputs[0]).setPosition((app.width / 2) - 100, 350).setSize(235, 48).setAutoClear(true)
		.setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));
		
		cp5.addTextfield(inputs[1]).setPosition((app.width / 2) - -170, 350).setSize(235, 48).setAutoClear(true)
		.setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));
		
		cp5.addTextfield(inputs[2]).setPosition((app.width / 2) - 100, 418).setSize(235, 48).setAutoClear(true)
		.setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));
		
		cp5.addTextfield(inputs[3]).setPosition((app.width / 2) - -170, 418).setSize(235, 48).setAutoClear(true)
		.setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));
		
		cp5.addTextfield(inputs[4]).setPosition((app.width / 2) - 100, 485).setSize(235, 48).setAutoClear(true)
		.setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));
		
		cp5.addTextfield(inputs[5]).setPosition((app.width / 2) - -170, 485).setSize(235, 48).setAutoClear(true)
		.setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));

	}

	/**
	 * Método que llama al constructor del contacto
	 * para que las variables definidas en la pantalla 
	 * de New Contact permitan crear un contacto nuevo
	 */
	public void getContactInfo() {

		if (app.mouseX > 940 && app.mouseX < 940 + 190
				&& app.mouseY > 555 && app.mouseY < 555 + 40) {
			System.out.println("presionado newContact");
			System.out.println("Click on btn");

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
	
	public void mostrarP5() {
		cp5.show();
	}

public void button () {
	System.out.println("presionado newContact");
	if (app.mouseX > 647 && app.mouseX < 647 + 137
			&& app.mouseY > 40 && app.mouseY < 40 + 19) { // 	InitialScreen Button 
		System.out.println("presionado IS");
		change = 0;
		cp5.hide();
	}
	if (app.mouseX > 825 && app.mouseX < 825 + 65
			&& app.mouseY > 40 && app.mouseY < 40 + 19) { // 	Contacts Button
		System.out.println("presionado Con");
		change = 3;
		cp5.hide();
	}
	if (app.mouseX > 975 && app.mouseX < 975 + 45
			&& app.mouseY > 40 && app.mouseY < 40 + 19) { // Login Button
		System.out.println("presionado log");
		change = 1;
		cp5.hide();
	}
	if (app.mouseX > 1096 && app.mouseX < 1096 + 82
			&& app.mouseY > 40 && app.mouseY < 40 + 19) { // Register
		System.out.println("presionado reg");
		change = 2;
		cp5.hide();
	}
	
	if (app.mouseX > 940 && app.mouseX < 940 + 190
			&& app.mouseY > 555 && app.mouseY < 555 + 40) {	// create contact
		System.out.println("presionado cc");
		change=3;
		cp5.hide();
	}
		
	
}

public int getChange() {
	return change;
}
public void setChange(int change) {
	this.change = change;
}



}
