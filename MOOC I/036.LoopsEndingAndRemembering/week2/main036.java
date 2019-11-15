package week2;

import java.util.*;

public class main036 {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		int count = 0;
		int even = 0;
		System.out.println("type numbers: ");
		while (num != -1) {
			sum = Sum(num, sum);
			num = reader.nextInt();
			if (num != -1) {
				count++;
				if (Even(num)) {
					even++;
				}
			}
		}
		System.out.println("Thank you and see you later!");
		System.out.println("The sum is: " + sum);
		System.out.println("How many numbers: " + count);
		System.out.println("Average: " + (double) sum / count);
		System.out.println("Even numbers: " + even);
		System.out.println("Odd numbers: " + (count - even));
	}

	public static int Sum(int num, int sum) {
		return sum += num;
	}

	public static boolean Even(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
}
