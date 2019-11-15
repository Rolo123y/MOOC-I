package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class main061 {
	// Create the method public static int countItems(ArrayList<String> list) that
	// returns the number of the items in the list
	static Scanner reader = new Scanner(System.in);
	static ArrayList<String> words = new ArrayList<>();

	public static void main(String[] args) {
		boolean running = true;
		while (running) {
			running = run(words, running);
		}
		System.out.println("There are this many items in the list: " + countItems(words));
	}

	public static int countItems(ArrayList<String> list) {
		if (list.contains("")) {
			int index = list.indexOf("");
			list.remove(index);
			countItems(list);
		}
		return list.size();
	}

	public static boolean run(ArrayList<String> list, boolean running) {
		String word;
		do {
			System.out.print("Type a word: ");
			word = reader.nextLine();
			list.add(word);
		} while (!(word.isEmpty()));
		return running = false;
	}
}
