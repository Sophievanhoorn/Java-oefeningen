package module2._07_Objects.workbooks.workbook7_1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Person sophie = new Person();

		sophie.name = "Sophie";
		sophie.nationality = "NL";
		sophie.dateOfBirth = "22-03-1996";

		String[] passport = { sophie.name, sophie.nationality, sophie.dateOfBirth };

		sophie.passport = passport;
		sophie.seatNumber = 22;

		System.out.println(
				"Name: " + sophie.name + "\nNationality: " + sophie.nationality + "\nDateOfBirth: " + sophie.dateOfBirth
						+ "\nPassport: " + Arrays.toString(sophie.passport) + "\nSeat number: " + sophie.seatNumber);

	}
}
