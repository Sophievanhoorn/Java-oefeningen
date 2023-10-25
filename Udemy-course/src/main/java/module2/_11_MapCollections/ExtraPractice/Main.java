package module2._11_MapCollections.ExtraPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CityPopulationTracker tracker = new CityPopulationTracker();
		Scanner scan = new Scanner(System.in);

		// Test the addCity method
		tracker.addCity(new City(promptForCityName(scan), promptForCountry(scan), promptForPopulation(scan)));
		tracker.addCity(new City("Los Angeles", "USA", 3971883));
		tracker.addCity(new City("Waalwijk", "Holland", 18000));

//		 Test the getCity method
		City nyCity = tracker.getCity("New York");
		System.out.println("Population of " + nyCity.getName() + ": " + nyCity.getPopulation());

//		 Test the setCity method
		City updatedNyCity = new City(nyCity);
		updatedNyCity.setPopulation(34537438);
		tracker.setCity(updatedNyCity);

//		 Verify that the city data was updated
		nyCity = tracker.getCity("New York");
		System.out.println("\nUpdated population of " + nyCity.getName() + ": " + nyCity.getPopulation());

		System.out.println("\nCity tracker:\n" + tracker.toString());

		scan.close();
	}

	public static boolean isNullOrBlank(String input) {
		return input.isEmpty() || input.equals("");
	}

	public static boolean incorrectPopulation(int population) {
		return population <= 0;
	}

	public static String promptForCityName(Scanner scan) {
		System.out.println("Enter a city name: ");
		String name = scan.nextLine();
		while (true) {
			if (!isNullOrBlank(name)) {
				return name;
			} else {
				System.out.println("Please enter a valid city.");
				name = scan.nextLine();
			}
		}
	}

	public static String promptForCountry(Scanner scan) {
		System.out.println("Enter a country name: ");
		String country = scan.nextLine();
		while (true) {
			if (!isNullOrBlank(country)) {
				return country;
			} else {
				System.out.println("Please enter a valid country.");
				country = scan.nextLine();
			}
		}
	}

	public static int promptForPopulation(Scanner scan) {
		System.out.println("Please enter a population number above 0: ");

		while (true) {
			try {
				int population = scan.nextInt();
				if (!incorrectPopulation(population)) {
					return population;
				}
			} catch (InputMismatchException e) {
				System.out.println(
						"'" + scan.next() + "'" + " is an invalid input. \nPlease enter a population number above 0: ");
			}
		}
	}

	public static City updateCity(Scanner scan, City cityToUpdate, String valueToUpdate) {
		City updatedCity = new City(cityToUpdate);

		while (true) {
			if (valueToUpdate.equalsIgnoreCase("City") || valueToUpdate.equalsIgnoreCase("Country")
					|| valueToUpdate.equalsIgnoreCase("Population")) {

				switch (valueToUpdate.toLowerCase()) {
				case "city":
					updatedCity.setName(promptForCityName(scan));
					break;
				case "country":
					updatedCity.setCountry(promptForCountry(scan));
					break;
				case "population":
					updatedCity.setPopulation(promptForPopulation(scan));
					break;
				default:
					System.out.println("Choice " + valueToUpdate + " was not found");
				}
				return updatedCity;
			} else {
				System.out.println("Choice " + valueToUpdate + " was not found");
				System.out.println("Please choose one of these options:\n'City'\t'Country'\t'Population'");
				valueToUpdate = scan.nextLine();
			}
		}
	}
}
