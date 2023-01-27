package module1._6_Arrays.workbook6._02;

public class Exams {
	public static void main(String[] args) {

		// Instructions for this workbook are on Learn the Part (Workbook 6.2).
		System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");

		String[] names = { "Malfoy", "Crabbe", "Goyle", "Pansy", "Dean" };

		for (int i = 0; i < names.length; i++) {

			System.out.println(names[i] + ", you will take seat " + i);

		}
	}
}
