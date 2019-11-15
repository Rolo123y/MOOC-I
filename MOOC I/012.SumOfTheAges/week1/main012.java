package week1;

import java.util.Scanner;

public class main012 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("type your name: ");
		String name1 = reader.next();
		System.out.print("type your age: ");
		int age1 = reader.nextInt();
		System.out.print("type your name: ");
		String name2 = reader.next();
		System.out.print("type your age: ");
		int age2 = reader.nextInt();

		int sumAge = age1 + age2;
		System.out.println(name1 + " and " + name2 + " are " + sumAge + " years old in total.");
	}
}
