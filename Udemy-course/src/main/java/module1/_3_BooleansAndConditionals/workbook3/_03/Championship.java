package module1._3_BooleansAndConditionals.workbook3._03;

public class Championship {
	public static void main(String[] args) {

		// See Learn the Part for the complete instructions (link in resources folder of
		// Udemy video).

		// Make an int variable called margin. It will calculate the margin of points
		// gryffindor scored over ravenclaw.

		int gryffindor = 850; // gryffindor points
		int ravenclaw = 500; // ravenclaw points

		int margin = gryffindor - ravenclaw;

		if (margin >= 300) {
			System.out.println("Gryffindor takes the house cup!");
		} else if (margin >= 0) {
			System.out.println("In second place, gryffindor!");
		} else if (margin >= -100) {
			System.out.println("In third place, Gryffindor!");
		} else {
			System.out.println("In fourth place, Gryffindor!");
		}
	}
}
