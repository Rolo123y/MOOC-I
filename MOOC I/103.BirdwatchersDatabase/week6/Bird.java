package week6;

public class Bird {

	private String Name;
	private String LatinName;
	private int NumberOfObservation;

	public Bird(String Name, String LatinName) {
		this.Name = Name;
		this.LatinName = LatinName;
		this.NumberOfObservation = 0;
	}

	public String getName() {
		return this.Name;
	}

	public String getLatinName() {
		return this.LatinName;
	}

	public void IncreaseCount() {
		NumberOfObservation++;
	}

	public String toString() {
		return this.Name + " (" + this.LatinName + "): " + this.NumberOfObservation + " observations";
	}

}
