package challenges;

public class Challenge_2 {

	/*
	 * 2. Find the word Starting with an input string of words, find the
	 * second-to-last word of the string. For example, an input of “I love
	 * Codecademy” should return “love.”
	 * 
	 * To make your program more challenging, allow for a second numerical input, n,
	 * that results in returning the nth word of a string. So, for the string “I can
	 * program in Java” and n = 3, the output should be the third word, “program.”
	 */

	public static void main(String[] args) {

		String sentence = "I love Codecademy";
		String sentence2 = "I can program in Java";
		int wordAtIndex = 3;

		System.out.println(findWord(sentence));
		System.out.println(findWordAtIndex(sentence2, wordAtIndex));

	}

	private static String findWord(String string) {

		String[] words = string.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = -1; i <= words.length; i++) {
			if (i == 1) {
				return sb.append(words[i]).toString();
			}
		}
		return string;
	}
	
	////////////////////////////////////////////////// PART 2
	
	private static String findWordAtIndex(String string, int wordAtIndex) {
		String[] words = string.split(" ");
		StringBuilder sb2 = new StringBuilder();
		
		for(int i = -1; i <= words.length; i++) {
			if(i == wordAtIndex - 1) {
				return sb2.append(words[i]).toString();
			}
		}
		return string;
	}

}
