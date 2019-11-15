package week4;

import java.util.ArrayList;

public class main071 {
	// Create the method smartCombine that works like the previous combine method
	// except that numbers can be on the list only once. This means that the method
	// adds a new number to the list only if the list does not already contain that
	// number. You might find the method contains from the ArrayList class useful.
	// You can use that method to check if a number is in the list.
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list1.add(4);
		list1.add(3);
		list1.add(5);

		list2.add(5);
		list2.add(10);
		list2.add(7);
		list2.add(4);

		ArrayList<Integer> list3 = SmartCombine(list1, list2);
		System.out.println(list1);// prints [4, 3]
		System.out.println(list2); // prints [5, 10, 7]
		System.out.println(list3); // prints [4, 3, 5, 10, 7]
	}

	public static ArrayList<Integer> SmartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.addAll(first);
		for (int num : second) {
			if (!list3.contains(num)) {
				list3.add(num);
			}
		}
		return list3;
	}

}
