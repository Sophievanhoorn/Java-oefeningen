package module2._07_Objects.workbooks.workbook7_6;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("Rayan Slim", "Canadian", "11/11/1111", 5);
		person.setPassport(null, null, null);

		if (person.applyPassport()) {

			person.setPassport(person.getName(), person.getNationality(), person.getDateOfBirth());
		}

		System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n"
				+ "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n"
				+ "Passport: " + Arrays.toString(person.getPassport()) + "\n");
	}
}
