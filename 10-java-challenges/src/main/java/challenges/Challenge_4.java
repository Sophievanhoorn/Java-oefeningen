package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
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
		String[] wordArray = { "tar", "rat", "art", "pairs", "prais", "tra", "meats", "steam", "mates" };

//		System.out.println("Words are anagrams = " + checkIfAnagrams(inputArray)); //werkt
		System.out.println(sortAnagramList(wordArray));

//		System.out.println(checkIfSameLetters("pairs", "prais"));

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

	public static List<List> sortAnagramList(String[] wordArray) {


		List list = new ArrayList<>();
		List<List> lists = new ArrayList<>();

		int x = 0;
		int y = 1;

		boolean pangram = true;
		int count = 0;
		try {
			while (pangram) {
				try {
					
					for (String word : wordArray) {
//						if (compareWordInput(wordArray[y], word)) {
							if (checkIfSameLetters(wordArray[y], word)) {
							list.add(word);
							System.out.println(list);
							count++;
							y++;
							if (count == wordArray.length) {
								pangram = false;
								break;
							}
						} else {

							lists.add(list);
							list = new ArrayList<>();
						}
					}
				} catch (IndexOutOfBoundsException e) {
					break;
				}
			}
			return lists;

		} catch (IndexOutOfBoundsException e) {
			e.getMessage();

		}

		System.out.println(lists.toArray().toString());
		return lists;
	}
	
	public static String[] sortArrayList(String[] wordArray) {
		int size = wordArray.length;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < wordArray.length; j++) {
				if (wordArray[i].compareTo(wordArray[j]) > 0) {
					String temp = wordArray[i];
					wordArray[i] = wordArray[j];
					wordArray[j] = temp;
				}
			}
		}
		return wordArray;
	}

	// sorteert array input op alphabet en daarna Array op alphabet
	public static String[] sortArray(String[] wordArray) {
		List<String> list = new ArrayList<>();

		for (String word : wordArray) {
			String wordToAdd = "";
			StringBuilder sb = new StringBuilder();

			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);

			for (char letter : charArray) {
				wordToAdd = sb.append(letter).toString();
			}
			list.add(wordToAdd);
		}
		Collections.sort(list);
		list.toArray(wordArray);

		return wordArray;
	}

	public static boolean checkIfSameLetters(String word, String wordToCompare) {
		String[] wordArray = wordToCompare.split("|");
		word = word.toLowerCase();

		if (word.length() < wordArray.length) {
			return false;
		} else {
			for (int i = 0; i <= (wordArray.length - 1); i++) {
				if (!word.contains(wordArray[i])) {
					return false;
				}
			}
		}
		return true;
	}
}
