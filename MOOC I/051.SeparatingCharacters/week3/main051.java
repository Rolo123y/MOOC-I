package week3;

import java.util.Scanner;

public class main051 {
	// Create a program that asks for the user's name and gives its characters
	// separately.
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("type your name: ");
		String name = reader.next();
		if (name.length() >= 3) {
			for (int i = 1; i <= name.length(); i++) {
				System.out.println(i + ". Character: " + characters(name, i));
			}
		} else {
			
		}

	}

	public static char characters(String text, int pos) {
		return text.charAt(pos - 1);
	}

}
