package week2;

import java.util.Scanner;

public class main033 {

	// Similar to the previous exercise, except that the program should ask for both
	// the lower and upper bound. You can assume that the users first gives the
	// smaller number and then the greater number.

	static Scanner reader = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.print("Lower: ");
		int lower = reader.nextInt();
		System.out.print("Upper: ");
		int upper = reader.nextInt();
		int sum = 0;
		for (int i = 0; i <= upper; i++) {
			if (i >= lower && i <= upper) {
				sum += i;
			}
		}
		System.out.println("Sum is: " + sum);
	}

}
