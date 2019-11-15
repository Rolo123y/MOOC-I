package week1;

import java.util.Scanner;

public class main018 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("type the points [0-60]: ");

		int point = reader.nextInt();

		if (point >= 0 && point <= 29) {
			System.out.println("Grade: failed");
		} else if (point >= 30 && point <= 34) {
			System.out.println("Grade: 1");
		} else if (point >= 35 && point <= 39) {
			System.out.println("Grade: 2");
		} else if (point >= 40 && point <= 44) {
			System.out.println("Grade: 3");
		} else if (point >= 45 && point <= 49) {
			System.out.println("Grade: 4");
		} else if (point >= 50 && point <= 60) {
			System.out.println("Grade: 5");
		}
	}
}
