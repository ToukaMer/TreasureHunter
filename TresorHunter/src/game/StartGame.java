package game;

import data.Constants;

public class StartGame {
	private Grid grid;
	private Movement movement;
	
	public StartGame() {
		
	}
	
	public void gameProcess() {
		grid = new Grid();
		movement = new Movement(grid);
		instructions();
		movementInstructions();
		information();
		grid.displayGrid();
		while(((grid.getHero().getLife().getValue())>0)&&((grid.getHero().getInventory().getCoinsCollected())<Constants.COINS_AMOUNT_TO_WIN)) {
			movement.move();
			movementInstructions();
			information();
			grid.displayGrid();
		}
		if((grid.getHero().getLife().getValue())==0){
			System.out.println("You lost");
		}
		else if((grid.getHero().getInventory().getCoinsCollected())==5) {
			System.out.println("Congratulations !! you won");
		}
	}
	
	public void instructions() {
		System.out.println("Welcome to treasure hunter");
		System.out.println("To win you will have to collect 5 treasures without dying");
		System.out.println("1 is your character, 2 are traps, 3 are treasures");
	}
	
	public void movementInstructions() {
		System.out.println("                   To move up use : z");
		System.out.println("To move left use : q                    to move right use : d");
		System.out.println("                   To move down use : s");
	}
	
	public void information() {
		System.out.print("Life = "+grid.getHero().getLife().getValue()+"");
		System.out.println("  |  Treasures collected = "+grid.getHero().getInventory().getCoinsCollected()+"");
	}
	
}
