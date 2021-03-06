package week4;

public class Product {

	private double price;
	private double amount;
	private String name;

	public Product(String name, double price, double amount) {
		this.price = price;
		this.amount = amount;
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printProduct() {
		System.out.println(getName() + ", price " + getPrice() + ", amount " + getAmount());
	}

}
