package week3;

import java.util.Scanner;

public class mian043 {
	// Create the method sum that calculates the sum of numbers the method receives
	// as parameters.
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("numbers to sum(-1 to get total): ");
		int num = reader.nextInt();
		while (num != -1) {
			sum = sum(sum, num);
			num = reader.nextInt();
		}
		System.out.println("sum is: " + sum);
	}

	public static int sum(int sum, int num) {
		return sum += num;
	}
}
