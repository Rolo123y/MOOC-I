package week5;

import java.sql.Time;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean earlier(MyDate compared) {
		// first we'll compare years
		if (this.year < compared.year) {
			return true;
		}

		// if the years are the same, we'll compare the months
		if (this.year == compared.year && this.month < compared.month) {
			return true;
		}

		// years and months the same, we'll compare the days
		if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
			return true;
		}

		return false;
	}

	public void advance() {
		this.day++;
		// we assume all months have 30 days
		if (this.day > 30) {
			this.day = 1;
			this.month++;
			if (this.month > 12) {
				this.month = 1;
				this.year++;
			}
		}
	}

	public void advance(int numberOfDays) {
		int i = 0;
		while (i < numberOfDays) {
			advance();
			i++;
		}
	}

	public MyDate afterNumberOfDays(int days) {
		MyDate newMyDate = new MyDate(this.day, this.month, this.year);
		newMyDate.advance(days);
		return newMyDate;
	}

	public int differenceInYears(MyDate comparedDate) {
		double countYearDiff = 0;
		if (earlier(comparedDate)) {
			countYearDiff = (comparedDate.getYear() + comparedDate.getMonth() / 12 + comparedDate.getDay() / 365)
					- (this.year + this.month / 12 + this.day / 365);
		} else {
			countYearDiff = (this.year + this.month / 12 + this.day / 365)
					- (comparedDate.getYear() + comparedDate.getMonth() / 12 + comparedDate.getDay() / 365);
		}
		return (int) countYearDiff;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

}
