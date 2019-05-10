package data;

import java.util.ArrayList;

public class Persona extends Case {
	
	private int latitude;
	private int longitude;
	private Life life;
	private ArrayList<Treasure> inventory;
	private int type;

	public Persona() {
		initializePersona();
	}


	public int getLatitude() {
		return latitude;
	}


	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}


	public int getLongitude() {
		return longitude;
	}


	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}


	public Life getLife() {
		return life;
	}


	public void setLife(Life life) {
		this.life = life;
	}


	public ArrayList<Treasure> getInventory() {
		return inventory;
	}


	public void setInventory(ArrayList<Treasure> inventory) {
		this.inventory = inventory;
	}
	
	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public void initializePersona() {
		latitude = Constants.DEPARTURE_LATITUDE;
		longitude = Constants.DEPARTURE_LONGITUDE;
		life = new Life(Constants.STARTING_NUMBER_OF_LIVES);
		inventory = null;
		type = Constants.IS_PERSONA;
	}

	
	public String toString() {
		return ""+ type + "";
	}
}
