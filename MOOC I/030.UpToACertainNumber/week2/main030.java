package week2;

import java.util.Scanner;

public class main030 {

	// Create a program that prints all whole numbers from 1 to the number the user
	// enters.
	static Scanner reader = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.print("give a positive integer: ");
		int num = reader.nextInt();
		int i = 1;
		while (i <= num) {
			System.out.println(i);
			i++;
		}
	}

}
