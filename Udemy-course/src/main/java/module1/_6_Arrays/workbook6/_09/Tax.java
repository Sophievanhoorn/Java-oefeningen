package module1._6_Arrays.workbook6._09;

import java.util.Arrays;

public class Tax {

	/*
	 * Task 1 The workbook contains an array that stores four prices.
	 * 
	 * double[] price = {1.99, 2.99, 3.99, 4.99}; Create another array afterTax with
	 * the same length.
	 * 
	 * Task 2 Tax is 13%. Use a loop to update each element in afterTax to equal the
	 * original price + tax.
	 * 
	 * Task 3 Use Arrays.toString to print the arrays.
	 */

	public static void main(String[] args) {
		double[] price = { 1.99, 2.99, 3.99, 4.99 };
		double[] afterTax = new double[4];

		for (int i = 0; i < price.length; i++) {
			afterTax[i] = price[i] * 1.13;
		}

		// See instructions on Learn the Part (Workbook 6.9)
		System.out.println("The original prices are: " + Arrays.toString(price));
		System.out.println("The prices after tax are: " + Arrays.toString(afterTax));
	}
}
