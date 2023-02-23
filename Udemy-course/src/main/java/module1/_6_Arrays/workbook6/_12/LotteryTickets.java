package module1._6_Arrays.workbook6._12;

import java.util.Arrays;

public class LotteryTickets {
	public static void main(String[] args) {

		// Instructions for this workbook are on Learn the Part (workbook 6.12)
		int[] ticket = { 34, 43, 45, 65, 21, 54 };
		int[] ticket2;

		ticket2 = Arrays.copyOf(ticket, ticket.length);
		ticket2[2] = 54;

		System.out.print("Ticket 1 numbers: ");
		// Task 3 - Call printTicketNumbers for int[] ticket.
		printTicketNumbers(ticket);

		System.out.print("\nTicket 2 numbers: ");
		// Task 3 - Call printTicketNumbers for int[] ticket2.
		printTicketNumbers(ticket2);
	}

	/**
	 * Function name -- printTicketNumbers
	 * 
	 * @param ticket ( int[] )
	 *
	 *               Inside the function: 1. Use a loop to print the numbers in one
	 *               line. System.out.print(ticket[i] + " ");
	 *
	 *               2. After the loop, print two new lines.
	 *               System.out.print("\n\n");
	 *
	 */
	public static void printTicketNumbers(int[] ticket) {
		int i = 0;
		while (i < ticket.length) {
			System.out.print(ticket[i] + " ");
			i++;
		}
		System.out.println("\n\n");
	}
}
