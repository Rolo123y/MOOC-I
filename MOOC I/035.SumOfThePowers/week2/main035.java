package week2;

import java.util.*;
import java.lang.Math;

public class main035 {

	// Create a program that calculates the sum of 2^0+2^1+2^2+...+2^n, where n is a
	// number entered by the user.

	static Scanner reader = new Scanner(System.in);

	public static void main(String args[]) {

		while (true) {
			System.out.print("Type a number(-1 to quit): ");
			int num = reader.nextInt();
			if (num == -1) {
				break;
			}
			System.out.println("result is: " + Power(num));
		}
		System.out.println("exited");
	}

	public static int Power(int n) {
		int sum = 0;
		for (int i = 0; i <= n; ++i) {
			sum += (int) Math.pow(2, i);
		}
		return sum;
	}
}
