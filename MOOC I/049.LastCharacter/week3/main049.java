package week3;

import java.util.Scanner;

public class main049 {
	// Create a program that asks for the user's name and gives the last character.
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Type your name: ");
		String name = reader.next();
		System.out.println("Last character: " + LastCharacter(name));
	}

	public static char LastCharacter(String text) {
		return text.charAt(text.length() - 1);
	}
}
