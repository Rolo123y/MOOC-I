package week5;

public class Student {

	private String name;
	private String studentNumber;

	public Student(String name, String studentNumber) {
		super();
		this.name = name;
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return this.name;
	}

	public String getStudentNumber() {
		return this.studentNumber;
	}

	public String toString() {
		return getName() + " (" + getStudentNumber() + ")";
	}

}
