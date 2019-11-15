package week5;

public class main086 {

	// public static void main(String args[]) {
	// LyyraCard1 cardOfPekka = new LyyraCard1(10);
	//
	// System.out.println("money on the card " + cardOfPekka.balance());
	// boolean succeeded = cardOfPekka.pay(8);
	// System.out.println("money taken: " + succeeded);
	// System.out.println("money on the card " + cardOfPekka.balance());
	//
	// succeeded = cardOfPekka.pay(4);
	// System.out.println("money taken: " + succeeded);
	// System.out.println("money on the card " + cardOfPekka.balance());
	// }

	// public static void main(String[] args) {
	// CashRegister unicafeExactum = new CashRegister();
	//
	// double theChange = unicafeExactum.payEconomical(10);
	// System.out.println("the change was " + theChange );
	//
	// theChange = unicafeExactum.payEconomical(5);
	// System.out.println("the change was " + theChange );
	//
	// theChange = unicafeExactum.payGourmet(4);
	// System.out.println("the change was " + theChange );
	//
	// System.out.println( unicafeExactum );
	// }
	// public static void main(String[] args) {
	// CashRegister unicafeExactum = new CashRegister();
	//
	// double theChange = unicafeExactum.payEconomical(10);
	// System.out.println("the change was " + theChange);
	//
	// LyyraCard1 cardOfJim = new LyyraCard1(7);
	//
	// boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
	// System.out.println("payment success: " + succeeded);
	// succeeded = unicafeExactum.payGourmet(cardOfJim);
	// System.out.println("payment success: " + succeeded);
	// succeeded = unicafeExactum.payEconomical(cardOfJim);
	// System.out.println("payment success: " + succeeded);
	//
	// System.out.println(unicafeExactum);
	// }

	public static void main(String[] args) {
		CashRegister unicafeExactum = new CashRegister();
		System.out.println(unicafeExactum);

		LyyraCard1 cardOfJim = new LyyraCard1(2);

		System.out.println("the card balance " + cardOfJim.balance() + " euros");

		boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
		System.out.println("payment success: " + succeeded);

		unicafeExactum.loadMoneyToCard(cardOfJim, 100);

		succeeded = unicafeExactum.payGourmet(cardOfJim);
		System.out.println("payment success: " + succeeded);

		System.out.println("the card balance " + cardOfJim.balance() + " euros");

		System.out.println(unicafeExactum);
	}
}
