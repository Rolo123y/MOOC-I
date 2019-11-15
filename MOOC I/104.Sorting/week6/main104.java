package week6;

import java.util.Arrays;

public class main104 {

	public static void main(String[] args) {

		int[] values = { 8, 3, 7, 9, 1, 2, 4 };
		// System.out.println("smallest: " + smallest(values));
		// System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

		// System.out.println(indexOfTheSmallestStartingFrom(values, 1));
		// System.out.println(indexOfTheSmallestStartingFrom(values, 2));
		// System.out.println(indexOfTheSmallestStartingFrom(values, 4));

		// System.out.println(Arrays.toString(values));
		// swap(values, 1, 0);
		// System.out.println(Arrays.toString(values));
		// swap(values, 0, 3);
		// System.out.println(Arrays.toString(values));

		sort(values);
	}

	public static int smallest(int[] array) {
		int smallest = 2147483647;
		for (int n : array) {
			if (n < smallest) {
				smallest = n;
			}
		}
		return smallest;
	}

	public static int indexOfTheSmallest(int[] array) {
		int smallest = smallest(array);
		int index = 0;
		for (int n : array) {
			if (n == smallest) {
				break;
			}
			index++;
		}
		return index;
	}

	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		int smallest = array[index];
		for (int i = index; i < array.length - 1; i++) {
			if (array[i + 1] < smallest) {
				smallest = array[i + 1];
				index = i + 1;
			}
		}
		return index;
	}

	public static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array));
			int index = indexOfTheSmallestStartingFrom(array, i);
			System.out.println("smallest integer in index: " + index);
			swap(array, i, index);
		}
	}

}
