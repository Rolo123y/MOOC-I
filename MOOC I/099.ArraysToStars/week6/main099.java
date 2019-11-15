package week6;

public class main099 {

	public static void main(String[] args) {
		int[] array = { 5, 1, 3, 4, 2, 10};
		printArrayAsStars(array);
	}

	public static void printArrayAsStars(int[] array) {
		for (int i = 0; i < array.length; i++) {
			printStars(array[i]);
		}
	}

	public static void printStars(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
