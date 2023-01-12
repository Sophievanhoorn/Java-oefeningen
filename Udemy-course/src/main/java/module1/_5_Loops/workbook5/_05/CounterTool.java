package module1._5_Loops.workbook5._05;

import java.util.Scanner;

public class CounterTool {

	/*
	 * Your app should let the user choose:
	 * 
	 * the steps to count by.
	 * 
	 * a number to count from.
	 * 
	 * a number to count until.
	 * 
	 * Your program will count from the second number to the third number, in steps
	 * of the first.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("I hear you like to count by threes\n");
		System.out.println("Jimmy: It depends.");
		System.out.println("Oh, ok...");

		System.out.print("1. Pick a number to count by: ");
		int countBy = scan.nextInt();

		System.out.print("2. Pick a number to start counting from: ");
		int startFrom = scan.nextInt();

		System.out.print("3. Pick a number to count to: ");
		int countTo = scan.nextInt();

		for (int i = startFrom; i <= countTo; i += countBy) {
			if (i == countTo) {
				System.out.print(i);
			} else {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}
}
