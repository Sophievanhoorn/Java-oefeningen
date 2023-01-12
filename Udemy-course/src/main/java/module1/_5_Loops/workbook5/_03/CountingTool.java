package module1._5_Loops.workbook5._03;

import java.util.Scanner;

public class CountingTool {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * Ask Timmy what number he'd like to count up to.
		 * 
		 * Count from 0 to that number. If Timmy enters 7, your app should should
		 * output: 0 1 2 3 4 5 6 7
		 */

		System.out.print("Hi Timmy! Choose a numer to count to: ");
		int number = scan.nextInt();

		for (int i = 0; i <= number; i++) {
			if (i == number) {
				System.out.print(i);
			} else {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}
}
