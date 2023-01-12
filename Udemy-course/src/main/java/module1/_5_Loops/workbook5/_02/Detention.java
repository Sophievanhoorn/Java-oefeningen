package module1._5_Loops.workbook5._02;

import java.util.Scanner;

public class Detention {
	public static void main(String[] args) {

		/*
		 * Bart's teacher wants him to write this line ninety-nine times.
		 * 
		 * 1. Ask Bart to enter the line he wants to write.
		 * 
		 * 2. Using a loop, print the line 99 times. Number each line starting from one.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("hi Bart. I can write lines for you. \nWhat do you want me to write?");
		String answer = scan.nextLine();

		for (int i = 1; i <= 99; i++) {
			System.out.println(i + ". " + answer);
		}
		scan.close();
	}
}
