package week5;

import java.util.ArrayList;

public class Team {

	private String name;
	private ArrayList<Player> Players;
	private int maxSize = 16;

	public Team(String name) {
		this.name = name;
		this.Players = new ArrayList<Player>();
	}

	public String getName() {
		return this.name;
	}

	public void addPlayer(Player player) {
		if (this.Players.size() < this.maxSize) {
			this.Players.add(player);
		}
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public int size() {
		return this.Players.size();
	}

	public int TotalGoals() {
		int total = 0;
		for (Player pl : Players) {
			total += pl.getGoals();
		}
		return total;
	}

	public String print() {
		String PlayerPrint = "";
		for (Player pl : this.Players) {
			PlayerPrint += pl.toString() + "\n";
		}
		return "Team " + getName() + " Players: \n" + PlayerPrint;
	}

}
