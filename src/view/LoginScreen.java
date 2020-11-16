package view;

import controlP5.ControlP5;
import controller.ControlLogin;
import processing.core.PApplet;

public class LoginScreen extends ScreenFather{

	private int change=1;
	
	private ControlLogin controllogin;
	private String[] inputs;
	private String email, password;
	private PApplet app;
	private ControlP5 cp5;
	
	public LoginScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/login.png");
		this.app=app;
		cp5 = new ControlP5(app);
		
		controllogin= new ControlLogin();
		
		inputs = new String [2];
		
		inputs [0] = "Email";
		inputs [1] = "Password";
		
		cp5.hide();
		for (int i = 0; i < inputs.length; i++) {
			cp5.addTextfield(inputs[i]).setPosition((app.width / 2) - -120, 364 + (i * 77)).setSize(334, 45)
					.setAutoClear(true);
		}
	}
	
	public void mostrarP5() {
		cp5.show();
	}
	
	public void button() {
		if (app.mouseX > 647 && app.mouseX < 647 + 137
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // 	InitialScreen Button 
			change = 0;
			cp5.hide();
		}
		if (app.mouseX > 825 && app.mouseX < 825 + 65
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // 	Contacts Button
			change = 3;
			cp5.hide();
		}
		if (app.mouseX > 975 && app.mouseX < 975 + 45
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // Login Button
			change = 1;
			cp5.hide();
		}
		if (app.mouseX > 1096 && app.mouseX < 1096 + 82
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // Register
			change = 2;
			cp5.hide();
		}
		if (app.mouseX > 1048 && app.mouseX < 1048 + 128
				&& app.mouseY > 534 && app.mouseY < 534 + 50) { // 	InitialScreen Button 
			change = 0;
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
