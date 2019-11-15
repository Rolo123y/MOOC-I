package week4;

public class main077 {

	public static void main(String[] args) {
		LyyraCard pekka = new LyyraCard(20);
		LyyraCard brian = new LyyraCard(30);

		pekka.payGourmet();
		brian.payEconomical();

		System.out.println(pekka);
		System.out.println(brian);

		pekka.loadMoney(20);
		brian.payGourmet();

		System.out.println(pekka);
		System.out.println(brian);

		pekka.payEconomical();
		brian.loadMoney(50);

		System.out.println(pekka);
		System.out.println(brian);

	}

}
