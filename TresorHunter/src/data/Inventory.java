package data;

public class Inventory {
	private int coinsCollected;

	public Inventory(int coinsCollected) {
		this.coinsCollected = coinsCollected;
	}

	public int getCoinsCollected() {
		return coinsCollected;
	}

	public void setCoinsCollected(int coinsCollected) {
		this.coinsCollected = coinsCollected;
	}
	
	public void incrementCoins() {
		coinsCollected++;
	}
}
