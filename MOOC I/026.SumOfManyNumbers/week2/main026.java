package week2;

import java.util.Scanner;

public class main026 {

	public static void main(String args[]) {

		// Create a program that reads numbers from the user and prints their sum. The
		// program should stop asking for numbers when user enters the number 0. The
		// program should be structured like this:

		Scanner reader = new Scanner(System.in);
		int sum = 0;
		System.out.println("give me numbers or '0' to quit");
		while (true) {
			int read = reader.nextInt();
			if (sum + read == sum) {
				break;
			}
			sum = sum + read;
			System.out.println("sum is now: " + sum);

		}
		System.out.println("final sum: " + sum);
	}

}
