package module1._4_Functions.challenge4;

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Let's play Rock Paper Scissors.");
		System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
		System.out.println("Are you ready? Write 'yes' if you are.");

		// Task 1: See if the user wants to play.
		if (scan.nextLine().equalsIgnoreCase("yes")) {
			System.out.println("\nGreat!");
			playGame();
		} else {
			System.out.println("\nAlright, see you next time!");
			System.exit(0);
		}

		scan.close();
	}

	public static void playGame() {
		Scanner scan = new Scanner(System.in);

		System.out.println("rock - paper - scissors - shoot");
		String userAnswer = scan.nextLine();
		String cpuAnswer = getChoice();
		String result = result(userAnswer, cpuAnswer);

		System.out.println("\n" + printResult(userAnswer, cpuAnswer, result));

		System.out.println("\nWould you like to play again? yes/no");

		if (scan.nextLine().equalsIgnoreCase("yes")) {
			System.out.println("\nAlright, here we go!");
			playGame();

		} else {
			System.out.println("\nAlright, see you next time!");
			System.exit(0);
		}
		scan.close();
	}

	// Task 3 – Write a function where the computer picks a random choice.

	public static String getChoice() {
		String choice = "";

		switch ((int) (Math.random() * 3) + 1) {
		case 1:
			choice = "rock";
			break;
		case 2:
			choice = "paper";
			break;
		case 3:
			choice = "scissors";
			break;
		default:
			System.out.println("Something went wrong. The game will close");
			System.exit(0);
		}

		return choice;
	}

//	rock > paper > stone > rock
	// Task 4 – Write a function that compares the choices and returns the result.

	public static String result(String userAnswer, String cpuAnswer) {

		String user = userAnswer.toLowerCase();
		String cpu = cpuAnswer.toLowerCase();

		String result = "";

		if (user.equals("rock") && cpu.equals("scissors") || user.equals("scissors") && cpu.equals("paper")
				|| user.equals("paper") && cpu.equals("rock")) {
			result = user + " beats " + cpu + ", You win!";

		} else if (cpu.equals("rock") && user.equals("scissors") || cpu.equals("scissors") && user.equals("paper")
				|| cpu.equals("paper") && user.equals("rock")) {
			result = cpu + " beats " + user + ", You lose...";

		} else if (user.equalsIgnoreCase(cpu)) {
			result = "It's a tie!";
		} else {
			result = "It seems like something went wrong... The game will now close.";
			System.exit(0);
		}

		return result;
	}

// Task 5 – Write a function that prints your choice, the computer's, and the
// result.

	public static String printResult(String userAnswer, String cpuAnswer, String result) {
		return "You: " + userAnswer + "\ncpu: " + cpuAnswer + "\n" + result;
	}
}
