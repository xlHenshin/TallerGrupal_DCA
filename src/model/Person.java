package model;

import processing.core.PApplet;
/**
 * Person es la clase padre de la cual
 * las clases Contact y User heredan sus atributos
 * @author Andrés Burgos, Cristian Mendez, Angélica Cruz
 */
public abstract class Person extends PApplet {

	PApplet app;
	protected String name, lastName, mail, nationality;
	protected String cellNumber;
	
	/**Constructor
	 * @param name
	 * @param lastName
	 * @param mail
	 * @param nationality
	 * @param cellNumber
	 * @param app
	 */
	public Person(String name, String lastName, String mail, String nationality, String cellNumber, PApplet app) {
		
		this.name = name;
		this.lastName=lastName;
		this.mail= mail;
		this.nationality= nationality;
		this.cellNumber= cellNumber;
		this.app=app;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}
	
	
}
