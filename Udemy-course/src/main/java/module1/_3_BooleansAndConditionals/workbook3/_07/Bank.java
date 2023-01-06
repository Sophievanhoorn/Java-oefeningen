package module1._3_BooleansAndConditionals.workbook3._07;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {

		// See Learn the Part for the complete instructions (link in resources folder of
		// Udemy video).

		/*
		 * In this workbook, you work for the Royal Bank of Java. Your job is to approve
		 * customers for a loan if they:
		 * 
		 * Have at least $10,000 in their savings account.
		 * 
		 * Have less than $5,000 in credit card debt.
		 * 
		 * Have worked for more than 2 years.
		 * 
		 * The user will also need to provide their name.
		 * 
		 * Your task is to scan for values and use if-else to control how these
		 * statements print.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("\n****ROYAL BANK OF JAVA****");
		System.out.println("Are you here to get a mortgage? (yes or no)");

		switch (scan.next()) {
		case "yes":
			System.out.println("\nGreat! In one line" + "\nHow much money do you have in your savings?"
					+ "\nAnd, how much do you owe in credit card debt?");
			double savings = scan.nextDouble();
			double debt = scan.nextDouble();

			System.out.println("\nHow many years have you worked for?");
			int workYears = scan.nextInt();

			System.out.println("\nWhat is your name?");
			scan.nextLine();
			String name = scan.nextLine();

			if (savings >= 10000 && debt < 5000 && workYears > 2 && !name.equals("")) {
				System.out.println("\nCongratulations " + name + ", you have been approved!");

			} else {
				System.out.println("\nSorry, you are not eligible for a mortgage.");
			}
			break;

		case "no":
			System.out.println("\nOK. Have a nice day!");
			break;
		default:
			System.out.println("\nThe answer must be answered with 'yes' or 'no'.");
		}
		scan.close();
	}
}
