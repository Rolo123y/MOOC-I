package week1;

import nhlstats.NHLStatistics;

public class main013 {

	public static void main(String[] args) {

		// Prints top 10 playes based on goals
		System.out.println("Prints top 10 playes based on goals");
		NHLStatistics.sortByGoals();
		NHLStatistics.top(10);
		System.out.println("");

		// Top 25 playes based on penalty amount
		System.out.println("Top 25 playes based on penalty amount");
		NHLStatistics.sortByPenalties();
		NHLStatistics.top(25);
		System.out.println("");

		// Statistics for Sidney Crosby
		System.out.println("Statistics for Sidney Crosby");
		NHLStatistics.searchByPlayer("Sidney Crosby");
		System.out.println("");

		// Statistics for Philadelphia Flyers
		System.out.println("Statistics for Philadelphia Flyers");
		NHLStatistics.teamStatistics("PHI");
		System.out.println("");

		// Players in Anaheim Ducks
		System.out.println("Players in Anaheim Ducks");
		NHLStatistics.sortByPoints();
		NHLStatistics.teamStatistics("ANA");
	}
}
