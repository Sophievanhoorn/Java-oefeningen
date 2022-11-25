package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		String[] wordArray = { "tar", "rat", "art", "pairs", "prais", "tra", "meats", "steam", "mates" };

		System.out.println("Words are anagrams = " + checkIfAnagrams(inputArray));
		System.out.println(sortAnagramList(wordArray));

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

	public static boolean compareWordInput(String input, String nextInput) {

		input = input.toLowerCase();

		nextInput = nextInput.toLowerCase();

		if (input.length() == nextInput.length()) {

			char[] firstInputCharArray = input.toCharArray();
			char[] nextInputCharArray = nextInput.toCharArray();

			Arrays.sort(firstInputCharArray);
			Arrays.sort(nextInputCharArray);

			return Arrays.equals(firstInputCharArray, nextInputCharArray);
		}
		return false;
	}

	///////////////////////////////////////// PART 2

	public static Map<String, List<String>> sortAnagramList(String[] wordArray) {

		Map<String, List<String>> map = new HashMap<>();

		for (String word : wordArray) {
			String sortedWord = sortKey(word);

			if (map.containsKey(sortedWord)) {
				map.get(sortedWord).add(word);

			} else {
				map.put(sortedWord, new ArrayList<>());
				map.get(sortedWord).add(word);
			}
		}
		return map;
	}

	public static String sortKey(String word) {
		word = word.toLowerCase();

		char[] charArray = word.toCharArray();
		Arrays.sort(charArray);

		return new String(charArray);
	}
}
