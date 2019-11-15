package week6;

import java.util.ArrayList;

public class Library {

	private ArrayList<Book> books;

	public Library() {
		this.books = new ArrayList<>();
	}

	public void addBook(Book newbook) {
		if (!(books.contains(newbook))) {
			books.add(newbook);
		}
	}

	public ArrayList<Book> searchByTitle(String title) {
		ArrayList<Book> titles = new ArrayList<>();
		for (Book n : this.books) {
			if (StringUtils.included(n.title(), title)) {
				titles.add(n);
			}
		}
		return titles;
	}

	public ArrayList<Book> searchByPublisher(String publisher) {
		ArrayList<Book> publishers = new ArrayList<>();
		for (Book n : this.books) {
			if (StringUtils.included(n.publisher(), publisher)) {
				publishers.add(n);
			}
		}
		return publishers;
	}

	public ArrayList<Book> searchByYear(int year) {
		ArrayList<Book> years = new ArrayList<>();
		for (Book n : this.books) {
			if (n.year() == year) {
				years.add(n);
			}
		}
		return years;
	}

	public void printBooks() {
		for (Book n : this.books) {
			System.out.println(n);
		}
	}

}
