package week1;

import java.util.Scanner;

public class main017 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("type the first number: ");
		int a = reader.nextInt();
		System.out.print("type the second number: ");
		int b = reader.nextInt();

		if (a > b) {
			System.out.println("The bigger number of the two numbers given was: " + a);
		} else if (a == b) {
			System.out.println("the numbers are equal!");
		} else {
			System.out.println("The bigger number of the two numbers given was: " + b);
		}
	}

}
