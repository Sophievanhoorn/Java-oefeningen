package module1._3_BooleansAndConditionals.workbook3._02;

public class JavaMart {
	public static void main(String[] args) {

		// See Learn the Part for the complete instructions (link in resources folder of
		// Udemy video).

		// You start with $100, and your kids will ask you to buy them stuff.

		double wallet = 100;

		double toyCar = 5.99;
		System.out.println("Can I get this car?");

		if (wallet >= toyCar) {
			System.out.println("Sure!");
			wallet -= toyCar;
		} else {
			System.out.println("Sorry, I only have $" + wallet + " left.");
		}

		double nike = 95.99;
		System.out.println("Can I get these nike shoes?");

		if (wallet >= nike) {
			System.out.println("Sure!");
			wallet -= nike;
		} else {
			System.out.println("Sorry, I only have $" + wallet + " left.");
		}
	}
}
