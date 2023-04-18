package module2._07_Objects.workbooks.workbook7_2;

public class Main {

	/*
	 * Task 1 Create a Person constructor that receives four parameters. For now,
	 * ignore passport.
	 * 
	 * Task 2 Remove the field updates from Part 1.
	 * 
	 * While a new object is being created, use the constructor to update its
	 * fields.
	 * 
	 * Task 3 Print every field as part of one String.
	 */

	public static void main(String[] args) {
		Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", null, 5);

//		person.passport = new String[] { person.name, person.nationality, person.dateOfBirth };

		System.out.println("Name: " + person.name + "\n" + "Nationality: " + person.nationality + "\n"
				+ "Date of Birth: " + person.dateOfBirth + "\n" + "Seat Number: " + person.seatNumber + "\n");

	}

}
