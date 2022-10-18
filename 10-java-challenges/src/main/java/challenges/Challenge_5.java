package challenges;

public class Challenge_5 {

	/*
	 * A pangram is a sentence that contains all 26 letters of the English alphabet.
	 * One of the most well-known examples of a pangram is, “The quick brown fox
	 * jumps over the lazy dog.” Create a pangram checker that returns a Boolean
	 * TRUE if an input string is a pangram and FALSE if it isn’t.
	 * 
	 * For an added pangram challenge, create a perfect pangram checker. A perfect
	 * pangram is a sentence that uses each letter of the alphabet only once, such
	 * as, “Mr. Jock, TV quiz Ph.D., bags few lynx.”
	 */

	public static void main(String[] args) {

		String sentence = "The quick brown fox jumps over the lazy dog.";

		System.out.println("Sentence is pangram: " + checkIfPangram(sentence));
	}

	private static boolean checkIfPangram(String sentence) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String[] alphabetArray = alphabet.split("|");

		if (sentence.length() < alphabetArray.length) {
			return false;
		} else {

			for (int i = 0; i <= (alphabetArray.length - 1); i++) {
				if (!sentence.contains(alphabetArray[i])) {
					System.out.println("letter " + alphabetArray[i] + " not found in the sentence.");
					return false;
				}
			}
		}
		return true;
	}
}