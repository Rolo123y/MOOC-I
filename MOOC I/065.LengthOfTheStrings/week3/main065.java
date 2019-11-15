package week3;

import java.util.*;

public class main065 {
	// Create the method lengths that gets a list of String variables as a parameter
	// and returns an ArrayList that contains the lengths of the Strings in the same
	// order as the original list.
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hallo");
		list.add("Moi");
		list.add("Benvenuto!");
		list.add("badger badger badger badger");
		ArrayList<Integer> lengths = lengths(list);

		System.out.println("The lengths of the Strings: " + lengths);
	}

	public static ArrayList<Integer> lengths(ArrayList<String> list) {
		ArrayList<Integer> list2 = new ArrayList<>();
		for (String words : list) {
			list2.add(words.length());
		}
		return list2;
	}

}
