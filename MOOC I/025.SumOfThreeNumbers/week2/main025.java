package week2;

import java.util.Scanner;

public class main025 {

	static Scanner reader = new Scanner(System.in);

	public static void main(String args[]) {

		int sum = 0;

		System.out.println("give me 3 numbers and I will find the summation!");

		int num = reader.nextInt();
		sum = sum + num;
		num = reader.nextInt();
		sum = sum + num;
		num = reader.nextInt();
		sum = sum + num;

		System.out.println("your summation is: " + sum);
	}

}
