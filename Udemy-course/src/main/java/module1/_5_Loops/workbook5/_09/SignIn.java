package module1._5_Loops.workbook5._09;

import java.util.Scanner;

public class SignIn {

	/*
	 * The program starts with a stored username and password: When signing in,
	 * prompt the user to enter their username and password.
	 *
	 * Set up a loop that keeps running while the username OR password is incorrect.
	 * 
	 * After they enter the correct information, print:
	 */

	public static void main(String[] args) {
		String username = "Samantha";
		String password = "Java <3";

		Scanner scan = new Scanner(System.in);
		System.out.println("\nWelcome to Javagram! Sign in below\n");
		System.out.print("- Username: ");
		String usernameEntry = scan.nextLine();

		System.out.print("- Password: ");
		String passwordEntry = scan.nextLine();

		while (!usernameEntry.equals(username) || !passwordEntry.equals(password)) {
			System.out.println("\nIncorrect, please try again!\n");

			System.out.print("- Username: ");
			usernameEntry = scan.nextLine();

			System.out.print("- Password: ");
			passwordEntry = scan.nextLine();
		}
		System.out.println("\nWelcome " + username + "!");

		scan.close();
	}
}
