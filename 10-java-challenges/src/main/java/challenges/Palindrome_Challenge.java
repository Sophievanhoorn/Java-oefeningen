package challenges;


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

		String sentence = "De mooie zeeman nam Anna mee zei oom Ed.";
		String sentence2 = "Kauwen paarden als kraaien; dat is waar, niet waar is dat kraaien als paarden kauwen.";

		isPalindrome(sentence);

	}

	public static boolean isPalindrome(String sentence) {

		char[] array = sentence.toLowerCase().toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			if (Character.isAlphabetic(array[i])) {
				sb.append(array[i]);
			}
		}
		boolean check = false;

		char[] strippedSentence = sb.toString().toCharArray();

		for (int x = 0, y = strippedSentence.length - 1; x < strippedSentence.length - 1 && y >= 0; x++, y--) {
			if (strippedSentence[x] != strippedSentence[y]) {
				char letter1 = strippedSentence[x];
				char letter2 = strippedSentence[y];
				System.out.println("The sentence is not a Palindrome. Letter " + letter1 + " at index " + x
						+ " and letter " + letter2 + " at index " + "" + y + " are not the same.");
				break;
			} else {
				check = true;
			}
		}
		if (check)
			System.out.println("The sentence " + sentence + " is a Palindrome!");

		return false;
	}
	
	///////////////////////////////////////////////////////////////////// DEEL 2

}
