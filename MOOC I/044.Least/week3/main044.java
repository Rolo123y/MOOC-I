package week3;

import java.util.Scanner;

public class main044 {
	// Create the method greatest, which gets three integers as parameters and then
	// returns the greatest of them.
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("give 3 integers and i'll give the least!");
		int answer = least(reader.nextInt(), reader.nextInt(), reader.nextInt());
		System.out.println("Greatest: " + answer);
	}

	public static int least(int num1, int num2, int num3) {
		if (num1 >= num2 && num1 >= num3) {
			return num1;
		} else if (num2 >= num1 && num2 >= num3) {
			return num2;
		} else {
			return num3;
		}
	}
}
