package game;

import java.util.Scanner;

import data.Constants;

public class Movement {
	private Grid grid;
	private Scanner sc;
	

	public Movement(Grid grid) {
		this.grid = grid;
	}

	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}
	
	public void move() {
		String  line = null;
		sc = new Scanner(System.in);
		line = sc.nextLine();
		switch (line) {
		case "d" : moveRight();
			break;
		case "q" : moveLeft();
			break;
		case "z" : moveUp();
			break;
		case "s" : moveDown();
			break;
		default : System.out.println("Wrong command please try again");
		}
	}
	
	public void moveRight() {
		int latitude = grid.getHero().getLatitude();
		int longitude = grid.getHero().getLongitude();
		if(latitude<Constants.GRID_LENGTH-1) {
			grid.getCases()[longitude][latitude] = grid.getEmpty();
			latitude++;
			if(grid.getCases()[longitude][latitude].getType()==Constants.IS_TRAP) {
				grid.getHero().getLife().decrementLife();
			}
			else if(grid.getCases()[longitude][latitude].getType()==Constants.IS_TREASURE) {
				grid.getHero().getInventory().incrementCoins();
			}
			grid.getCases()[longitude][latitude] = grid.getHero(); 
			grid.getHero().setLatitude(latitude);
		}
		else {
			System.out.println("You can no longer move right");
		}
	}
	
	public void moveLeft() {
		int latitude = grid.getHero().getLatitude();
		int longitude = grid.getHero().getLongitude();
		if(latitude>0) {
			grid.getCases()[longitude][latitude] = grid.getEmpty();
			latitude--;
			if(grid.getCases()[longitude][latitude].getType()==Constants.IS_TRAP) {
				grid.getHero().getLife().decrementLife();
			}
			else if(grid.getCases()[longitude][latitude].getType()==Constants.IS_TREASURE) {
				grid.getHero().getInventory().incrementCoins();
			}
			grid.getCases()[longitude][latitude] = grid.getHero(); 
			grid.getHero().setLatitude(latitude);
		}
		else {
			System.out.println("You can't move left");
		}
	}
	
	public void moveUp() {
		int latitude = grid.getHero().getLatitude();
		int longitude = grid.getHero().getLongitude();
		if(longitude>0) {
			grid.getCases()[longitude][latitude] = grid.getEmpty();
			longitude--;
			if(grid.getCases()[longitude][latitude].getType()==Constants.IS_TRAP) {
				grid.getHero().getLife().decrementLife();
			}
			else if(grid.getCases()[longitude][latitude].getType()==Constants.IS_TREASURE) {
				grid.getHero().getInventory().incrementCoins();
			}
			grid.getCases()[longitude][latitude] = grid.getHero(); 
			grid.getHero().setLongitude(longitude);
		}
		else {
			System.out.println("You can't move up");
		}
	}
	
	public void moveDown() {
		int latitude = grid.getHero().getLatitude();
		int longitude = grid.getHero().getLongitude();
		if(longitude<Constants.GRID_HEIGHT-1) {
			grid.getCases()[longitude][latitude] = grid.getEmpty();
			longitude++;
			if((grid.getCases()[longitude][latitude].getType())==Constants.IS_TRAP) {
				grid.getHero().getLife().decrementLife();
			}
			else if((grid.getCases()[longitude][latitude].getType())==Constants.IS_TREASURE) {
				grid.getHero().getInventory().incrementCoins();
			}
			grid.getCases()[longitude][latitude] = grid.getHero(); 
			grid.getHero().setLongitude(longitude);
		}
		else {
			System.out.println("You can no longer move down");
		}
	}
}
