package week6;

import java.util.Scanner;

public class GuessingGame {
	private Scanner reader;

	public GuessingGame() {
		this.reader = new Scanner(System.in);
	}

	public void play(int lowerlimit, int upperlimit) {
		instructions(lowerlimit, upperlimit);
		int mid = 0;
		while (lowerlimit <= upperlimit) {
			mid = average(lowerlimit, upperlimit);
			if (lowerlimit == upperlimit) {
				break;
			} else if (isGreaterThan(mid)) {
				lowerlimit = mid + 1;
			} else {
				upperlimit = mid;
			}
		}
		System.out.println("The number you're thinking of is " + mid + ".");
	}

	public boolean isGreaterThan(int mid) {
		System.out.println("Is your number greater than " + mid + "? (y/n)");
		String answer = reader.next();
		if (answer.equals("y")) {
			return true;
		}
		return false;
	}

	public int average(int num1, int num2) {
		return (int) (num1 + num2) / 2;
	}

	public void instructions(int lowerLimit, int upperLimit) {
		int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);
		System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");
		System.out.println(
				"I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
		System.out.println("");
		System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
		System.out.println("");
	}

	public static int howManyTimesHalvable(int number) {
		return (int) (Math.log(number) / Math.log(2)) + 1;
	}

}
