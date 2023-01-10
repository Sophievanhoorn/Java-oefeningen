package sections.section3;

import java.util.Scanner;

public class Delimiters {

	/*
	 * What is a delimiter?
	 * 
	 * White space that separates input data.
	 * 
	 * 20 30 40 need 3x scan.nextInt().
	 * 
	 * 
	 * Methods that follow delimiter pattern and skip the white spaces:
	 * scan.nextInt() || scan.nextLong() || scan.nextDouble() || scan.next()
	 * 
	 * scan.nextLine() takes the whole line as input.
	 * 
	 * scan.nextLine() TRAP -> when you put scanner.nextLine() AFTER
	 * scan.nextInt() etc... nextLine() reads the rest of the line from the
	 * integer input. Dodge this trap by adding an extra (useless)
	 * scan.nextLine() BEFORE the nextLine() you want to use.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two integers on the same line.");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println("Enter two very big integers on the same line.");
		long bigNum1 = scanner.nextLong();
		long bigNum2 = scanner.nextLong();

		System.out.println("Enter two decimals on the same line.");
		double decimal1 = scanner.nextDouble();
		double decimal2 = scanner.nextDouble();

		System.out.println("Enter two text values on the same line.");
		String string1 = scanner.next();
		String string2 = scanner.next();

		scanner.close();

		System.out.println("\tIntegers: " + num1 + " " + num2);
		System.out.println("\tBig Integers: " + bigNum1 + " " + bigNum2);
		System.out.println("\tDecimals: " + decimal1 + " " + decimal2);
		System.out.println("\tText values: " + string1 + " " + string2);
	}

}
