package week3;

import java.util.*;

public class main059 {
	// Create a program that asks the user to input words, until the user gives an
	// empty string. Then the program prints the words the user gave in reversed
	// order, the last word is printed first etc.
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();
		String word;
		do {
			System.out.print("Type a word: ");
			word = reader.nextLine();
			words.add(word);
		} while (!(word.isEmpty()));
		// Collections.sort(words); // sort alphabetical
		Collections.reverse(words); // sort alphabetical reversed
		for (String names : words) {
			System.out.println(names);
		}
	}
}
