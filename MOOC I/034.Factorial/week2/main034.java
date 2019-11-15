package week2;

import java.util.Scanner;

public class main034 {

	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		int num = reader.nextInt();
		System.out.println("Factorial is: " + Factorial(num));
	}

	public static int Factorial(int n) {
		int sum = 1;
		if (n == 0 || n == 1) {
			return 1;
		}
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}
}
