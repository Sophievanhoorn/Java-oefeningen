package module2._07_Objects.workbooks.workbook7_9;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		/*
		 * Task 1 Inside the Airline class, there is a method called createReservation.
		 * The method indexes an element (based on the seat number) and sets it equal to
		 * an object. Inside the function, create a loop that keeps running while the
		 * spot in the array is reserved (indexed element is not null). While the loop
		 * is running, tell them that the spot is already taken: While the loop is
		 * running, call person.chooseSeat() so that they "choose another seat".
		 * 
		 * Task 2 Change Hammurabi's seat number to 10. Because of your loop, Hammurabi
		 * keeps choosing a seat until they choose one that isn't taken.
		 * 
		 * Task 3 Inside the for loop, notice that each person is applying for a
		 * passport. If their passport is approved, update their passport using
		 * setPassport. Then create the reservation. Otherwise, print the following
		 * message.
		 * 
		 * Task 4 Feel free to admire the complexity of this application, yet how clean
		 * and expressive the code remains in main(). Therein lies the beauty of
		 * Object-Oriented Programming!
		 */

		Person[] people = new Person[] { new Person("Cleopatra", "Egypt", "69 BC", 1),
				new Person("Alexander the Great", "Macedon", "356 BC", 2),
				new Person("Julius Caesar", "Rome", "100 BC", 3), new Person("Hannibal", "Carthage", "247 BC", 4),
				new Person("Confucius", "China", "551 BC", 5), new Person("Pericles", "Greece", "429 BC", 6),
				new Person("Spartacus", "Thrace", "111 BC", 7), new Person("Marcus Aurelius", "Rome", "121 AD", 8),
				new Person("Leonidas", "Greece", "540 BC", 9), new Person("Sun Tzu", "China", "544 BC", 10),
				new Person("Hammurabi", "Babylon", "1750 BC", 10), };

		Airline airline = new Airline();

		for (int i = 0; i < people.length; i++) {
			boolean passportApproved = people[i].applyPassport();
			if (passportApproved) {
				people[i].setPassport();
				airline.createReservation(people[i]);
			} else {
				System.out.println("Sorry " + people[i].getName() + ". Your passport: "
						+ Arrays.toString(people[i].getPassport()) + " is not valid.\n");
			}
		}
	}
}