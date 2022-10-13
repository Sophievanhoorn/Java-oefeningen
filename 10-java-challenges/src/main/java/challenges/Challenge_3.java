package challenges;

public class Challenge_3 {

	/*
	 * For a given input string, return a Boolean TRUE if the string starts with a
	 * given input word. So, for an input string of “hello world” and input word
	 * “hello,” the program should return TRUE.
	 * 
	 * For a more advanced word searcher, create a program that returns the number
	 * of times a word appears in an input string. For example, given an input word
	 * “new” and an input string “I'm the new newt,” the program should return a
	 * value of 2.
	 */

	public static void main(String[] args) {

		String sentence = "hello world";
		String inputWord = "hello";
		String sentence2 = "I'm the new newt";
		String inputWord2 = "new";

		System.out.println("Input word found = " + wordFound(sentence, inputWord));
		System.out.println("The word " + "'" + inputWord2 + "'" + " was found: "
				+ numberOfWordsFound(sentence2, inputWord2) + " times.");

	}

	private static boolean wordFound(String string, String input) {

		if (string.contains(input)) {
			return true;
		}
		return false;
	}

	//////////////////////////////////////// PART 2

	private static int numberOfWordsFound(String string, String input) {

		String[] words = string.split(" ");
		int i = 0;

		for (String word : words) {
			if (word.contains(input)) {
				i++;
			}
		}
		return i;
	}
}
