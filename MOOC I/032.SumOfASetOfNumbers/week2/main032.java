package week2;

import java.util.Scanner;

public class main032 {
	// Create a program that calculates the sum 1+2+3+…+n where n is a number
	// entered by the user.

	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.print("until what? ");
		int num = reader.nextInt();
		int i = 1;
		int sum = 0;
		System.out.print("sum = ");
		while (i <= num) {
			System.out.print(i+" + ");
			sum += i;
			i++;
			
		}
		System.out.println();
		System.out.println("Sum is: " + sum);
	}
}
