package week6;

public class main100 {

	public static void main(String[] args) {
		NightSky NightSky = new NightSky(0.1,8, 4);
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
		System.out.println("------------");

		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());

	}

}
