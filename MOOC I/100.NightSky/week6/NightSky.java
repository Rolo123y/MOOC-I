package week6;

import java.util.Random;

public class NightSky {

	private double density;
	private int width;
	private int height;
	private int starsInLastPrint;

	public NightSky(double density) {
		this(density, 20, 10);
	}

	public NightSky(int width, int height) {
		this(0.1, width, height);
	}

	public NightSky(double density, int width, int height) {
		this.density = density;
		this.height = height;
		this.width = width;
	}

	public void printLine() {
		Random rdm = new Random();
		for (int i = 0; i < this.width; i++) {
			if (rdm.nextDouble() <= this.density) {
				System.out.print("*");
				starsInLastPrint++;
			} else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}

	public int starsInLastPrint() {
		return starsInLastPrint;
	}

	public void print() {
		starsInLastPrint = 0;
		for (int i = 0; i < this.height; i++) {
			printLine();
		}
	}
}
