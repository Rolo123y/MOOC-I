package week1;

import java.util.Scanner;

public class main021 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("type a year: ");
		int year = reader.nextInt();
		if (year % 100 == 0 && year % 400 == 0) {
			System.out.println("the year is a leap year.");
		} else if (year % 4 == 0) {
			System.out.println("the year is a leap year.");
		} else {
			System.out.println("the year is not a leap year.");
		}

	}
}
