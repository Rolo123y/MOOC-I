package week3;

import java.util.Scanner;

public class main047 {
	// Create a program that asks for the user's name and says how many characters
	// the name contains.
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("type your name: ");
		String name = reader.next();
		System.out.println("Number of Characters: " + claculateCharacters(name));
	}

	public static int claculateCharacters(String text) {
		return text.length();
	}

}
