package week5;

public class main090 {

	public static void main(String[] args) {
		Team barcelona = new Team("FC Barcelona");

		Player brian = new Player("Brian",3);
		Player pekka = new Player("Pekka", 39);
		barcelona.addPlayer(brian);
		barcelona.addPlayer(pekka);
		barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
		System.out.println(barcelona.print());
		System.out.println("Total goals: " + barcelona.TotalGoals());
	}

}
