package week3;

import java.util.*;

public class main058 {
	// Create a program that asks the user to input words until the user gives the
	// same word twice. Use an ArrayList structure in your program
	static Scanner reader = new Scanner(System.in);
	static ArrayList<String> words = new ArrayList<>();

	public static void main(String[] args) {
		// System.out.print("Type a word: ");
		// String word = reader.nextLine();
		// while (!(word.isEmpty())) {
		// System.out.print("Type a word: ");
		// word = reader.nextLine();
		// if (words.contains(word)) {
		// break;
		// }
		// words.add(word);
		// }

		String word;
		do {
			System.out.print("Type a word: ");
			word = reader.nextLine();
			if (words.contains(word)) {
				break;
			}
			words.add(word);
		} while (!(word.isEmpty()));
		System.out.println("you gave the word " + word + " twice!");
	}

}
