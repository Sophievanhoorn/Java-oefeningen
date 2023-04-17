package module2._07_Objects.workbooks.workbook7_4;

public class Main {

	/*
	 * Task 1 Inside the Person class, add a copy constructor.
	 * 
	 * Task 2 Your code contains a Person object.
	 * 
	 * That person's twin is also flying with Java airlines. Use this code to test
	 * your copy constructor.
	 * 
	 * Create a copy of the first object. Update name field of the second object.
	 * Update the seat number of the second object. Print the other person's fields
	 * as well.
	 */

	public static void main(String[] args) {

		Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

		person.setSeatNumber(10);

		Person person2 = new Person(person);
		person2.setName("James Slim");
		person2.setSeatNumber(11);

		System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n"
				+ "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

		System.out.println("Name: " + person2.getName() + "\n" + "Nationality: " + person2.getNationality() + "\n"
				+ "Date of Birth: " + person2.getDateOfBirth() + "\n" + "Seat Number: " + person2.getSeatNumber()
				+ "\n");
	}

}
