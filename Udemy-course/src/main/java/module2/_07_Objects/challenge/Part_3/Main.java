package module2._07_Objects.challenge.Part_3;

import java.util.Scanner;

public class Main {

	/*
	 * Task 1 Add code that prompts the user to enter an integer.
	 * 
	 * Please choose an integer between 0 - 9: 4
	 * 
	 * Task 2 Grab a movie from the store based on the user input.
	 * 
	 * Task 3 Add code that prompts the user to enter a rating for the movie.
	 * 
	 * Please choose an integer between 0 - 9: 4
	 * 
	 * Set a new rating for The Dark Knight: 5.8
	 * 
	 * Task 4 Update the store, and print the updated store.
	 * 
	 * store.setMovie(choice, movie); printStore();
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

		for (int i = 0; i < movies.length; i++) {
			store.setMovie(i, movies[i]);
		}

		printStore();

		userInput();
		// After changes by user

	}

	public static void userInput() {
		Scanner scanner = new Scanner(System.in);
		String status = "continue";

		Movie movie;

		while (status.equals("continue")) {

			System.out.print("\nPlease choose an integer between 0 - 9: ");
			int index = scanner.nextInt();
			scanner.nextLine();

			movie = store.getMovie(index);

			System.out.print("Set a new rating for " + movie.getName() + ": ");
			movie.setRating(scanner.nextDouble());

			// Update store
			store.setMovie(index, movie);
			System.out.println();
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