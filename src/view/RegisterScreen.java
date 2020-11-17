package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.ControlRegis;
import processing.core.PApplet;

public class RegisterScreen extends ScreenFather {

	private int change = 2;
	
	private ControlRegis controlregis;
	private String[] inputs;
	private String firstName, lastName, email, password, nacionality, cellphoneNumber;
	private PApplet app;
	private ControlP5 cp5;
	
	public RegisterScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/registration.png");
		this.app=app;
		
		controlregis= new ControlRegis();
		cp5 = new ControlP5(app);
		
		inputs = new String [6];

		inputs [0] = "First Name";
		inputs [1] = "Last Name";
		inputs [2] = "Email";
		inputs [3] = "Password";
		inputs [4] = "Nacionality";
		inputs [5] = "Cellphone Number";
		
		cp5.hide();
		
		cp5.addTextfield(inputs[0]).setPosition((app.width / 2) - 100, 364).setSize(235, 35).setAutoClear(true)
		.setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));
		
		cp5.addTextfield(inputs[1]).setPosition((app.width / 2) - -170, 364).setSize(235, 35).setAutoClear(true)
		.setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));
		
		cp5.addTextfield(inputs[2]).setPosition((app.width / 2) - 100, 430).setSize(235, 35).setAutoClear(true)
		.setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));
		
		cp5.addTextfield(inputs[3]).setPosition((app.width / 2) - -170, 430).setSize(235, 35).setAutoClear(true)
		.setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));
		
		cp5.addTextfield(inputs[4]).setPosition((app.width / 2) - 100, 497).setSize(235, 35).setAutoClear(true)
		.setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));
		
		cp5.addTextfield(inputs[5]).setPosition((app.width / 2) - -170, 497).setSize(235, 35).setAutoClear(true)
		.setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));
			
		}
	
	public void getUserInfo() {
		
		if (app.mouseX > 940 && app.mouseX < 940 + 190
				&& app.mouseY > 555 && app.mouseY < 555 + 40) {
			System.out.println("presionado get RS");
			
			cp5.hide();

			firstName = cp5.get(Textfield.class, "First Name").getText();
			lastName = cp5.get(Textfield.class, "Last Name").getText();
			email = cp5.get(Textfield.class, "Email").getText();
			password = cp5.get(Textfield.class, "Password").getText();
			nacionality = cp5.get(Textfield.class, "Nacionality").getText();
			cellphoneNumber = cp5.get(Textfield.class, "Cellphone Number").getText();

			controlregis.getUserInfo(firstName, lastName, email, password, nacionality, cellphoneNumber);

			cp5.get(Textfield.class, "First Name").setText("");
			cp5.get(Textfield.class, "Last Name").setText("");
			cp5.get(Textfield.class, "Email").setText("");
			cp5.get(Textfield.class, "Password").setText("");
			cp5.get(Textfield.class, "Nacionality").setText("");
			cp5.get(Textfield.class, "Cellphone Number").setText("");
		}
	}

	public void button() {
		if (app.mouseX > 647 && app.mouseX < 647 + 137
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // 	InitialScreen Button 
			System.out.println("presionado landing RS");
			change = 0;
		}
		if (app.mouseX > 825 && app.mouseX < 825 + 65
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // 	Contacts Button
			System.out.println("presionado con RS");
			//change = 3;
		}
		if (app.mouseX > 975 && app.mouseX < 975 + 45
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // Login Button
			System.out.println("presionado log RS");
			//change = 1;
	}
		if (app.mouseX > 1096 && app.mouseX < 1096 + 82
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // Register
			System.out.println("presionado reg RS");
			//change = 2;
		}
		if (app.mouseX > 940 && app.mouseX < 940 + 190
				&& app.mouseY > 555 && app.mouseY < 555 + 40) {
			System.out.println("presionado register RS");
			//change = 1;
	}
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}
	public void mostrarP5() {
		cp5.show();
	}

}
