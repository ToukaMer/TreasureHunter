package data;

public class Tresor extends Case {
	
	private int latitude;
	private int longitude;
	private int type;
	
	
	public Tresor(int latitude, int longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.type = Constants.IS_TRESOR;
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


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}

	
	public String toString() {
		return ""+ type + "";
	}
}
