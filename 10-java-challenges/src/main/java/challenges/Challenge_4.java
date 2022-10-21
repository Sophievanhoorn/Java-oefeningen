package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

		String[] inputArray = { "pairs", "Paris", "prais" };
		String[] wordArray = { "tar", "rat", "art", "meats", "steam" };

//		System.out.println("Words are anagrams = " + checkIfAnagrams(inputArray));
		System.out.println(sortAnagramArray(wordArray));
	}

	public static boolean checkIfAnagrams(String[] inputArray) {

		boolean isAnagram = false;
		int x = 1;

		for (int i = 0; x != inputArray.length; i++) {
			if (x != inputArray.length) {
				try {
					isAnagram = compareWordInput(inputArray[i], inputArray[x]);
					x++;

				} catch (IndexOutOfBoundsException e) {
					System.err.println(e.getMessage());
				}
			}
		}
		return isAnagram;
	}

	///////////////////////////////////////// PART 2

	public static String[] sortAnagramArray(String[] wordArray) {
		String[] sortedAnagramArray = null;
		int i = 0;
		int x = 1;

		for (i = 0; i < wordArray.length; i++) {

			while (compareWordInput(wordArray[i], wordArray[x])) {
				List<String> list = new ArrayList<>();
				list.add(wordArray[i]);
				list.add(wordArray[x]);
			}
			List[] listArray = null;
		}

		return sortedAnagramArray;
	}

	public static boolean compareWordInput(String input, String nextInput) {

		input = input.toLowerCase();
		System.out.println(input);

		nextInput = nextInput.toLowerCase();
		System.out.println(nextInput);

		if (input.length() == nextInput.length()) {

			char[] firstInputCharArray = input.toCharArray();
			char[] nextInputCharArray = nextInput.toCharArray();

			Arrays.sort(firstInputCharArray);
			Arrays.sort(nextInputCharArray);

			return Arrays.equals(firstInputCharArray, nextInputCharArray);
		}
		return false;
	}
}
