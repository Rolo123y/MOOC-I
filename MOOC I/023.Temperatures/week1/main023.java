package week1;

import java.util.Scanner;

public class main023 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		while (true) {
			System.out.println("enter temperature (0 to quit):");
			double temp = reader.nextDouble();
			if (temp == 0.0) {
				System.exit(0);
			}
			if (temp >= -30 && temp < +40) {
				Graph.addNumber(temp);
			}
		}
	}
}
