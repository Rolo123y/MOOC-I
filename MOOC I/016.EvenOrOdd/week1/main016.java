package week1;

import java.util.Scanner;

public class main016 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("type a number: ");
		int a = reader.nextInt();
		if (a % 2 == 0) {
			System.out.println("number + " + a + " is even");
		} else {
			System.out.println("the number " + a + " is odd");
		}

	}
}
