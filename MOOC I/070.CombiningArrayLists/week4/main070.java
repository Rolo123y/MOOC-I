package week4;

import java.util.ArrayList;

//Create the method public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) that inserts the items in a list called second to a list called first. The order of the items can be anything and the same item can appear in the list more than once.
public class main070 {

	public static void main(String args[]) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list1.add(4);
		list1.add(3);

		list2.add(5);
		list2.add(10);
		list2.add(7);

		ArrayList<Integer> list3 = Combine(list1, list2);
		System.out.println(list1);// prints [4, 3]
		System.out.println(list2); // prints [5, 10, 7]
		System.out.println(list3); // prints [4, 3, 5, 10, 7]
	}

	public static ArrayList<Integer> Combine(ArrayList<Integer> first, ArrayList<Integer> second) {
		ArrayList<Integer> list3 = new ArrayList<>();
		// for (int nums : first) {
		// list3.add(nums);
		// }
		// for (int nums2 : second) {
		// list3.add(nums2);
		// }
		list3.addAll(first);
		list3.addAll(second);
		return list3;
	}
}
