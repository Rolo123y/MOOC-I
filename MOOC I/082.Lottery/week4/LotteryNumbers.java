package week4;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

	private ArrayList<Integer> nums;

	public LotteryNumbers() {
		this.nums = new ArrayList<Integer>();
		this.drawNums();
	}

	public ArrayList<Integer> nums() {
		return this.nums;
	}

	public void drawNums() {
		Random rdm = new Random();
		int random = rdm.nextInt(39);

		while (!(nums().size() == 7 && random != 0)) {
			if (!(nums().contains(random))) {
				nums().add(random);
			}
			random = rdm.nextInt(39);
		}
	}

	public boolean containsNum(int number) {
		if (nums().contains(number)) {
			return true;
		}
		return false;
	}
}
