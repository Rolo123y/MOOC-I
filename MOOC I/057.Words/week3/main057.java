package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class main057 {
	// Create a program that asks the user to input words until the user types in an
	// empty String. Then the program prints the words the user gave. Try the for
	// repetition sentence here. Use an ArrayList structure in your program.

	static ArrayList<String> words = new ArrayList<>();
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		String word;
		do {
			System.out.print("Type a word: ");
			word = reader.nextLine();
			words.add(word);
		} while (!(word.isEmpty()));
		System.out.println("You typed the following words:");
		for (String word1 : words) {
			System.out.println(word1);
		}
	}
}
