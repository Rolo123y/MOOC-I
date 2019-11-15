package week4;

public class NumberStatistics {
	private int amountOfNumbers;
	private int counter;

	public NumberStatistics() {
		this.amountOfNumbers = 0;
		counter = 0;
	}

	public void addNumber(int number) {
		this.amountOfNumbers += number;
		counter++;
	}

	public int amountOfNumbers() {
		return counter;
	}

	public int sum() {
		return amountOfNumbers;
	}

	public double average() {
		return sum() / (double) amountOfNumbers();
	}
}
