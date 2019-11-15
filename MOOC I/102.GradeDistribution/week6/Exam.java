package week6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

	private ArrayList<Student> Students;
	private DistributionCounter Count;

	public Exam() {
		this.Students = new ArrayList<>();
		this.Count = new DistributionCounter();
	}

	public void AddStudent(Scanner reader) {
		String done = "done";
		String firstname;
		System.out.println("Add a student (enter 'done' as the firstname to stop).");
		boolean running = true;
		while (running) {

			System.out.println("firstName: ");
			firstname = reader.next();
			if (firstname.contains(done)) {
				running = false;
				break;
			}
			System.out.println("lastName: ");
			String lastname = reader.next();
			System.out.println("Grade: ");
			int grade = reader.nextInt();
			Students.add(new Student(firstname, lastname, grade));
			System.out.println("----------------------------------");
		}
		System.out.println("your list of Students for this Exam: ");
		printAllStudents();
	}

	public void printAllStudents() {
		for (Student n : Students) {
			System.out.println(n.getFirstName() + ":" + n.getLastName() + ":" + n.getGrade());
		}
	}

	public void printGradeDistribution() {
		if (Students.size() > 0) {
			for (int i = 0; i < Students.size(); i++) {
				Count.GradeOrganizer(Students.get(i).getGrade());
			}
		}
		System.out.println("Grade distribution: ");
		for (int i = 0; i <= 6; i++) {
			System.out.println(i + ": " + printStars(Count.getLevel(i)));
		}
	}

	public String printStars(int num) {
		String star = "";
		for (int i = 0; i < num; i++) {
			star += "*";
		}
		return star;
	}

	public String AcceptancePercentage() {
		double acc_Perct = 100 * (Students.size() - Count.getLevel(0)) / Students.size();
		return "Acceptance percentage: " + acc_Perct;
	}
}
