package week3;

import java.util.*;

//Create the method variance, which receives a list of integers as a parameter and then returns the sample variance of that list.
public class main067 {
	public static double variance(ArrayList<Integer> list) {
		double numerator;
		double sum = 0;
		int den = list.size() - 1;
		double SampleMean = Math.pow(sum(list), 2) / list.size();
		for (double num : list) {
			sum += Math.pow(num, 2);
		}
		numerator = sum - SampleMean;
		return numerator / den;
	}

	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for (int num : list) {
			sum += num;
		}
		return sum;
	}

	public static double Average(ArrayList<Integer> list) {
		int counter = 0;
		for (int num : list) {
			counter++;
		}
		return sum(list) / (double) counter;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);

		System.out.println("The variance is: " + variance(list));
	}
}
