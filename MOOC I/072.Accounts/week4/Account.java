package week4;

public class Account {

	private String account;
	private double amount;

	public Account(String account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "[account=" + account + ", amount=" + amount + "]";
	}

	public double withdrawal(double amount) {
		// return amount = getAmount() - amount;
		return this.amount -= amount;
	}

	public double deposit(double amount) {
		// return amount = getAmount() + amount;
		return this.amount += amount;
	}

	public static void transfer(Account from, Account to, double howMuch) {
		from.withdrawal(howMuch);
		to.deposit(howMuch);
	}

}
