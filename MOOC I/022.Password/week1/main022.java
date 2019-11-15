package week1;

import java.util.Scanner;

public class main022 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String password = "carrot"; // Use carrot as password when running tests.

		while (true) {
			System.out.print("type the password: ");
			String pass = reader.next();
			if (pass.equals(password)) {
				System.out.println("Right!");
				break;
			} else {
				System.out.println("Wrong!");
			}
		}
	}
}
