package challenges;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

		String sentence = "The quick Brown fox jumps over the lazy dog.";
		String sentence2 = "Mr. Jock, TV quiz Ph.D., bags few lynx.";


		System.out.println("Sentence is a pangram: " + checkIfPangram(sentence));
		System.out.println("Sentence is a perfect pangram: " + checkIfPerfectPangram(sentence2));
	}

	private static boolean checkIfPangram(String sentence) {
		String[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".split("|");
		sentence = sentence.toLowerCase();

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

	////////////////////////////////////////////////////// PART 2

	private static boolean checkIfPerfectPangram(String sentence) {
		String[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".split("|");

		if (checkIfPangram(sentence)) {
			String[] sentenceArray = sentence.toLowerCase().split("|");
			Arrays.sort(sentenceArray);

			for (int i = 0; i <= (alphabetArray.length - 1); i++) {
				if (!sentenceArray[0].equals("a")) {
					Arrays.sort(sentenceArray);
					sentenceArray = removeFromArray(sentenceArray, 0).toArray(new String[0]);
					if (Arrays.equals(alphabetArray, sentenceArray)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static List<String> removeFromArray(String[] stringArray, int index) {
		List<String> list = new ArrayList<>(Arrays.asList(stringArray));

		try {
			list.remove(index);
			list.remove(null);

			return list;

		} catch (IndexOutOfBoundsException e) {
			e.getStackTrace();
		}
		return list;
	}
}