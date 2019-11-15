package week6;

import java.util.Arrays;

public class main098 {

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4 };
		int[] copied = copy(original);
		int[] reverse = reverseCopy(original);

		 copied[0] = 99;

		System.out.println("original: " + Arrays.toString(original));
		System.out.println("copied: " + Arrays.toString(copied));
		System.out.println("reversed: " + Arrays.toString(reverse));
	}

	public static int[] copy(int[] array) {
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		return copy;
	}

	public static int[] reverseCopy(int[] array) {
		int[] reverse = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reverse[i] = array[array.length - 1 - i];
		}
		return reverse;

	}
}
