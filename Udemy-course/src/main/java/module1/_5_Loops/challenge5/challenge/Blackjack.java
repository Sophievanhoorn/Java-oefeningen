package module1._5_Loops.challenge5.challenge;

import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		System.out.println("\nWelcome to Java Casino!");
		System.out.println("Do you have a knack for Black Jack?");
		System.out.println("We shall see..");
		System.out.println("..Ready? Press anything to begin!");
		getNextLine();

		int cardNumber1 = drawRandomNumber();
		int cardNumber2 = drawRandomNumber();

		System.out.println("\nYou get a \n" + getCard(cardNumber1) + "\n and \n" + getCard(cardNumber2));

		int handTotal = cardNumber1 + cardNumber2;
		System.out.println("Your total is: " + handTotal);

		int dealerCard1 = drawRandomNumber();
		int dealerCard2 = drawRandomNumber();

		System.out.println("\nThe dealer shows \n" + getCard(dealerCard1) + "\nand a card facing down\n" + faceDown());
		int dealerTotal = dealerCard1 + dealerCard2;

		System.out.println("\nThe dealer's total is hidden");

		while (true) {
			String answer = hitOrStay();

			if (answer.equalsIgnoreCase("stay")) {
				break;
			}
			int newCard = drawRandomNumber();
			handTotal += newCard;

			System.out.println("\nYou get a \n" + getCard(newCard));
			System.out.println("\nYour new total is:" + handTotal);

			if (handTotal > 21) {
				System.out.println("Bust! Player loses.");
				System.exit(0);
			}
		}

		System.out.println("\nDealer's turn");
		System.out.println("\nThe dealer's cards are \n" + getCard(dealerCard1) + "\nand a \n" + getCard(dealerCard2));

		while (dealerTotal < 17) {
			int newDealerCardNum = drawRandomNumber();
			dealerTotal += newDealerCardNum;

			System.out.println("\nDealer gets a \n" + getCard(newDealerCardNum));
			System.out.println("\nDealer's total is " + dealerTotal);
		}
		if (dealerTotal > 21) {
			System.out.println("Bust! Dealer loses.");
			System.exit(0);
		}

		System.out.println("\nYour total is " + handTotal);
		System.out.println("Dealer's total is " + dealerTotal);

		if (handTotal > dealerTotal) {
			System.out.println("\nPlayer wins!");
		} else {
			System.out.println("\nDealer wins!");
		}
	}

	/**
	 * Function name – drawgetCard
	 * 
	 * @return (int)
	 *
	 *         Inside the function: 1. Gets a random number between 1 and 13. 2.
	 *         Returns a card.
	 */
	public static int drawRandomNumber() {
		return (int) (Math.random() * 13) + 1;
	}

	/**
	 * Function name – cardString
	 * 
	 * @param cardNumber (int)
	 * @return (String)
	 *
	 *         Inside the function: 1. Returns a String drawing of the card.
	 */
	public static String getCard(int cardNumber) {
		switch (cardNumber) {
		case 1:
			return "   _____\n" + "  |A _  |\n" + "  | ( ) |\n" + "  |(_'_)|\n" + "  |  |  |\n" + "  |____V|\n";
		case 2:
			return "   _____\n" + "  |2    |\n" + "  |  o  |\n" + "  |     |\n" + "  |  o  |\n" + "  |____Z|\n";
		case 3:
			return "   _____\n" + "  |3    |\n" + "  | o o |\n" + "  |     |\n" + "  |  o  |\n" + "  |____E|\n";
		case 4:
			return "   _____\n" + "  |4    |\n" + "  | o o |\n" + "  |     |\n" + "  | o o |\n" + "  |____h|\n";
		case 5:
			return "   _____ \n" + "  |5    |\n" + "  | o o |\n" + "  |  o  |\n" + "  | o o |\n" + "  |____S|\n";
		case 6:
			return "   _____ \n" + "  |6    |\n" + "  | o o |\n" + "  | o o |\n" + "  | o o |\n" + "  |____6|\n";
		case 7:
			return "   _____ \n" + "  |7    |\n" + "  | o o |\n" + "  |o o o|\n" + "  | o o |\n" + "  |____7|\n";
		case 8:
			return "   _____ \n" + "  |8    |\n" + "  |o o o|\n" + "  | o o |\n" + "  |o o o|\n" + "  |____8|\n";
		case 9:
			return "   _____ \n" + "  |9    |\n" + "  |o o o|\n" + "  |o o o|\n" + "  |o o o|\n" + "  |____9|\n";
		case 10:
			return "   _____ \n" + "  |10  o|\n" + "  |o o o|\n" + "  |o o o|\n" + "  |o o o|\n" + "  |___10|\n";
		case 11:
			return "   _____\n" + "  |J  ww|\n" + "  | o {)|\n" + "  |o o% |\n" + "  | | % |\n" + "  |__%%[|\n";
		case 12:
			return "   _____\n" + "  |Q  ww|\n" + "  | o {(|\n" + "  |o o%%|\n" + "  | |%%%|\n" + "  |_%%%O|\n";
		case 13:
			return "   _____\n" + "  |K  WW|\n" + "  | o {)|\n" + "  |o o%%|\n" + "  | |%%%|\n" + "  |_%%%>|\n";
		default:
			return "Something went wrong";
		}
	}

	/**
	 * Function name: faceDown
	 * 
	 * @return (String)
	 * 
	 *         What it does: prints a card facing down
	 */
	public static String faceDown() {
		return "   _____\n" + "  |     |\n" + "  |  J  |\n" + "  | JJJ |\n" + "  |  J  |\n" + "  |_____|\n";
	}

	/**
	 * Function name: hitOrStay
	 * 
	 * @return (String)
	 *
	 *         Inside the function: 1. Asks the user to hit or stay. 2. If the user
	 *         doesn't enter "hit" or "stay", keep asking them to try again by
	 *         printing: Please write 'hit' or 'stay' 3. Returns the user's option
	 */

	public static String hitOrStay() {
		System.out.println("Hit or stay?");
		String answer = getNextLine();

		while (!(answer.equalsIgnoreCase("hit") || answer.equalsIgnoreCase("stay"))) {
			System.out.println("Please answer with 'hit' or 'stay'.");
			answer = getNextLine();
		}
		return answer;
	}

	/**
	 * Function name: getNextLine
	 * 
	 * @return (String)
	 * 
	 *         What it does: creates a new scanner and scans next line
	 */
	public static String getNextLine() {
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}
