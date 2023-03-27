package module1._6_Arrays.Javapedia;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Javapedia {
	public static void main(String[] args) {
		System.out.println("\n**********Javapedia**********");

		Scanner scan = new Scanner(System.in);
		int numberHistoricalFigures = 0;

		while (true) {
			try {
				System.out.println("How many historical figures will you register?");
				numberHistoricalFigures = scan.nextInt();
				scan.nextLine();
				if (numberHistoricalFigures > 0) {
					break;
				} else {
					System.out.println("Input must be a number > 0");
				}
			} catch (InputMismatchException e) {
				System.out.println("Input must be a number > 0");
				scan.next();
			}
		}

		String[][] array = new String[numberHistoricalFigures][3];

		for (int i = 0; i < array.length; i++) {
			System.out.println("\n\tFigure " + (i + 1));
			System.out.print("\t - Name: ");
			// Name
			array[i][0] = scan.nextLine();

			System.out.print("\t - Date of birth: ");
			// Birthday
			array[i][1] = scan.nextLine();

			// Occupasion
			System.out.print("\t - Occupation: ");
			array[i][2] = scan.nextLine();
		}

		System.out.println("\nThese are the values you stored:");
		print2DArray(array);

		System.out.print("\n\nWho do you want information on?\n");
		getName(scan.nextLine(), array);

		scan.close();
	}

	public static void getName(String name, String[][] array) {
		int hits = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i][0].equalsIgnoreCase(name)) {
				System.out.println("\tName: " + array[i][0] + "\n\tDate of birth: " + array[i][1] + "\n\tOccupation: "
						+ array[i][2]);
				hits++;
			}
		}
		System.out.println("\nNumber of results: " + hits);
	}

	public static void print2DArray(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("\n\t - " + Arrays.toString(array[i]));
		}
	}
}
