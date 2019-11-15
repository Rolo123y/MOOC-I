package week6;

public class Book {

	private String title;
	private String publisher;
	private int year;

	public Book(String title) {
		this.title = title;
	}

	public Book(String title, String publisher, int year) {
		this.year = year;
		this.publisher = publisher;
		this.title = title;
	}

	public String title() {
		return this.title;
	}

	public String publisher() {
		return this.publisher;
	}

	public int year() {
		return this.year;
	}

	public String toString() {
		return title() + ", " + publisher() + ", " + year();
	}

}
