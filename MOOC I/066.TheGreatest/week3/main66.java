package week3;

import java.util.ArrayList;

//Create the method greatest, which receives a list of numbers (ArrayList<Integer>) as a parameter and then returns the greatest number in the list as a return value.
public class main66 {
	public static int greatest(ArrayList<Integer> list) {
		int greatest = 0;
		for (int num : list) {
			if (num > greatest) {
				greatest = num;
			}
		}
		return greatest;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);
		list.add(10);
		System.out.println("The greatest number is: " + greatest(list));
	}

}
