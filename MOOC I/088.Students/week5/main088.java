package week5;

import java.util.ArrayList;
import java.util.Scanner;

public class main088 {

	public static void main(String args[]) {

		Scanner reader = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		System.out.println("enter student names and student numbers:");
		String name;
		String studentNumber;
		do {
			System.out.print("name: ");
			name = reader.nextLine();
			System.out.print("StudentNumber: ");
			studentNumber = reader.nextLine();
			students.add(new Student(name, studentNumber));
		} while (!(name.equals("")));

		students.remove(students.size() - 1);
		System.out.println("\nyour list of Students:");
		for (Student st : students) {
			System.out.println(st);
		}

		System.out.println("\nwant to search a student?(y to search)");
		String search = reader.next().toLowerCase();
		if (search.equals("y")) {
			System.out.print("Give search term: ");
			String term = reader.next();
			System.out.println("result:");
			for (Student st : Search(students, term)) {
				System.out.println(st);
			}
		} else {
			System.out.println("goodbye");
			System.exit(0);
		}
	}

	public static ArrayList<Student> Search(ArrayList<Student> student, String character) {
		ArrayList<Student> newList = new ArrayList<>();
		for (Student st : student) {
			if (st.getName().contains(character)) {
				newList.add(st);
			}
		}
		return newList;
	}
}
