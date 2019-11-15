package week4;

public class HangmanLogic {

	private String word;
	private String guessedLetters;
	private int numberOfFaults;

	public HangmanLogic(String word) {
		this.word = word.toUpperCase();
		this.guessedLetters = "";
		this.numberOfFaults = 0;
	}

	public int numberOfFaults() {
		return this.numberOfFaults;
	}

	public String guessedLetters() {
		return this.guessedLetters;
	}

	public int losingFaultAmount() {
		return 12;
	}

	public void guessLetter(String letter) {
		letter = letter.toUpperCase();
		if (numberOfFaults != losingFaultAmount()) {
			if (!(guessedLetters().contains(letter))) {
				if (this.word.contains(letter)) {
					this.guessedLetters += letter;
				} else {
					numberOfFaults++;
					this.guessedLetters += letter;
				}
			}
		} else {
			System.out.println("You lost!");
			System.out.println("The word is: " + this.word);
		}
	}

	public String hiddenWord() {
		String word2 = "";
		String guessLetter = "";
		for (int i = 0; i < this.word.length(); i++) {
			char guess = this.word.charAt(i);
			guessLetter = Character.toString(guess);
			if (this.guessedLetters.contains(guessLetter)) {
				word2 += guessLetter;
			} else {
				word2 += "_";
			}
		}
		return word2;
	}

}
