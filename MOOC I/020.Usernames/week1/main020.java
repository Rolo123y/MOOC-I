package week1;

import java.util.Scanner;

public class main020 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("type your username: ");
		String name = reader.next();
		System.out.print("type your password: ");
		String password = reader.next();

		if ((name.equals("alex") && password.equals("mightyducks"))
				|| (name.equals("emily") && password.equals("cat"))) {
			System.out.println("You are now logged into the system!");
		} else {
			System.out.println("Your username or password was invalid!");
		}
	}
}
