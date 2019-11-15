package week6;

public class Student {

	private int value;
	private String FirstName;
	private String LastName;

	public Student(String firstname, String lastname, int value) {
		this.FirstName = firstname;
		this.LastName = lastname;
		if (value >= 0 && value <= 100) {
			this.value = value;
		}
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int getGrade() {
		return this.value;
	}
}
