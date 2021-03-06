package week3;

import java.util.Scanner;

//Create the method palindrome that checks if a string is a palindrome (reads the same forward and backward).
public class main069 {

	public static boolean palindrome(String text) {
		if (text.equals(reverse(text))) {
			return true;
		}
		return false;
	}

	public static String reverse(String text) {
		String rev = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			rev += text.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a text: ");
		String text = reader.nextLine();
		if (palindrome(text)) {
			System.out.println("The text is a palindrome!");
		} else {
			System.out.println("The text is not a palindrome!");
		}
	}

}
