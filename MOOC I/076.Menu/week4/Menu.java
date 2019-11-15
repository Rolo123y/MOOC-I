package week4;

import java.util.ArrayList;

public class Menu {

	private ArrayList<String> meals;

	public Menu() {
		this.meals = new ArrayList<String>();
	}

	public void addMeal(String meal) {
		meals.add(meal);
	}

	public void printMeals() {
		// int i = 0;
		// while (i < meals.size()) {
		// System.out.println(meals.get(i));
		// i++;
		// }
		for (String val : meals) {
			System.out.println(val);
		}
	}

	public void clearMenue() {
		// meals.clear();
		int i = 0;
		while (i < meals.size()) {
			meals.remove(i);
			i++;
		}
	}
}
