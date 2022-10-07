package challenges;

import java.util.Scanner;

public class challenge_1 {

	/*
	 * For this challenge, the input is a string of words, and the output should be
	 * the words in reverse but with the letters in the original order. For example,
	 * the string “Dog bites man” should output as “man bites Dog.”
	 * 
	 * After you’ve solved this challenge, try adding sentence capitalization and
	 * punctuation to your code. So, the string “Codecademy is the best!” should
	 * output as “Best the is Codecademy!”
	 */

	public static void main(String[] args) {
		String sentence = "Dog bites man";

		System.out.println(reverse(sentence));

	}

	public static String reverse(String string) {
		String[] stringWords;
		int i;

		// split sentence into words
		stringWords = string.split(" ");
		StringBuilder sb = new StringBuilder();
		boolean firstWord = true;

		/*
		 * for index = length of String[] - 1 because index starts at 0; continue as
		 * long as index is >= 0; index decreases by 1 for the order of the reversed
		 * sentence
		 */
		for (i = stringWords.length - 1; i >= 0; i--) {
			if (firstWord = true) {
				firstWord = false;
			}
			sb.append(" ");
			sb.append(stringWords[i]);

		}
		return sb.toString();
	}

	public static String reverse2(String s) {

		// Finding the index of the whitespaces
		int x = s.indexOf(" ");

		// Base condition
		if (x == -1)
			return s;

		// Recursive call
		String process = reverse2(s.substring(x + 1)) + " " + s.substring(0, x);

		return process;
	}
}
