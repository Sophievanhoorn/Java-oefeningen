package module1._3_BooleansAndConditionals.challenge3;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {

		// See Learn the Part for the complete instructions.

		/*
		 * 1. store answer
		 * 
		 * 2.check answer
		 * 
		 * 3. Print a final message. If score is 15 or higher, print:
		 * 
		 * Wow, you know your stuff!
		 * 
		 * If score is < than 15 but greater than or equal to 5:
		 * 
		 * Not bad!
		 * 
		 * otherwise:
		 * 
		 * better luck next time.
		 */

		Scanner scan = new Scanner(System.in);
		int score = 0;

		System.out.println("1. Which country held the 2016 Summer Olympics?");
		System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
		String answer1 = scan.nextLine();
		if (answer1.equalsIgnoreCase("c")) {
			score += 5;
		}

		System.out.println("\n2. Which planet is the hottest?");
		System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
		String answer2 = scan.nextLine();
		if (answer2.equalsIgnoreCase("a")) {
			score += 5;
		}

		System.out.println("\n3. What is the rarest blood type?");
		System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
		String answer3 = scan.nextLine();
		if (answer3.equalsIgnoreCase("d")) {
			score += 5;
		}

		System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
		System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
		String answer4 = scan.nextLine();
		if (answer4.equalsIgnoreCase("a") || answer4.equalsIgnoreCase("b")) {
			score += 5;
		}

		System.out.println("Your final score is: " + score + "/20");

		if (score >= 15) {
			System.out.println("Wow, you know your stuff!");
		} else if (score > 5 && score < 15) {
			System.out.println("Not bad!");
		} else {
			System.out.println("Better luck next time.");
		}

		scan.close();
	}
}
