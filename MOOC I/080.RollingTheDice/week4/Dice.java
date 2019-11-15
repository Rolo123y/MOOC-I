package week4;

import java.util.Random;

public class Dice {
	private Random random;
	private int numberofsides;

	public Dice(int numberofsides) {
		this.numberofsides = numberofsides;
		random = new Random();
	}

	public int roll() {
		int randomside = this.random.nextInt(numberofsides);
		return randomside;
	}
}
