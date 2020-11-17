package model;

/**
 * Clase que guarda la informacion de cada paquete
 * @author Andrés Burgos, Cristian Mendez, Angélica Cruz
 */

public class Package {

	private String description, name, duration;
	private int cost;
	
	public Package(String name, String description, String duration, int cost) {
		
		this.name=name;
		this.description=description;
		this.duration=duration;
		this.cost=cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
