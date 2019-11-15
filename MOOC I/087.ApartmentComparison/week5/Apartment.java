package week5;

public class Apartment {

	private int rooms;
	private int squareMeters;
	private int pricePerSquareMeter;

	public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
		this.rooms = rooms;
		this.squareMeters = squareMeters;
		this.pricePerSquareMeter = pricePerSquareMeter;
	}

	public boolean larger(Apartment other) {
		if (this.squareMeters > other.squareMeters) {
			return true;
		} else {
			return false;
		}
	}

	public int priceDifference(Apartment other) {
		int price1 = this.pricePerSquareMeter * this.squareMeters;
		int price2 = other.pricePerSquareMeter * other.squareMeters;
		if (price1 - price2 < 0) {
			return (price1 - price2) * -1;
		} else {
			return price1 - price2;
		}
	}

	public boolean moreExpensiveThan(Apartment other) {
		int price1 = this.pricePerSquareMeter * this.squareMeters;
		int price2 = other.pricePerSquareMeter * other.squareMeters;
		if (price1 > price2) {
			return true;
		} else {
			return false;
		}
	}

}
