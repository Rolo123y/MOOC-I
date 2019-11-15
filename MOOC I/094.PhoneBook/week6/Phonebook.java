package week6;

import java.util.ArrayList;

public class Phonebook {

	private ArrayList<Person> person;

	public Phonebook() {
		person = new ArrayList<Person>();
	}

	public void add(String name, String number) {
		Person p = new Person(name, number);
		person.add(p);
	}

	public String searchNumber(String name) {
		for (Person pr : person) {
			if (pr.getName().equals(name)) {
				return pr.getNumber();
			}
		}
		return "number not known";
	}

	public void printAll() {
		for (Person pr : person) {
			System.out.println(pr.toString());
		}
	}
}
