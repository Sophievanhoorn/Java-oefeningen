package module1._6_Arrays.workbook6._07;

public class RingAnnouncer {
	public static void main(String[] args) {

//    Use a for loop to count the number of wins, and update the following variable.
//    Use a for loop to count the number of losses, and update the following variable.

		String[] record = { "WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS" };

		int wins = 0;
		int losses = 0;

		for (int i = 0; i < record.length; i++) {
			if (record[i].equals("WIN")) {
				wins++;
			}
			if (record[i].equals("LOSS")) {
				losses++;
			}
		}

		System.out.println("\nWith a professional record of " + wins + " Wins and " + losses + " losses.");
		System.out.println("He is the pride of oracle: Java Fury!");

	}
}
