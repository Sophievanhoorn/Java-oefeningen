package challenges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Challenge_8 {

	/*
	 * PRODUCT MAXIMIZER For a given input array of numbers, find the two that
	 * result in the largest product. The output should include the two numbers in
	 * the array along with their product.
	 * 
	 * As an extra challenge, use an input of two arrays of numbers and find two
	 * numbers — one from each input array — that results in the largest product.
	 */

	public static void main(String[] args) {

		int[] numberArray = { 1, 14, 7, 5, 20, 20 };
		int[] numberArray2 = { 1, 14 };
		int[] numberArray3 = {};

		System.out.println(getMaxProduct(numberArray));
		System.out.println(getMaxProduct(numberArray2));
		System.out.println(getMaxProduct(numberArray3));
	}

	public static String getMaxProduct(int[] numberArray) {
		int numMin = 0;
		int numMax = 0;
		int arrayLength = numberArray.length;

		if (arrayLength >= 2) {
			Arrays.sort(numberArray);

			numMin = Array.getInt(numberArray, arrayLength - 2);
			numMax = Array.getInt(numberArray, arrayLength - 1);

			int result = numMin * numMax;
			int[] resultArray = { numMin, numMax, result };

			return Arrays.toString(resultArray);

		} else {
			System.out.println("The input array contains " + arrayLength
					+ " number(s). This method needs at least 2 numbers to work.");
			return "";
		}
	}

	//////////////////////////////////////////////////// PART 2

}
