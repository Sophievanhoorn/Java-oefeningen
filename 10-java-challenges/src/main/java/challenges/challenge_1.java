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
//		String reversed = reverse(sentence);
		String reversed2 = reverse2(sentence);

		System.out.println(reversed2);

		// reverses all the letters
		StringBuilder stringbuilder = new StringBuilder(sentence).reverse();
//		System.out.println(stringbuilder);

	}

	public static String reverse2(String string) {
		String[] stringWords;
		String reversedString = null;
		int i;
		
		Scanner scan = new Scanner(string);
		String input = scan.nextLine();
		stringWords = input.split(" ");
	
		
		for(i = stringWords.length -1; i >= 0; i--) {
			StringBuilder sb = new StringBuilder(stringWords[i] + " ");
			sb = sb.append(sb);
			
			System.out.println(sb);
		}
		
		
		return reversedString;

	}

	public static String reverse(String s) {

		// Finding the index of the whitespaces
		int x = s.indexOf(" ");

		// Base condition
		if (x == -1)
			return s;

		// Recursive call
		String process = reverse(s.substring(x + 1)) + " " + s.substring(0, x);

		return process;
	}
}
