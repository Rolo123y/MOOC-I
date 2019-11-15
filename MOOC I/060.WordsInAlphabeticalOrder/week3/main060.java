package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main060 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();
		String word;
		do {
			System.out.print("Type a word: ");
			word = reader.nextLine();
			words.add(word);
		} while (!(word.isEmpty()));
		Collections.sort(words); // sort alphabetical
		for (String names : words) {
			System.out.println(names);
		}
	}
}
