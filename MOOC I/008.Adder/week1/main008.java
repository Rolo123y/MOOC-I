package week1;

import java.util.Scanner;

public class main008 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("type a number: ");
		int a = +reader.nextInt();
		System.out.print("Type another number: ");
		int b = reader.nextInt();
		System.out.printf(a + " + " + b + " = %d %n", a + b);
	}
}
