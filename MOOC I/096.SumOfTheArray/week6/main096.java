package week6;

public class main096 {

	public static void main(String[] args) {

		int[] array = { 5, 1, 3, 4, 2 };
		int sumArray = sumArray(array);
		System.out.println(sumArray);

	}

	public static int sumArray(int[] array) {
		int sum = 0;
		for (int val : array) {
			sum += val;
		}
		return sum;
	}

}
