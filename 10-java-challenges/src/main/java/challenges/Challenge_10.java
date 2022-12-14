package challenges;

public class Challenge_10 {

	/*
	 * 10. PRIME FACTORIZATION The prime factors of a number are all of the integers
	 * below that number that are divisible into the number as well as 1. For
	 * example, the prime factors of 12 are 1,2,3,4,6, and 12.
	 * 
	 * Create a prime factorization calculator that returns the prime factors of any
	 * number between 2 and 100. If you're looking for a more advanced version of
	 * this challenge, use exercise 9 to create a prime factorization calculator for
	 * any number. Hint: think about using square roots to cut your work in half.
	 */

	public static void main(String[] args) {

		int inputNumber = 100;

		getPrimeFactors(inputNumber);
	}

	private static void getPrimeFactors(int inputNumber) {

		StringBuilder sb = new StringBuilder("the prime factors of " + inputNumber + " are: ");
		for (int number = 1; number <= inputNumber; number++) {
			if (inputNumber % number == 0) {
				sb.append(number + ", ");
			}
		}
		System.out.println(sb.toString().substring(0, sb.length() - 2));
	}
}
