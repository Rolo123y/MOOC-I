package week4;

import java.util.Scanner;

public class main079 {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		NumberStatistics stats = new NumberStatistics();
		int evenNums = 0;
		int oddNums = 0;
		System.out.println("Type numbers:");
		int r = reader.nextInt();
		while (!(r == -1)) {
			if (r % 2 == 0) {
				evenNums += r;
			} else {
				oddNums += r;
			}
			stats.addNumber(r);
			r = reader.nextInt();
		}
		System.out.println("Sum: " + stats.sum());
		System.out.println("Sum of even: " + evenNums);
		System.out.println("Sum of odd: " + oddNums);
	}

}
