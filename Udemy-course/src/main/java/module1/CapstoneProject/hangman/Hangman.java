package module1.CapstoneProject.hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hangman {

	public static final String[] allWords = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel", "cat",
			"clam", "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox",
			"frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule",
			"newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven", "rhino",
			"salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad",
			"trout", "turkey", "turtle", "weasel", "whale", "wolf", "wombat", "zebra" };

	public static final String[] gallows = {
			"+---+\n" + "|   |\n" + "    |\n" + "    |\n" + "    |\n" + "    |\n" + "=========\n",

			"+---+\n" + "|   |\n" + "O   |\n" + "    |\n" + "    |\n" + "    |\n" + "=========\n",

			"+---+\n" + "|   |\n" + "O   |\n" + "|   |\n" + "    |\n" + "    |\n" + "=========\n",

			" +---+\n" + " |   |\n" + " O   |\n" + "/|   |\n" + "     |\n" + "     |\n" + " =========\n",

			" +---+\n" + " |   |\n" + " O   |\n" + "/|\\  |\n" + // if you were wondering, the only way to print '\' is
																	// with a trailing escape character, which also
																	// happens to be '\'
					"     |\n" + "     |\n" + " =========\n",

			" +---+\n" + " |   |\n" + " O   |\n" + "/|\\  |\n" + "/    |\n" + "     |\n" + " =========\n",

			" +---+\n" + " |   |\n" + " O   |\n" + "/|\\  |\n" + "/ \\  |\n" + "     |\n" + " =========\n" };

	public static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		char[] word = getWord(allWords);
		char[] field = createField(word.length);
		List<String> guessList = new ArrayList<>();
		int count = 0;

		while (!checkWin(field, word)) {
			if (count < gallows.length) {

				System.out.println("Guess: " + convertToString(field));
				String letter = scan.nextLine();

				// Checks if 1 letter and alphanumeric
				letter = checkForCorrectInput(letter);

				// Checks if duplicate guess
				while (guessList.contains(letter) || String.valueOf(field).contains(letter)) {
					System.out.print("\nYou already guessed this letter. \nTry again: ");
					letter = scan.nextLine();
					letter = checkForCorrectInput(letter);
				}

				// Checks if word contains guessed letter
				if (!checkMatch(letter, word, field)) {
					guessList.add(letter);
					printGallow(gallows, count);
					count++;
				}
				System.out.println("Your guesses: " + printList(guessList));

			} else {
				System.out.println("\n\tR.I.P");
				System.out.println("The word is: " + String.valueOf(word).toUpperCase());
				System.exit(0);
			}
		}
		System.out.println("\n\tYou won!");
		System.out.println("\t" + convertToString(field));
	}

	public static String checkForCorrectInput(String letter) {

		while ((letter.length() > 1) || (!letter.matches("^[a-zA-Z0-9]*$"))) {
			System.out.println("\n- You can only choose 1 letter at a time");
			System.out.println("- You can only choose alphanumeric characters");
			System.out.print("Try again: ");
			letter = scan.nextLine();
		}
		return letter;
	}

	public static boolean checkWin(char[] field, char[] word) {
		String fieldString = String.valueOf(field);
		String wordString = String.valueOf(word);

		return fieldString.equalsIgnoreCase(wordString);
	}

	public static boolean checkMatch(String letter, char[] word, char[] field) {
		boolean match = false;

		for (int i = 0; i < word.length; i++) {
			if (letter.charAt(0) == word[i]) {
				field[i] = letter.charAt(0);
				match = true;
			}
		}
		return match;
	}

	public static char[] createField(int length) {

		char[] field = new char[length];
		for (int i = 0; i < length; i++) {
			field[i] = '?';
		}
		return field;
	}

	public static char[] getWord(String[] words) {

		int randomIndex = (int) (Math.random() * words.length);
		return words[randomIndex].toCharArray();
	}

	private static void printGallow(String[] gallows, int count) {
		for (int i = 0; i <= count; i++) {
			System.out.println(gallows[i]);
		}
	}

	public static String printList(List<String> list) {
		StringBuilder sb = new StringBuilder();
		for (String letter : list) {
			sb.append(letter).append(" ");
		}
		return sb.toString().toUpperCase();
	}

	public static String convertToString(char[] word) {
		StringBuilder sb = new StringBuilder();
		for (char letter : word) {
			sb = new StringBuilder(sb.append(letter).append(" "));
		}
		return sb.toString().toUpperCase();
	}
}