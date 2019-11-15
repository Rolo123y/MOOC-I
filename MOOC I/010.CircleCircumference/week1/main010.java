package week1;

import java.util.Scanner;
import java.math.*;

public class main010 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("type the radius: ");
		int radius = reader.nextInt();

		System.out.printf("Circumference of the circle: %.10f %n", 2 * Math.PI * radius);
	}
}
