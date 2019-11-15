package week3;

import java.util.Scanner;

public class main054 {
	// Create a program that prints the end part of a word. The program asks the
	// user for the word and the length of the end part. Use the substring method in
	// your program.
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Type a word: ");
		String word = reader.next();
		System.out.println("Length of the first part: ");
		int length = reader.nextInt();
		System.out.println("Result: " + firstpart(word, length));
	}

	public static String firstpart(String text, int length) {
		int diff = text.length() - length;
		return text.substring(diff);
	}
}
