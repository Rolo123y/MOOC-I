package week1;

import java.util.Scanner;

public class main019 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("how old are you? ");
		int age = reader.nextInt();

		if (age >= 0 && age <= 120) {
			System.out.println("OK");
		} else {
			System.out.println("impossible!");
		}
	}
}
