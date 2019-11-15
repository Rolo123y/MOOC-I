package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class main064 {
	// Create the method average, which receives a list of numbers
	// (ArrayList<Integer>) as a parameter and then calculates the average of the
	// items in that list.
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		boolean running = true;
		while (running) {
			running = run(list, running);
			System.out.print("continue? (y or n)");
			if (reader.next().equals("y")) {
				running = true;
			}
		}
	}

	public static boolean run(ArrayList<Integer> list, boolean running) {
		int num;
		do {
			System.out.print("Type a number(0 to get total sum+average): ");
			num = reader.nextInt();
			list.add(num);
		} while (num != 0);
		System.out.println("The sum is: " + sum(list));
		System.out.println("The Average is: " + Average(list));
		return running = false;
	}

	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for (int num : list) {
			if (!(num == 0)) {
				sum += num;
			}
		}
		return sum;
	}

	public static double Average(ArrayList<Integer> list) {
		int counter = 0;
		for (int num : list) {
			if (!(num == 0)) {
				counter++;
			}
		}
		return sum(list) / (double) counter;
	}

}
