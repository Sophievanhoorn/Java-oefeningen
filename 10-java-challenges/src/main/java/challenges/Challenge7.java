
package challenges;

import java.util.ArrayList;

public class Challenge7 {

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

		System.out.println(armstrongNum + " is Armstrong number: " + isArmstrongNum(armstrongNum));
		System.out.println(notArmstrongNum + " is Armstrong number: " + isArmstrongNum(notArmstrongNum));

		searchForArmstrongNumber(500);

	}

	public static boolean isArmstrongNum(int number) {

		ArrayList<Integer> intArray = new ArrayList<>();
		int num = number;

		String intToString = Integer.toString(num);
		int digits = intToString.length();

		for (int i = 0; i < digits; i++) {

			long remainder = num % 10;

			num = num / 10;

			intArray.add((int) remainder);
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

	public static void searchForArmstrongNumber(int numMax) {

		StringBuilder sb = new StringBuilder("Armstrong numbers between 0 and " + numMax + ":");

		for (int i = 0; i <= numMax; i++) {
			if (isArmstrongNum(i)) {
				sb.append(" " + i + ", ");
			}
		}
		System.out.println(sb.substring(0, sb.length() - 2));
	}
}
