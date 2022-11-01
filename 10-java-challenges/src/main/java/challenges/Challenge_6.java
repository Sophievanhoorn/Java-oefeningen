package challenges;

public class Challenge_6 {

	/*
	 * This one is a technical interview favorite. For a given input number, return
	 * the number in reverse. So, an input of 3956 should return 6593.
	 * 
	 * If you’re ready for a bigger challenge, reverse a decimal number. The decimal
	 * point should stay in the same place. So, the number 193.56 should output
	 * 653.91.
	 */

	public static void main(String[] args) {

		int input = 3956;
		double inputDouble = 193.56;

		System.out.println("Input: " + input + " reversed is: " + reverseInt(input));
		System.out.println("Input: " + inputDouble + " reversed is: " + reverseDouble(inputDouble));
	}

	private static int reverseInt(int input) {

		int reverse = 0;
		while (input != 0) {
			int remainder = input % 10;
			reverse = reverse * 10 + remainder;
			input = input / 10;
		}
		return reverse;
	}
	
	////////////////////////////////////////////////////////// PART 2

	private static double reverseDouble(double inputDouble) {

		double reverse = 0;
		long inputLong = (int) (inputDouble * 100);

		while (inputLong != 0) {
			long remainder = inputLong % 10;
			reverse = reverse * 10 + remainder;
			inputLong = inputLong / 10;
		}
		
		return reverse/100;
	}
}
