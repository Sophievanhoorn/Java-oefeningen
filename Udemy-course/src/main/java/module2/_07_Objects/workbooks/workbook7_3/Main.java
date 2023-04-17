package module2._07_Objects.workbooks.workbook7_3;

public class Main {

	/*
	 * Task 1 Make each field private.
	 * 
	 * Task 2 Add getters for
	 * name, nationality, dateOfBirth, and seatNumber.
	 * 
	 * Task 3 Call the getters from your println function and re-run the code.
	 * 
	 * Task 5 The person's current seat number is already taken. Update their seat
	 * number to 10 before printing the fields.
	 */

	public static void main(String[] args) {
		
		Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
		
		person.setSeatNumber(10);
		
		System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n"
				+ "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

	}

}
