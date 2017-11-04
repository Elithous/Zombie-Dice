package team.Seal;

public class Player {

	private String Name;
	private int points;
	private int brains;
	private int shots;

	public Player(String name) {

		this.Name = name;
		this.points = 0;
		this.brains = 0;

	}

	public String getName() {
		return Name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	public void addPoints(int points) {
		this.points += points;
	}

	public void setBrains(int brains) {
		this.brains = brains;
	}

	public int getBrains() {
		return brains;
	}
	
	public void addBrains(int brains) {
		this.brains += brains;
	}

	public void setShots(int shots) {
		this.shots = shots;
	}

	public int getShots() {
		return shots;
	}
	
	public void addShots(int shots) {
		this.shots += shots;
	}

	public boolean hasWon() {
		return this.points + this.brains >= 13;
	}

	public boolean hasLost() {
		return this.shots >= 3;
	}
}
/*
 * define a player. public void play game sout how many players scanner to pick
 * how many put it into palyer array then use for loop ask for name
 * 
 */