package week4;

public class BoundedCounter {

	private int value;
	private int upperlimit;

	public BoundedCounter(int upperlimit) {
		this.upperlimit = upperlimit;
		this.value = 0;
	}

	public void next() {
		this.value++;
		if (this.value > this.upperlimit) {
			this.value = 0;
		}
	}

	public String toString() {
		if (this.value < 10) {
			// return "[value: 0" + value + ", upperlimit: " + upperlimit + "]";
			return "0" + this.value;
		} else {
			// return "[value: " + value + ", upperlimit: " + upperlimit + "]";
			return "" + this.value;
		}
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		if (value > 0 && value <= this.upperlimit) {
			this.value = value;
		}
	}
}
