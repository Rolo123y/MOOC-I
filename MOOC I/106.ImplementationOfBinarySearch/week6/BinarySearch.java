package week6;

public class BinarySearch {

	public static boolean search(int[] array, int searchedValue) {
		int min = 0;
		int max = array.length - 1;
		while (min <= max) {
			int mid = (min + max) / 2;
			if (searchedValue > array[mid]) {
				min = mid + 1;
			} else if (searchedValue < array[mid]) {
				max = mid - 1;
			} else {
				return true;
			}
		}
		return false;
	}

}
