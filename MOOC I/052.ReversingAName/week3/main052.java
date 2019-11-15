package week3;

import java.util.Scanner;

public class main052 {
	// Create a program that asks for the user's name and prints it in reverse order
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Type your name: ");
		String name = reader.next();
		System.out.println(" In Reverse order: " + reverse(name));
	}

	public static String reverse(String text) {
		String rev = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			rev += text.charAt(i);
		}
		return rev;
	}
}
