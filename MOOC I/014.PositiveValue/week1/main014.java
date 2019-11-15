package week1;

import java.util.Scanner;

public class main014 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Type a number: ");
		int a = reader.nextInt();

		if (a > 0) {
			System.out.println("the number is positive");
		} else if (a < 0) {
			System.out.println("the number is not positive");
		} else {
			System.out.println("the number is neutral");
		}
	}
}
