package week1;

import java.util.Scanner;

public class main015 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("how old are you?: ");
		int age = reader.nextInt();
		if (age >= 18) {
			System.out.println("you have reached the age of majority!");
		} else {
			System.out.println("you have not reached the age of majority!");
		}
	}
}
