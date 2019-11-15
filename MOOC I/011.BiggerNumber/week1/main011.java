package week1;

import java.util.Scanner;

public class main011 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("type a number: ");
		int a = reader.nextInt();
		System.out.print("type another number: ");
		int b = reader.nextInt();

		if (a > b) {
			System.out.println("The bigger number of the two numbers given was: " + a);
		} else {
			System.out.println("The bigger number of the two numbers given was: " + b);
		}
	}
}
