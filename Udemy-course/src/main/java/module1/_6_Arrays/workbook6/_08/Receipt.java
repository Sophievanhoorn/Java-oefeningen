package module1._6_Arrays.workbook6._08;

public class Receipt {
	public static void main(String[] args) {

		/*
		 * Create an array that stores three apples you purchased:
		 * 
		 * "Gala", "Granny Smith", "Macintosh" Create another array that stores the
		 * price of each apple:
		 * 
		 * 1.99, 1.49, 1.29
		 */

		String[] apples = { "Gala", "Granny Smith", "Macintosh" };
		double[] price = { 1.99, 1.49, 1.29 };

		System.out.println("Here's your receipt:\n");

		for (int i = 0; i < apples.length; i++) {

			System.out.println("\t" + apples[i] + ":" + +price[i]); // to be used in for loop.
		}
	}
}
