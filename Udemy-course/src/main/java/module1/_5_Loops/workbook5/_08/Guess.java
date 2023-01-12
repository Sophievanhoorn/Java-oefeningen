package module1._5_Loops.workbook5._08;

import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int secretNumer = secretNumber();

		System.out.print("I chose a number between 1 and 5. \nTry to guess it: ");
		int guessNumber = scan.nextInt();
		
		if(guessNumber<1 || guessNumber >5) {
			System.out.println("The number must be between 1 and 5.");			
		}

		while (guessNumber != secretNumer) {
			System.out.print("Guess again: ");
			guessNumber = scan.nextInt();
		}

		System.out.println("You guessed the secret number!: " + secretNumer);
		scan.close();
	}

	public static int secretNumber() {
		return (int) (Math.random() * 6) + 1;
	}
}
