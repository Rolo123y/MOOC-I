package week6;

public class DistributionCounter {

	private int Level0;
	private int Level1;
	private int Level2;
	private int Level3;
	private int Level4;
	private int Level5;
	private int Level6;

	public DistributionCounter() {
		this.Level0 = 0;
		this.Level1 = 0;
		this.Level2 = 0;
		this.Level3 = 0;
		this.Level4 = 0;
		this.Level5 = 0;
		this.Level6 = 0;
	}

	public void GradeOrganizer(int num) {
		if (num >= 0 && num <= 29) {
			Level0++;
		} else if (num >= 30 && num <= 34) {
			Level1++;
		} else if (num >= 35 && num <= 39) {
			Level2++;
		} else if (num >= 40 && num <= 44) {
			Level3++;
		} else if (num >= 45 && num <= 49) {
			Level4++;
		} else if (num >= 50 && num <= 60) {
			Level5++;
		} else {
			Level6++;
		}
	}

	public int getLevel(int i) {
		if (i == 0) {
			return this.Level0;
		} else if (i == 1) {
			return this.Level1;
		} else if (i == 2) {
			return this.Level2;
		} else if (i == 3) {
			return this.Level3;
		} else if (i == 4) {
			return this.Level4;
		} else if (i == 5) {
			return this.Level5;
		} else {
			return Level6;
		}
	}
}
