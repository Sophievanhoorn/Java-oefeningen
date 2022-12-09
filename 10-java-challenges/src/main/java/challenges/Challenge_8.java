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

		int[] numberArray = { 1, 14, 7, 5 };

		System.out.println(getMaxProduct(numberArray));
	}

	public static String getMaxProduct(int[] numberArray) {

		int number = 0;
		int product = 0;
		int result = 0;
		int[] resultArray = new int[3];

		for (int i = 0; i < numberArray.length; i++) {
			number = Array.getInt(numberArray, i);
			for (int num : numberArray) {
				product = number * num;
				if (product > result) {
					result = product;
					resultArray[0] = number;
					resultArray[1] = num;
					resultArray[2] = result;

					System.out.println("Largest product : " + result);
				}
			}
		}
		return Arrays.toString(resultArray);
	}
}
