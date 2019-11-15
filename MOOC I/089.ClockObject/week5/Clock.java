package week5;

import week4.BoundedCounter;

public class Clock {

	private BoundedCounter hours;
	private BoundedCounter minutes;
	private BoundedCounter seconds;

	public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
		hours = new BoundedCounter(23);
		minutes = new BoundedCounter(59);
		seconds = new BoundedCounter(59);

		hours.setValue(hoursAtBeginning);
		minutes.setValue(minutesAtBeginning);
		seconds.setValue(secondsAtBeginning);
	}

	public void tick() {
		seconds.next();
		if (seconds.getValue() == 0) {
			minutes.next();
			if (minutes.getValue() == 0) {
				hours.next();
			}
		}
	}

	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}
}
