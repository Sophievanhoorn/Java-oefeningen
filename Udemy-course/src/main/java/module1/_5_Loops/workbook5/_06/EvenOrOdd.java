package module1._5_Loops.workbook5._06;

public class EvenOrOdd {

	/*
	 * task 1. Make a for loop that counts from 0 to 19.
	 * 
	 * task 2. Using an if - else statement, mark each number as even or odd.
	 */

	public static void main(String[] args) {

		for (int i = 0; i <= 19; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " - even");
			} else {
				System.out.println(i + " - odd");
			}
		}
	}
}
