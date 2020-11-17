package view;

	import processing.core.PApplet;
	import processing.core.PImage;

	/**
	 * Clase padre de donde las pantallas heredan los atributos
	 * y métodos de pintar
	 * @author Andrés Burgos, Cristian Mendez, Angélica Cruz
	 */
	
	public class ScreenFather extends PApplet {

		protected float posY;
		protected PImage screen;
		protected PApplet app;
		
		public ScreenFather (float posY, PApplet app) {
			this.posY=posY;
			this.screen=screen;
			this.app=app;
		}
		
		protected void drawImage() {
			app.image(screen, 0, posY);
		}
			
		
}
