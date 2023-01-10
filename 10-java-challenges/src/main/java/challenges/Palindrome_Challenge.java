package challenges;

import java.util.Arrays;

public class Palindrome_Challenge {

	/*
	 * DEEL1: Create a mathod that returns a boolean to check if the next sentence
	 * is a Palindrome: "De mooie zeeman nam Anna mee zei oom Ed."
	 * 
	 * DEEL 2:Create a mathod that returns a boolean to check if the next sentence
	 * is a Palindrome:
	 * "Kauwen paarden als kraaien; dat is waar, niet waar is dat kraaien als paarden kauwen."
	 */

	public static void main(String[] args) {

		String sentence = "De mooie zeeman nam Anna mee zei oom Eda.";
		String sentence2 = "Kauwen paarden als kraaien; dat is waar, niet waar yay is dat kraaien als paarden kauwen.";

		isPalindrome(sentence);
		isPalindromeSentence(sentence2);

	}

	public static void isPalindrome(String sentence) {

		char[] strippedSentence = stripWholeSentence(sentence).toCharArray();

		boolean check = false;

		for (int i = 0, j = strippedSentence.length - 1; i < strippedSentence.length - 1 && j >= 0; i++, j--) {
			if (strippedSentence[i] != strippedSentence[j]) {
				strippedSentence[i] = Character.toUpperCase(strippedSentence[i]);
				strippedSentence[j] = Character.toUpperCase(strippedSentence[j]);

				System.out.printf(String.format("The sentence is not a Palindrome sentence : %s",
						String.copyValueOf(strippedSentence)));
				break;
			} else {
				check = true;
			}
		}
		if (check)
			System.out.println("The sentence '" + sentence + "' is a Palindrome!");
	}

	public static String stripWholeSentence(String sentence) {

		char[] array = sentence.toLowerCase().toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			if (Character.isAlphabetic(array[i])) {
				sb.append(array[i]);
			}
		}
		return sb.toString();
	}

	///////////////////////////////////////////////////////////////////// DEEL 2

	public static void isPalindromeSentence(String sentence) {

		boolean check = false;

		String[] strippedSentence = stripSentenceByWords(sentence.toLowerCase()).split(" ");

		for (int i = 0, j = strippedSentence.length - 1; i < strippedSentence.length - 1 && j >= 0; i++, j--) {
			if (!strippedSentence[i].equals(strippedSentence[j])) {
				strippedSentence[i] = strippedSentence[i].toUpperCase();
				strippedSentence[j] = strippedSentence[j].toUpperCase();
				System.out.println(String.format("The sentence is not a Palindrome sentence : %s",
						Arrays.toString(strippedSentence)));
				break;
			} else
				check = true;
		}
		if (check)
			System.out.println(String.format("The sentence : %s is a Palandrome sentence!", sentence));
	}

	public static String stripSentenceByWords(String sentence) {

		char[] array = sentence.toLowerCase().toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			if (Character.isAlphabetic(array[i]) || Character.isWhitespace(array[i])) {
				sb.append(array[i]);
			}
		}
		return sb.toString();
	}
}
