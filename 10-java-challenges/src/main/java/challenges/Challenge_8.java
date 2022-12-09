package challenges;

import java.lang.reflect.Array;
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

		int[] numberArray = { 1, 34, 7, 5, 20, 20 };
		int[] numberArray2 = { 1, 14, 22 };
		int[] numberArray3 = { 2 };

		System.out.println(getMaxProduct(numberArray));
		System.out.println(getMaxProduct(numberArray2));
		System.out.println(getMaxProduct(numberArray3));

		System.out.println(getMaxProductFrom2Arrays(numberArray, numberArray2));
	}

	public static String getMaxProduct(int[] numberArray) {

		if (numberArray.length >= 2) {

			int[] resultArray = { getMinNum(numberArray), getMaxNum(numberArray),
					(getMinNum(numberArray) * getMaxNum(numberArray)) };

			return Arrays.toString(resultArray);

		} else {
			return "The input array contains " + numberArray.length
					+ " number(s). This method needs at least 2 numbers to work.";
		}
	}

	//////////////////////////////////////////////////// PART 2

	public static String getMaxProductFrom2Arrays(int[] numberArray, int[] numberArray2) {

		if (numberArray.length >= 2 && numberArray2.length >= 2) {

			int maxNumArray1 = getMaxNum(numberArray);
			int maxNumArray2 = getMaxNum(numberArray2);

			int[] resultArray = { maxNumArray1, maxNumArray2, (maxNumArray1 * maxNumArray2) };

			return Arrays.toString(resultArray);
		} else {
			System.out.println("The input array contains " + numberArray2.length
					+ " number(s). This method needs at least 2 numbers to work.");
			return "";
		}
	}

	public static int getMaxNum(int[] numberArray) {
		Arrays.sort(numberArray);

		return Array.getInt(numberArray, numberArray.length - 1);
	}

	public static int getMinNum(int[] numberArray) {
		Arrays.sort(numberArray);

		return Array.getInt(numberArray, numberArray.length - 2);
	}
}