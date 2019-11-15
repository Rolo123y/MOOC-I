package week4;

public class LyyraCard {
	private double balance;

	public LyyraCard(double balanceAtStart) {
		this.balance = balanceAtStart;
	}

	public String toString() {
		return "The card has " + this.balance + " euros";
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double amount) {
		this.balance = amount;
	}

	public void payEconomical() {
		if (!(getBalance() - 2.50 < 0)) {
			this.balance -= 2.50;
		}
	}

	public void payGourmet() {
		if (!(getBalance() - 4.00 < 0)) {
			this.balance -= 4.00;
		}
	}

	public void loadMoney(double amount) {
		if (amount >= 0) {
			if ((getBalance() + amount) >= 150.0) {
				setBalance(150.0);
			} else {
				this.balance += amount;
			}
		}
	}
}
