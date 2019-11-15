package week5;

import week5.MyDate;

public class main093 {

	public static void main(String[] args) {
		Person_ pekka = new Person_("Pekka", new MyDate(15, 2, 1983));
		Person_ steve = new Person_("Steve");

		System.out.println(pekka);
		System.out.println(steve);
	}

}
