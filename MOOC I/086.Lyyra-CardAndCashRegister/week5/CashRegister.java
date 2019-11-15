package week5;

public class CashRegister {

	private double cashInRegister; // the amount of cash in the register
	private int economicalSold; // the amount of economical lunches sold
	private int gourmetSold; // the amount of gourmet lunches sold
	private double priceEconomical = 2.50;
	private double priceGourmet = 4.00;

	public CashRegister() {
		this.cashInRegister = 1000;
		economicalSold = 0;
		gourmetSold = 0;
	}

	public double payEconomical(double cashGiven) {
		if (cashGiven >= priceEconomical) {
			this.cashInRegister += priceEconomical;
			economicalSold++;
			return cashGiven - priceEconomical;
		} else {
			System.out.println("not enough money given!");
			return cashGiven;
		}
	}

	public double payGourmet(double cashGiven) {
		if (cashGiven >= priceGourmet) {
			this.cashInRegister += priceGourmet;
			gourmetSold++;
			return cashGiven - priceGourmet;
		} else {
			System.out.println("not enough money given!");
			return cashGiven;
		}
	}

	public boolean payEconomical(LyyraCard1 card) {
		if (card.balance() >= priceEconomical) {
			card.pay(priceEconomical);
			this.economicalSold++;
			return true;
		} else {
			return false;
		}
	}

	public boolean payGourmet(LyyraCard1 card) {
		if (card.balance() >= priceGourmet) {
			card.pay(priceGourmet);
			this.gourmetSold++;
			return true;
		} else {
			return false;
		}
	}

	public void loadMoneyToCard(LyyraCard1 card, double sum) {
		if (sum > 0) {
			card.loadMoney(sum);
			this.cashInRegister += sum;
		}
	}

	public String toString() {
		return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold
				+ " gourmet lunches sold: " + gourmetSold;
	}

}
