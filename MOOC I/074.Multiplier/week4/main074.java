package week4;

public class main074 {

	public static void main(String[] args) {
		Multiplier threeMultiplier = new Multiplier(3);
		System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

		Multiplier fourMultiplier = new Multiplier(4);
		System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

		System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
		System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));

	}

}
