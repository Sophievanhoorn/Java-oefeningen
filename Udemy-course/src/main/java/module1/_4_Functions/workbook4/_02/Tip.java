package module1._4_Functions.workbook4._02;

public class Tip {

	public static void main(String[] args) {
		double bill = 53.5;
		System.out.println("Waiter: I hope you enjoyed your meal!");
		System.out.println("Thank you!");

		tipTheWaiter(bill);
	}

	// Task 1: Make a function here. See the doc comment for details.

	public static void tipTheWaiter(Double bill) {

		double tip = bill * 0.15;
		System.out.println("Your service was wonderfull! Please, accept this tip: $" + tip);
	}

	/*
	 * Function name: tipTheWaiter - calculates a tip and prints it.
	 * 
	 * @param bill (double).
	 */

}