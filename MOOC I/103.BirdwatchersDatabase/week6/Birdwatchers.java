package week6;

import java.util.ArrayList;

public class Birdwatchers {

	private ArrayList<Bird> birds;
	private Bird bird;

	public Birdwatchers() {
		this.birds = new ArrayList<>();
	}

	public void addBird(String Name, String LatinName) {
		if (!birds.contains(Name) && !birds.contains(LatinName)) {
			birds.add(new Bird(Name, LatinName));
		}
	}

	public void Observation(String Name) {
		for (Bird n : birds) {
			if (n.getName().toLowerCase().trim().equals(Name) || n.getLatinName().toLowerCase().trim().equals(Name)) {
				n.IncreaseCount();
				return;
			}
		}
		System.out.println("Is not a bird!");
	}

	public void show(String bird) {
		for (Bird n : birds) {
			if (n.getName().toLowerCase().trim().equals(bird) || n.getLatinName().toLowerCase().trim().equals(bird)) {
				System.out.println(n);
				return;
			}
		}
		System.out.println("Is not a bird!");
	}

	public void Statistics() {
		if (birds.isEmpty() == false) {
			for (Bird n : birds) {
				System.out.println(n);
			}
		} else {
			System.out.println("No birds!");
		}
	}

	public boolean Quit(String quit) {
		if (quit.toLowerCase().trim().equals("quit")) {
			return true;
		}
		return false;
	}

}
