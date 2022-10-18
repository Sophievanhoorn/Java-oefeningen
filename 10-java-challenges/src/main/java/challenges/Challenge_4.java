package challenges;

import java.util.Arrays;

public class Challenge_4 {

	/*
	 * Two words are anagrams if they contain the same letters but in a different
	 * order. Here are a few examples of anagram pairs:
	 * 
	 * “listen” and “silent” “binary” and “brainy” “Paris” and “pairs” For a given
	 * input of two strings, return a Boolean TRUE if the two strings are anagrams.
	 * 
	 * As an added challenge, for a given array of strings, return separate lists
	 * that group anagrams together. For example, the input {“tar,” “rat,” “art,”
	 * “meats,” “steam”}, the output should look something like {[“tar,” “rat,”
	 * “art”], [“meats,” “steam”]}.
	 */

	public static void main(String[] args) {

		String[] inputArray = { "pairs", "Paris"};
		String[] wordArray = { "tar", "rat", "art", "meats", "steam" };

		System.out.println("Words are anograms = " + checkIfAnagrams(inputArray));
		System.out.println(sortAnagramArray(wordArray));
	}

	public static boolean checkIfAnagrams(String[] inputArray) {

		boolean isAnagram = false;
		int count = 0;
		int i = 0;

		for (String input : inputArray) {
			input = inputArray[i].toLowerCase();

			try {
				String nextInput = inputArray[i + 1].toLowerCase();
				if (input.length() != nextInput.length()) {
					return false;
				}else {
				i++;
				if (count == inputArray.length) {
					return isAnagram;
				} else {
						char[] firstInputToArray = input.toCharArray();
						char[] nextInputToArray = nextInput.toCharArray();
						Arrays.sort(firstInputToArray);
						Arrays.sort(nextInputToArray);

						isAnagram = Arrays.equals(firstInputToArray, nextInputToArray);
						count++;
					}
				}
			} catch (IndexOutOfBoundsException e) {
				e.getStackTrace();
			}
		}
		return isAnagram;
	}

	///////////////////////////////////////// PART 2

	public static String[] sortAnagramArray(String[] inputArray) {

		for (int i = 0; i < inputArray.length; i++) {
			
			checkIfAnagrams(inputArray);
			String input = inputArray[i].toLowerCase();	

		}

		return inputArray;
	}
}
