package sections.section4;

import java.util.Scanner;

public class DiceJack {

	public static void main(String[] args) {
		playGame();
	}

	/**
	 * Function name: playGame (void)
	 * 
	 * What it does: 1.It asks the user for 3 numbers and checks if the numbers are
	 * between 1 and 6. 2.The function calls rollDice() 3 times and gets the sum.
	 * 3.Function checkIfWinner() ia called and prints the result. 4.Asks if the
	 * player wants another round.
	 */
	public static void playGame() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Choose 3 numbers between 1-6.");
		int dice1 = scan.nextInt();
		int dice2 = scan.nextInt();
		int dice3 = scan.nextInt();

		if (dice1 <= 0 || dice1 > 6 || dice2 <= 0 || dice2 > 6 || dice3 <= 0 || dice3 > 6) {
			System.out.println("The numbers must be between 1-6");

		} else {
			int roll1 = rollDice();
			int roll2 = rollDice();
			int roll3 = rollDice();

			int chosenNumSum = dice1 + dice2 + dice3;
			int diceSum = roll1 + roll2 + roll3;
			int difference = chosenNumSum - diceSum;

			if (checkWin(chosenNumSum, diceSum, difference)) {
				System.out.println("\nCongrats! You won this round :)");
				System.out.println("\nYour stats: \nChosen number: " + chosenNumSum + "\nRolled number: " + diceSum
						+ "\nDifference: " + difference);

			} else {
				System.out.println("\nSorry, you did not win this round :(");
				System.out
						.println("\nYour stats: \n\tChosen number: " + chosenNumSum + "\n\tRolled number: " + diceSum);
			}

			System.out.println("\nDo you wan't to play again? (yes/no)");
			scan.nextLine();

			String answer = scan.nextLine();

			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("\nLet's play again!\n");
				playGame();

			} else if (answer.equalsIgnoreCase("no")) {
				System.out.println("\nAlright see you next time!");
				System.exit(0);

			} else {
				System.out.println("\nSorry, you can only answer with 'yes' or 'no'.\nThe game is closing");
				System.exit(0);
			}
			scan.close();
		}
	}

	/**
	 * function name: rollDice (int)
	 * 
	 * @return (int)
	 * 
	 *         What it does: it returns a random number between 1 - 6
	 */
	public static int rollDice() {
		return (int) (Math.random() * 6) + 1;
	}

	/**
	 * Function name: checkIfWinner (void)
	 * 
	 * @param chosenNumSum (int)
	 * @param diceSum      (int)
	 * @param difference   (int)
	 * 
	 *                     What it does: 1.Checks if the sum of dices is less than
	 *                     the sum of chosen numbers.
	 */
	public static boolean checkWin(int chosenNumSum, int diceSum, int difference) {
		return diceSum < chosenNumSum && difference < 3;
	}
}
