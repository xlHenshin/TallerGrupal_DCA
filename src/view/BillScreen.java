package view;

import processing.core.PApplet;

/**
 * Esta clase contiene métodos para
 * el funcionamiento de la pantalla de Bill
 * @author Andrés Burgos, Cristian Mendez, Angélica Cruz
 */

public class BillScreen extends ScreenFather{

	private int change=0;
	
	/**
	 * Constructor de la clase
	 * @param posY 
	 * @param app
	 */
	
	public BillScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/Bill.png");
	}
	
	/**
	 *  Método donde se crean los botones de la clase
	 */
	public void button() {
		
		System.out.println("presionado bill");
		if (app.mouseX > 647 && app.mouseX < 647 + 137
				&& app.mouseY > 40 && app.mouseY < 40 + 19) // 	InitialScreen Button 
			change = 0;
		
		if (app.mouseX > 825 && app.mouseX < 825 + 65
				&& app.mouseY > 40 && app.mouseY < 40 + 19) // 	Contacts Button
			change = 3;
		
		if (app.mouseX > 975 && app.mouseX < 975 + 45
				&& app.mouseY > 40 && app.mouseY < 40 + 19) // Login Button
			change = 1;
		
		if (app.mouseX > 1096 && app.mouseX < 1096 + 82
				&& app.mouseY > 40 && app.mouseY < 40 + 19) // Register
			change = 2;
		if (app.mouseX > 673 && app.mouseX < 673 + 101
				&& app.mouseY > 586 && app.mouseY < 586 + 28) // 	Cancel Button
			change = 0;
		if (app.mouseX > 797 && app.mouseX < 797 + 154
				&& app.mouseY > 586 && app.mouseY < 586 + 28) // 	total Button
			change = 7;
	}
	
	/**
	 * Método para cambiar el estado del switch
	 * @return retorna la variable corresponiente Change
	 */
	public int getChange() {
		return change;
	}
	
	/**
	 * Método que permite que la variable change tome el valor
	 * que haya por entrada en el método
	 * @param change
	 */
	public void setChange(int change) {
		this.change = change;
	}
	
}
