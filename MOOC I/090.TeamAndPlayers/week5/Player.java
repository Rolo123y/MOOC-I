package week5;

public class Player {

	private String playerName;
	private int amountOfGoals;

	public Player(String playerName, int amountOfGoals) {
		this.amountOfGoals = amountOfGoals;
		this.playerName = playerName;
	}

	public Player(String playerName) {
		this(playerName, 0);
	}

	public String getName() {
		return this.playerName;
	}

	public int getGoals() {
		return this.amountOfGoals;
	}

	public String toString() {
		return "Player: " + getName() + ", goals " + getGoals();
	}

}
