package week6;

import java.util.Scanner;

public class main102 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Exam exam1 = new Exam();
		exam1.AddStudent(reader);
		exam1.printGradeDistribution();
		exam1.AcceptancePercentage();
	}
}
