package challenges;

public class Challenge_9 {

	/*
	 * 9. PRIME NUMBER CHECKER A prime number is any whole number greater than 1
	 * whose only factors are 1 and itself. For example, 7 is a prime number because
	 * it’s only divisible by 1 and 7.
	 * 
	 * Create a function that returns TRUE if an input number is prime. The first
	 * few prime numbers are 2, 3, 5, 7, 11, 13, 17, and 19.
	 * 
	 * For a slightly harder challenge, create a prime number calculator that
	 * outputs all prime numbers between 2 and the input number.
	 */

	public static void main(String[] args) {

		int number = 5;
		int inputNumber = 50;

		System.out.println(primeNumberCalculator(number));
		primeNumbersBetween(inputNumber);
	}

	public static boolean primeNumberCalculator(int number) {

		int count = 0;
		int x = number / 2;
		boolean isPrime = false;

		if (number == 0 || number == 1) {
			return false;
		} else {
			for (int i = 2; i < x; i++) {
				if (number % i == 0) {
					count = 1;
					break;
				}
			}
		}

		if (count == 0) {
			isPrime = true;
			return isPrime;
		}
		return isPrime;
	}

	///////////////////////////////////////////////////////////// PART 2

	public static void primeNumbersBetween(int input) {

		for (int number = 2; number <= input; number++) {
			if (primeNumberCalculator(number)) {
				System.out.println(number + " is a prime number");
			}
		}
	}
}
