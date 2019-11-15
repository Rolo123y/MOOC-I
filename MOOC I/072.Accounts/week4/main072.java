package week4;


public class main072 {

	public static void main(String[] args) {
		// Account bartosAccount = new Account("Barto's account", 100.00);
		// Account bartosSwissAccount = new Account("Barto's account in Switzerland",
		// 1000000.00);
		//
		// System.out.println("Initial state");
		// System.out.println(bartosAccount);
		// System.out.println(bartosSwissAccount);
		//
		// System.out.println();
		// bartosAccount.withdrawal(20);
		// System.out.println("Withdrawal $20");
		// System.out.println("Barto's account balance is now: " +
		// bartosAccount.getAmount());
		// bartosSwissAccount.deposit(200);
		// System.out.println("deposit $200");
		// System.out.println("Barto's Swiss account balance is now: " +
		// bartosSwissAccount.getAmount());
		//
		// System.out.println();
		// System.out.println("Final state");
		// System.out.println(bartosAccount);
		// System.out.println(bartosSwissAccount);

		Account A = new Account("A", 100.0);
		Account B = new Account("B", 0.0);
		Account C = new Account("C", 0.0);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println("Transfer $50 from A to B");
		Account.transfer(A, B, 50.0);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println("Transfer $25 from B to C");
		Account.transfer(B, C, 25.0);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
	}

}
