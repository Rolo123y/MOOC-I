package week1;

import java.util.Scanner;

public class main009 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("type a number: ");
		int a = +reader.nextInt();
		System.out.print("Type another number: ");
		int b = reader.nextInt();
		if (b != 0) {
			System.out.printf(a + " / " + b + " = %.2f %n", a / (double) b);
		} else {
			System.out.println("cannot divide by 0");
		}

	}
}
