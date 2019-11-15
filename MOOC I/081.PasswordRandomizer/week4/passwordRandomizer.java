package week4;

import java.util.Random;

public class passwordRandomizer {

	private Random num;
	private int Strlength;

	public passwordRandomizer(int strlength) {
		this.Strlength = strlength;
		num = new Random();
	}

	public int getLength() {
		return this.Strlength;
	}

	public String createPassword() {
		char[] pass = new char[getLength()];
		for (int i = 0; i < getLength(); ++i) {
			int rdm = new Random().nextInt(26);
			char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(rdm);
			pass[i] = symbol;
		}
		String newpass = new String(pass);
		return newpass;
	}
}
