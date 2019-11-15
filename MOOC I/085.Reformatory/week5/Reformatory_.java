package week5;

public class Reformatory_ {

	private int weightsMeasureCount = 0;

	public int weight(Person person) {
		this.weightsMeasureCount++;
		return person.getWeight();
	}

	public void feed(Person person) {
		person.setWeight(person.getWeight() + 1);
	}

	public int totalWeightsMeasured() {
		return this.weightsMeasureCount;
	}

}
