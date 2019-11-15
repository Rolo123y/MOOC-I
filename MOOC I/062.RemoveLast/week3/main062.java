package week3;

import java.util.ArrayList;
import java.util.Scanner;

//Create the method public static void removeLast(ArrayList<String> list), which removes the last item from the list.
public class main062 {
	static Scanner reader = new Scanner(System.in);
	static ArrayList<String> words = new ArrayList<>();

	public static void main(String[] args) {
		boolean running = true;
		while (running) {
			running = run(words, running);
		}
		System.out.println("You typed in this many words: " + countItems(words));
		removeLast(words);
		System.out.println("Last string removed. Items in list: " + countItems(words));
		// print(words);
		words.toArray();
		System.out.println(words);
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

	public static void removeLast(ArrayList<String> list) {
		list.remove(list.size() - 1);
	}

	public static void print(ArrayList<String> list) {
		for (String words : list) {
			System.out.println(words);
		}
	}
}
