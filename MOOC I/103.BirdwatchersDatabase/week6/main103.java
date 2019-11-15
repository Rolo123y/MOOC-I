package week6;

import java.util.Scanner;

public class main103 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Birdwatchers session1 = new Birdwatchers();
		boolean running = true;
		while (running) {
			System.out.print("? ");
			String status = reader.next();
			running = run(session1, reader, status, running);
		}
	}

	public static boolean run(Birdwatchers session1, Scanner reader, String status, boolean running) {
		if (status.toLowerCase().trim().equals("add")) {
			add(session1, reader);
			return running;
		}
		if (status.toLowerCase().trim().equals("observation")) {
			Observation(session1, reader);
			return running;
		}
		if (status.toLowerCase().trim().equals("statistics")) {
			session1.Statistics();
			return running;
		}
		if (status.toLowerCase().trim().equals("show")) {
			show(session1, reader);
			return running;
		}
		if (session1.Quit(status) == true) {
			return running = false;
		}
		return running;
	}

	public static void add(Birdwatchers session, Scanner Name) {
		System.out.print("Name: ");
		String Name1 = Name.next();
		System.out.print("LatinName: ");
		String LatinName1 = Name.next();
		session.addBird(Name1, LatinName1);
	}

	public static void Observation(Birdwatchers session, Scanner Name) {
		System.out.print("What was observed?: ");
		String observed = Name.next();
		session.Observation(observed);
	}

	public static void show(Birdwatchers session, Scanner reader) {
		System.out.print("What? ");
		String name = reader.next();
		session.show(name);
	}

}
