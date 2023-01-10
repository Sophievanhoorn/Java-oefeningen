package module1._3_BooleansAndConditionals.workbook3._05;

public class WorkSchedule {
	public static void main(String[] args) {

		// See Learn the Part for the complete instructions (link in resources folder of
		// Udemy video).

		int day = 6; // Day of the week...
		boolean holiday = false;
		String message;

		if (holiday) {
			message = "Woohoo, no work!";
		} else if (day > 5) {
			message = "It's the weekend, no work!";
		} else {
			message = "Wake up at 7:00 :(";
		}

		System.out.println(message);
	}

}
