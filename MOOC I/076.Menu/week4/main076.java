package week4;

import java.util.Scanner;

public class main076 {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		Menu menu = new Menu();

		menu.addMeal("Hamburger");
		menu.addMeal("Fish'n'Chips");
		menu.addMeal("Sauerkraut");
		menu.printMeals();

		System.out.println("Want to clear the menue?(y or n)");
		if (reader.nextLine().equals("y")) {
			menu.clearMenue();
			System.out.println("Successfully cleared!");
		} else {
			System.out.println("Your final Menue!");
			menu.printMeals();
		}
	}
}
