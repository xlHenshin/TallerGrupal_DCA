package view;



import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;

public class BuyScreen extends ScreenFather{

	private int change=5;
	private String [] input;
	private String cardholder, mm, yy, cvv,cardnumber;
	private ControlP5 cp5;
	private boolean resultado;
	private boolean error=false;
	private boolean errorLength = false;

	public BuyScreen(float posY, PApplet app) {
		super(posY, app);
		screen = app.loadImage("../resources/payment.png");
		this.app=app;

		cp5 = new ControlP5(app);
		input = new String [5];

		input [0] = "Cardholder Name";
		input [1] = "Card Number";
		input [2] = "MM";
		input [3] = "YY";
		input [4] = "CVV";
		
		cp5.hide();
		
		for (int i = 0; i < input.length; i++) {
			cp5.addTextfield(input[i]).setPosition((app.width / 2) - 118, 329 + (i * 47)).setSize(235, 35)
			.setAutoClear(true).setColorBackground(color(255,255,255)).setColorLabel(color(0)).setColorActive(color(0)).setColorValueLabel(color(0));
		}	
	}

	/*public void getCardInfo() {

		if (app.mouseX > 720 && app.mouseX < 720 + 122
				&& app.mouseY > 625 && app.mouseY < 625 + 27) {
			System.out.println("Click on btn");

		cp5.hide();

		}
	}*/

public void button() {
		System.out.println("lloro");
		if (app.mouseX > 647 && app.mouseX < 647 + 137
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // 	InitialScreen Button 
			System.out.println("presionado IS BS");
			change = 0;
			cp5.hide();
			error = false;
		}
		if (app.mouseX > 825 && app.mouseX < 825 + 65
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // 	Contacts Button
			System.out.println("presionado Con BS");
			//change = 3;
			//cp5.hide();
			//error = false;
		}
		if (app.mouseX > 975 && app.mouseX < 975 + 45
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // Login Button
			System.out.println("presionado log BS");
			//change = 1;
			//cp5.hide();
			//error = false;
		}
		if (app.mouseX > 1096 && app.mouseX < 1096 + 82
				&& app.mouseY > 40 && app.mouseY < 40 + 19) { // Register
			System.out.println("presionado reg BS");
			//change = 2;
			//cp5.hide();
			//error = false;
		}
		if (app.mouseX > 719 && app.mouseX < 719 + 121
				&& app.mouseY > 626 && app.mouseY < 626 + 28) {
			System.out.println("presionado check BS");
			cardholder = cp5.get(Textfield.class, "Cardholder Name").getText();
			cardnumber = cp5.get(Textfield.class, "Card Number").getText();
			mm = cp5.get(Textfield.class, "MM").getText();
			yy = cp5.get(Textfield.class, "YY").getText();
			cvv = cp5.get(Textfield.class, "CVV").getText();
			System.out.println("presionado");
				if (isString(cardholder) && isNumeric(cardnumber) && isNumeric(mm) &&
						isNumeric(yy)  && isNumeric(cvv)) {
					if (cardnumber.length() == 16 && mm.length() == 2 && yy.length() == 4
							&& cvv.length() == 3) {
						System.out.println("presionado");
						change = 4;
						cp5.hide();
						error = false;
						errorLength = false;
					}
					else {
						errorLength = true;
						error = true;
					}	
				}
				else {
					error = true;
				}
			}
		

		if (app.mouseX > 600 && app.mouseX < 600 + 100
				&& app.mouseY > 626 && app.mouseY < 626 + 28) {// 	cancel Button 
			System.out.println("presionado cancel BS");
			change = 0;
			cp5.hide();
			error = false;
		}
	}

	public void errorMessage () {
		isString(cardholder);
		isNumeric(cardnumber); 
		isNumeric(mm);
		isNumeric(yy); 
		isNumeric(cvv);
		if (errorLength==true) {
			app.fill(0);
			app.text("las tarjetas deben presentan 16 digitos, los meses 2 digitos, los a�os 4 digitos y los CVV 3 digitos", 640, 120);
		}
	}

	public boolean isNumeric(String cadena) {

		try {// se controla una posible excepcion
			Long.parseLong(cadena);// si se logra guardar correctamente es un numero
			resultado = true;
		} catch (NumberFormatException excepcion) {//si no se logra guardar correctamente ocurre lo siguente:
			resultado = false;
			app.text("hay una letra en alguno de los campos numericos", 70, 60);
		}

		return resultado;
	}
	public boolean isString(String cadena) {


		try {// se controla una posible excepcion
			Integer.parseInt(cadena);// si se logra guardar correctamente es un numero
			resultado = false;
			app.text("hay un numero en alguno de los campos numericos", 70, 60);
		} catch (NumberFormatException excepcion) {//si no se logra guardar correctamente ocurre lo siguente:
			resultado = true;
		}

		return resultado;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}


	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public void mostrarP5() {
		cp5.show();
	}

}
