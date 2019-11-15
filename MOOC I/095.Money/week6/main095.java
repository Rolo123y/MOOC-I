package week6;

public class main095 {

	public static void main(String[] args) {
		System.out.println("testing plus");
		Money a = new Money(10, 0);
		Money b = new Money(5, 0);

		Money c = a.plus(b);

		System.out.println(a); // 10.00e
		System.out.println(b); // 5.00e
		System.out.println(c); // 15.00e

		a = a.plus(c);

		System.out.println(a); // 25.00e
		System.out.println(b); // 5.00e
		System.out.println(c); // 15.00e

		System.out.println("\ntesting less");
		Money d = new Money(10, 0);
		Money e = new Money(3, 0);
		Money f = new Money(5, 0);

		System.out.println(d.less(e)); // false
		System.out.println(e.less(f)); // true

		System.out.println("\ntesting minus");
		Money g = new Money(10, 0);
		Money h = new Money(3, 50);

		Money i = g.minus(h);

		System.out.println(g); // 10.00e
		System.out.println(h); // 3.50e
		System.out.println(i); // 6.50e

		i = i.minus(g);

		System.out.println(g); // 10.00e
		System.out.println(h); // 3.50e
		System.out.println(i); // 0.00e

	}

}
