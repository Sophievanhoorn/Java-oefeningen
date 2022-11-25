
package challenges;

import java.util.ArrayList;

public class Challenge_7 {

	/*
	 * An Armstrong number is a whole number that’s equal to the sum of its digits
	 * raised to the power of the total number of digits. For example, 153 is an
	 * Armstrong number because there are three digits, and 153 = 13 + 53 + 33. The
	 * four-digit number 8208 is also an Armstrong number, as 8208 = 84 + 24 + 04 +
	 * 84.
	 * 
	 * Create an Armstrong number checker that returns a Boolean TRUE if the input
	 * number is an Armstrong number. Hint: to extract each digit from a given
	 * number, try using the remainder/modulo operator.
	 * 
	 * If you’re looking for something a little more challenging, create an
	 * Armstrong number calculator that returns all Armstrong numbers between 0 and
	 * the input number.
	 */

	public static void main(String[] args) {

		int armstrongNum = 8208;
		int notArmstrongNum = 154;

		System.out.println(isArmstrongNum(armstrongNum));
		System.out.println(isArmstrongNum(notArmstrongNum));

	}

	public static Boolean isArmstrongNum(int number) {

		ArrayList<Integer> intArray = new ArrayList<>();
		int num = number;

		String intToString = Integer.toString(num);
		int digits = intToString.length();

		for (int i = 0; i < digits; i++) {

			long remainder = num % 10;

			num = num / 10;

			intArray.add((int) remainder);

			System.out.println(intArray.toString());
		}

		int result = 0;

		for (int x = 0; x < intArray.size(); x++) {

			double intToThePower = Math.pow(intArray.get(x), digits);

			result += intToThePower;

			if (result == number) {
				return true;
			}
		}
		return result == number;
	}

//////////////////////////////////////////////////////////////////PART 2

//	public static Boolean returnArmstrongNumbers(int number) {
//		int armstrongNumber = 0;
//
//		ArrayList<Integer> intArray = new ArrayList<Integer>();
//
//		String intToString = Integer.toString(number);
//		int digits = intToString.length();
//
//		for (int i = 0; i < digits; i++) {
//
//			long remainder = number % 10;
//
//			number = number / 10;
//
//			String remainderToString = Long.toString(remainder);
//
//			intArray.add(Integer.parseInt(remainderToString.concat(Integer.toString(digits))));
//
//			System.out.println(intArray.toString());
//		}
//		return null;
//	}
}
