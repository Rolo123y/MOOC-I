package week5;

public class main084 {

	public static void main(String[] args) {
		counter counter = new counter(2, true);

		counter counter2 = new counter(true);
		System.out.println("counter value with only the check counstructor used: " + counter2.value());

		System.out.println("initial Value of counter: " + counter.value());

		counter.decrease();
		System.out.println("Value of counter: " + counter.value());

		counter.decrease(2);
		System.out.println("Value of counter: " + counter.value());

		counter.increase();
		System.out.println("Value of counter: " + counter.value());

		counter.increase(3);
		System.out.println("Value of counter: " + counter.value());

		counter.increase(-1);
		System.out.println("Value of counter: " + counter.value());
		counter.decrease(-1);
		System.out.println("Value of counter: " + counter.value());

	}

}
