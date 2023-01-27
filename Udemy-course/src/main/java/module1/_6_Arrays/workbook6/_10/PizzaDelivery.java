package module1._6_Arrays.workbook6._10;

import java.util.Scanner;

public class PizzaDelivery {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many pizza toppings do you want?");
		int numToppings = scan.nextInt();
		scan.nextLine(); // Throwaway nextLine()

		System.out.println("Great, enter each topping!");

		String[] toppings = new String[numToppings]; // Length of array equals what the user inputs.

		/*
		 * Create a for loop that runs through the length of the toppings array. Inside
		 * the for loop:
		 * 
		 * Print each index number followed by a dot.
		 */

		// Task 1 here
		for (int i = 0; i < toppings.length; i++) {
			System.out.print(i + 1 + ". ");
			toppings[i] = scan.nextLine();
		}

		System.out.println("\nThank you! Here are the toppings you ordered");

		for (int i = 0; i < toppings.length; i++) {
			System.out.println(i + 1 + ". " + toppings[i]);
		}

		System.out.println("\nPress anything to confirm your order.");
		scan.nextLine();
		
		System.out.println("Great, a driver is on the way!");

		scan.close();

	}
}
