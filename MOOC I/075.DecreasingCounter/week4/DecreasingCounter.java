package week4;

public class DecreasingCounter {

	private int value;
	private int initial;

	public DecreasingCounter(int value) {
		this.value = value;
		this.initial = value;
	}

	public void printValue() {
		System.out.println("value: " + this.value);
	}

	public void decrease() {
		if (this.value > 0) {
			this.value--;
		}
	}

	public void reset() {
		this.value = 0;
	}

	public void setInitial() {
		this.value = initial;
	}

}
