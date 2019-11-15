package week6;

public class Person {

	private String name;
	private String number;

	public Person(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public String getNumber() {
		return this.number;
	}

	public String changeNumber(String number) {
		return this.number = number;
	}

	public String toString() {
		return this.name + "  number: " + this.number;
	}

}
