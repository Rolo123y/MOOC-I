package week6;

public class StringUtils {

	public static boolean included(String word, String searched) {
		if (word.toUpperCase().trim().contains(searched.toUpperCase().trim())) {
			return true;
		} else {
			return false;
		}
	}
}
