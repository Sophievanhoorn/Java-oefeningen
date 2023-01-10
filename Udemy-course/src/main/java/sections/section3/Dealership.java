package sections.section3;

import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Java Dealership app!");
		System.out.println(" - Select option 'A' to buy a car.");
		System.out.println(" - Select option 'B' to sell a car.");

		String option = scanner.nextLine().toUpperCase();

		switch (option) {
		case "A":
			System.out.println("You chose option " + option + ", and want to buy a car.");
			System.out.println("What is your budget?");
			int budget = scanner.nextInt();
			if (budget >= 10000) {

				System.out.println("Great! A Volkswagen T-Roc is available!");
				System.out.println("\nDo you have insurance? Answer with 'yes' or 'no'.");
				scanner.nextLine();
				String insurance = scanner.nextLine();

				System.out.println("\nDo you have a drivers license? Answer with 'yes' or 'no'.");
				String license = scanner.nextLine();

				System.out.println("\nWhat is your credit score?");
				int creditScore = scanner.nextInt();

				if (insurance.equalsIgnoreCase("yes") && license.equalsIgnoreCase("yes") && creditScore > 660) {
					System.out.println("Sold! Pleasure doing business with you!");
				} else {
					System.out.println("Sorry, you are not eligible.");
				}
			} else {
				System.out.println("I'm Sorry, we don't sell cars under $10.000");
			}

			break;
		case "B":
			System.out.println("\nYou chose option " + option + ", and want to sell your car.");

			System.out.println("What is the value of your car?");
			int carValue = scanner.nextInt();

			System.out.println("\nWhat is your selling price?");
			int sellingPrice = scanner.nextInt();

			if (sellingPrice < carValue && sellingPrice < 30000) {
				System.out.println("\nWe will buy your car! A pleasure doing business with you!");
			} else {
				System.out.println("\nI'm sorry, we are not interested.");
			}
			break;
		default:
			System.out.println(option + " is not a valid option.");
		}

		scanner.close();
	}
}
