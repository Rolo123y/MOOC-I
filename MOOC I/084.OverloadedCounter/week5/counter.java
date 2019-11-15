package week5;

public class counter {

	private int startingValue;
	private boolean check;

	public counter(int startingValue, boolean check) {
		this.startingValue = startingValue;
		this.check = check;
	}

	public counter(int startingValue) {
		this(startingValue, false);
	}

	public counter(boolean check) {
		this(0, true);
	}

	public counter() {
		this(0, false);
	}

	public int value() {
		return this.startingValue;
	}

	public void increase() {
		this.startingValue++;
	}

	public void decrease() {
		if (check == true && this.startingValue < 0) {
			this.startingValue = 0;
		} else if (check == true && this.startingValue > 0) {
			this.startingValue--;
			if (this.startingValue < 0) {
				this.startingValue = 0;
			}
		} else {
			this.startingValue--;
		}
	}

	public void increase(int increaseAmount) {
		if (increaseAmount >= 0) {
			this.startingValue += increaseAmount;
		}
	}

	public void decrease(int decreaseAmount) {
		if (decreaseAmount >= 0) {
			if (check == true && (this.startingValue < 0 || this.startingValue - decreaseAmount < 0)) {
				this.startingValue = 0;
			} else if (check == true && this.startingValue >= 0) {
				this.startingValue -= decreaseAmount;
				if (startingValue < 0) {
					this.startingValue = 0;
				}
			} else {
				this.startingValue--;
			}
		}
	}
}
