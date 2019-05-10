package game;

public class StartGame {
	private Grid grid;
	private Movement movement;
	
	public StartGame() {
		
	}
	
	public boolean gameProcess() {
		boolean result = false;
		grid = new Grid();
		movement = new Movement(grid);
		grid.displayGrid();
		while(((grid.getPersona().getLife().getValue())>0)&&((grid.getPersona().getInventory().getCoinsCollected())<=5)) {
			movement.move();
			grid.displayGrid();
			System.out.println(grid.getPersona().getLife().getValue());
			System.out.println(grid.getPersona().getInventory().getCoinsCollected());
		}
		return result;
	}
	
}
