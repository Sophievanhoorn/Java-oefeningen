package module2._14_Enums.Workbook.extra;

import static module2._14_Enums.Workbook.extra.model.Car.BodyType;
import static module2._14_Enums.Workbook.extra.model.Car.TrafficLight;

import java.util.InputMismatchException;
import java.util.Scanner;

import module2._14_Enums.Workbook.extra.model.Car;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Car car1 = new Car("Toyota", "Camry", BodyType.SEDAN, 2017, 20000);
		Car car2 = new Car("Kia", "Stonic", BodyType.HATCHBACK, 2020, 26000);
		Car car3 = new Car("Volkswagen", "T-Roc", BodyType.SUV, 2022, 29000);
		Car car4 = new Car("Range Rover", "Evogue", BodyType.SUV, 2023, 80000);

//		car1.drive(TrafficLight.YELLOW);

		CarDealership dealership = new CarDealership();
		dealership.addCar(car1);
		dealership.addCar(car2);
		dealership.addCar(car3);
		dealership.addCar(car4);

//		System.out.println(dealership.getCar(2).toString());
//
//		System.out.println("isNullOrBlank() returns: " + isNullOrBlank(""));
//		System.out.println("isNullOrBlank(Kia) returns: " + isNullOrBlank("kia"));
//
//		System.out.println("\ninvalidYear(1800) returns: " + invalidYear(1800));
//		System.out.println("invalidYear(2023) returns: " + invalidYear(2023));
//
//		System.out.println("\ninvalidPrice(-10) returns: " + invalidPrice(-10));
//		System.out.println("invalidPrice(20.000) returns: " + invalidPrice(20000));
//		System.out.println("invalidPrice(999.999) returns: " + invalidPrice(999999));
//
//		System.out.println("\ninvalidBodyType(hi) returns: " + invalidBodyType("hi"));
//		System.out.println("invalidBodyType(suv) returns: " + invalidBodyType("suv"));

//		System.out.println(promptForBodyType(scan));
//		System.out.println(promptForYear(scan));
		System.out.println(promptForMake(scan));

	}

	public static boolean isNullOrBlank(String input) {
		return input.isEmpty();
	}

	/*
	 * Task 1 Inside the Main class, create a method called isNullOrBlank that takes
	 * a String input and returns true if the input is null or blank.
	 */

	public static boolean invalidYear(int year) {
		return year < Car.MIN_YEAR;
	}

	/*
	 * Task 2 Create a method called invalidYear that takes an int input and
	 * returns true if the input is less than your minimum production year (see your
	 * Car class).
	 */

	public static boolean invalidPrice(double price) {
		return price < Car.MIN_PRICE || price > Car.MAX_PRICE;
	}

	/*
	 * Task 3 Create a method called invalidPrice that takes a double input and
	 * returns true if the input is less than the minimum price or greater than the
	 * maximum price (see your Car class).
	 */

	public static boolean invalidBodyType(String input) {
		try {
			return (Car.BodyType.valueOf(input.toUpperCase()) == null);
		} catch (IllegalArgumentException e) {
			return true;
		}
	}

	/*
	 * Task 4 Create a method called invalidBodyType that: Takes a String input and
	 * capitalizes it. Returns true if the input does not match one of the body
	 * types in the enum.
	 * 
	 * The second part is tricky but here's a hint: you can call valueOf from your
	 * enum. It returns an enum constant if it recognizes the string, otherwise, it
	 * will throw an IllegalArgumentException. In which case, catch the exception
	 * and return a boolean.
	 */

	public static BodyType promptForBodyType(Scanner scan) {
		System.out.println("Enter a bodytype: ");
		String input = scan.next();

		while (invalidBodyType(input)) {
			System.out.print("Please enter a valid bodytype: ");
			input = scan.next();
		}

		for (BodyType bodyType : BodyType.values()) {
			if (bodyType.toString().equals(input.toUpperCase())) {
				return bodyType;
			}
		}
		return null;
	}
//////////AANPASSEN ALLEEN STRING


	/*
	 * Task 5 Create a method called promptForBodyType that takes a Scanner input
	 * and returns a valid body type entered by the user.
	 */

	public static String promptForMake(Scanner scan) {
		System.out.println("Enter a make: ");
		String make = scan.next();

		while (isNullOrBlank(make)) {
			System.out.println("Please enter a valid make: ");
			make = scan.next();
		}
		return make;
	}
	//////////AANPASSEN ALLEEN STRING

	/*
	 * Task 6 Create a method called promptForMake that takes a Scanner input and
	 * returns a valid make entered by the user.
	 */

	public static String promptForModel(Scanner scan) {
		System.out.println("Enter a model: ");
		String model = scan.next();

		while (isNullOrBlank(model)) {
			System.out.println("Please enter a valid model: ");
			model = scan.next();
		}
		return model;
	}
	
//////////AANPASSEN ALLEEN STRING


	/*
	 * Task 7 Create a method called promptForModel that takes a Scanner input and
	 * returns a valid model entered by the user.
	 */

	public static int promptForYear(Scanner scan) {
		while (true) {
			System.out.print("please enter a year above 1900: ");
			if (!scan.hasNextInt()) {
				scan.next();
				continue;
			}

			int year = scan.nextInt();
			if (!invalidYear(year)) {
				return year;
			}
		}
	}
	
	////// WERKT !

	/*
	 * Task 8 Create a method called promptForYear that takes a Scanner input and
	 * returns a valid production year entered by the user.
	 */

	/*
	 * Task 9 Create a method called promptForPrice that takes a Scanner input and
	 * returns a valid price entered by the user.
	 */

	/*
	 * Task 10 Test the interactive methods in the main method. public static void
	 * main(String[] args) { Scanner scanner = new Scanner(System.in);
	 * 
	 * String make = promptForMake(scanner); String model = promptForModel(scanner);
	 * BodyType bodyType = promptForBodyType(scanner); int year =
	 * promptForYear(scanner); double price = promptForPrice(scanner);
	 * 
	 * Car newCar = new Car(make, model, bodyType, year, price);
	 * 
	 * CarDealership dealership = new CarDealership(); dealership.addCar(newCar);
	 * 
	 * System.out.println("Car added to the dealership: " + newCar.getMake() + " " +
	 * newCar.getModel()); }
	 */
}
