package module1._5_Loops.workbook5._07;

public class FizzBuzz {
	public static void main(String[] args) {

		/*
		 * Your program has to print numbers from 0 to 18.
		 * 
		 * If a number is a multiple of three, mark it: Fizz.
		 * 
		 * If a number is a multiple of five, mark it: Buzz.
		 * 
		 * If a number is a multiple of three and five, mark it: FizzBuzz.
		 */

		for (int i = 0; i <= 18; i++) {

			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i + " FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println(i + " Fizz");
			} else if (i % 5 == 0) {
				System.out.println(i + " Buzz");
			}
		}
	}
}
