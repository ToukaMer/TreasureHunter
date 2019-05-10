package data;

public class Trap extends Case {
	
	private int latitude;
	private int longitude;
	private int type;
	
	
	public Trap(int latitude, int longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.type = Constants.IS_TRAP;
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
	
	@Override
	public String toString() {
		return ""+ type + "";
	}

}
