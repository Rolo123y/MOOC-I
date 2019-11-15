package week5;


public class LyyraCard1 {

	private double balance;

	public LyyraCard1(double balance) {
		this.balance = balance;
	}

	public double balance() {
		return this.balance;
	}

	public void loadMoney(double amount) {
		this.balance += amount;
	}

	public boolean pay(double amount) {
		if (balance() >= amount) {
			this.balance -= amount;
			return true;
		} else {
			return false;
		}
	}
}
