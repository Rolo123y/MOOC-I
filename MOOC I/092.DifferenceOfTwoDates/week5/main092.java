package week5;

import week5.MyDate;

//using the same MyDate Class in the previous question
public class main092 {

	public static void main(String[] args) {

		MyDate first = new MyDate(24, 12, 2009);
		MyDate second = new MyDate(1, 1, 2011);
		MyDate third = new MyDate(25, 12, 2010);

		System.out.println(first + " and " + second + " difference in years: " + second.differenceInYears(first));
		System.out.println(second + " and " + first + " difference in years: " + first.differenceInYears(second));
		System.out.println(first + " and " + third + " difference in years: " + third.differenceInYears(first));
		System.out.println(third + " and " + first + " difference in years: " + first.differenceInYears(third));
		System.out.println(third + " and " + second + " difference in years: " + second.differenceInYears(third));
		System.out.println(second + " and " + third + " difference in years: " + third.differenceInYears(second));
	}

}
