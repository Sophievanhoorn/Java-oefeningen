package module1._5_Loops.workbook5._10;

public class Doubles {
	public static void main(String[] args) {

		// See Learn the Part for instructions.

		int dice1 = rollDice();
		int dice2 = rollDice();

		while (dice1 != dice2) {
			System.out.println("Dice 1: " + dice1 + "\nDice 2: " + dice2 + "\n");
			dice1 = rollDice();
			dice2 = rollDice();
		}

		System.out.println("You rolled doubles!");
		System.out.println("Dice 1: " + dice1 + "\nDice 2: " + dice2);
	}

	public static int rollDice() {
		return (int) (Math.random() * 6) + 1;
	}
}
