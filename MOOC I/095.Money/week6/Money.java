package week6;

public class Money {

	private final int euros;
	private final int cents;

	public Money(int euros, int cents) {
		if (cents > 99) {
			euros += cents / 100;
			cents %= 100;
		}
		this.euros = euros;
		this.cents = cents;
	}

	public int euros() {
		return euros;
	}

	public int cents() {
		return cents;
	}

	public Money plus(Money added) {
		int euros = 0;
		int cents = 0;
		euros += added.euros + this.euros;
		cents = added.cents + this.cents;
		Money newMoney = new Money(euros, cents);
		return newMoney;
	}

	public boolean less(Money compared) {
		if (compared.euros < this.euros || (compared.euros == this.euros && compared.cents < this.cents)) {
			return false;
		}
		return true;
	}

	public Money minus(Money decremented) {
		int euros;
		int cents;
		if (!(this.less(decremented))) {
			euros = this.euros - decremented.euros;
			cents = this.cents - decremented.cents;
			if (this.cents < decremented.cents) {
				euros--;
				cents = 100 - decremented.cents;
			}
		} else {
			return new Money(0, 0);
		}
		return new Money(euros, cents);

	}

	public String toString() {
		String zero = "";
		if (cents < 10) {
			zero = "0";
		}
		return euros + "." + zero + cents + "e";
	}

}
