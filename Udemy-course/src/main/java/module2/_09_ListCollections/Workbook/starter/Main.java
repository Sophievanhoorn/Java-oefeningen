package module2._09_ListCollections.Workbook.starter;

import java.util.Scanner;

public class Main {
	/*
	 * ArrayList for retrieving/ changing items via index
	 * 
	 * LinkedList for adding/removing nodes;
	 *
	 *
	 * Task 1 Initialize the List field inside the Store constructor,
	 * 
	 * This application prioritizes retrieving/updating data and does not add/remove
	 * elements from the middle.
	 * 
	 * Task 2 Finish writing the code for these methods.
	 * 
	 * Task 3 Inside the main() method, populate the store using a foreach loop.
	 * 
	 * } Don't use a regular loop because we don't need the index.
	 */

	static Store store = new Store();

	public static void main(String[] args) {
		Movie[] movies = new Movie[] { new Movie("The Shawshank Redemption", "BlueRay", 9.2),
				new Movie("The Godfather", "BlueRay", 9.1), new Movie("The Godfather: Part II", "DVD", 9.0),
				new Movie("12 Angry Men", "DVD", 8.9), new Movie("The Dark Knight", "BlueRay", 9.0),
				new Movie("Schindler's List", "DVD", 8.9),
				new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
				new Movie("Pulp Fiction", "DVD", 8.8), new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
				new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8) };

		for (Movie movie : movies) {
			store.addMovie(movie);
		}

		printStore();
		userInput();

	}

	public static void userInput() {
		Scanner scanner = new Scanner(System.in);

		String status = "continue";
		while (status.equals("continue")) {
			System.out.print("\nPlease choose an integer between 0 - 9: ");
			int choice = scanner.nextInt();
			Movie movie = store.getMovie(choice);
			System.out.print("Set a new rating for " + movie.getName() + ": ");
			double rating = scanner.nextDouble();
			movie.setRating(rating);
			store.setMovie(choice, movie);
			printStore();
			System.out.print("To edit another rating, type: 'continue': ");
			status = scanner.next();
		}
		scanner.close();
	}

	public static void printStore() {
		System.out.println("********************************MOVIE STORE*******************************");
		System.out.println(store);
	}

}
