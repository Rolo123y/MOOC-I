package week4;

import java.util.ArrayList;

public class main082 {

	public static void main(String[] args) {
		LotteryNumbers lottery = new LotteryNumbers();
		ArrayList<Integer> nums = lottery.nums();

		System.out.println("Lottery numbers:");
		for (int number : nums) {
			System.out.print(number + " ");
		}
		System.out.println("");

	}

}
