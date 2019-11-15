package week4;

import java.util.Scanner;

public class main078 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		BoundedCounter seconds = new BoundedCounter(59);
		BoundedCounter minutes = new BoundedCounter(59);
		BoundedCounter hours = new BoundedCounter(23);

		System.out.print("seconds: ");
		int s = reader.nextInt();
		System.out.print("minutes: ");
		int m = reader.nextInt();
		System.out.print("hours: ");
		int h = reader.nextInt();

		seconds.setValue(s);
		minutes.setValue(m);
		hours.setValue(h);
		System.out.print("Set time: ");
		System.out.println(hours + ":" + minutes + ":" + seconds);
		System.out.println();
		int i = 0;
		while (i < 86400) {
			System.out.println(hours + ":" + minutes + ":" + seconds);
			seconds.next();
			if(seconds.getValue()==0) {
				minutes.next();
				if(minutes.getValue()==0) {
					hours.next();
				}
			}
			i++;
		}
	}
}
