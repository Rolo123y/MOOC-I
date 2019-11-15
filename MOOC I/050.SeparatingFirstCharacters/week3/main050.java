package week3;

import java.util.Scanner;

public class main050 {
	// Create a program that asks for the user's name and gives its first, second
	// and third characters separately. If the name length is less than three, the
	// program prints nothing.
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("type your name: ");
		String name = reader.next();
		if (name.length() >= 3) {
			for (int i = 1; i <= 3; i++) {
				System.out.println(i + ". Character: " + characters(name, i));
			}
		}else {
			 
		}

	}

	public static char characters(String text, int pos) {
		return text.charAt(pos - 1);
	}

}
