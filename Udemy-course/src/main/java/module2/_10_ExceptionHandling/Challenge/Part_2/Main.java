package module2._10_ExceptionHandling.Challenge.Part_2;

import java.util.Scanner;

public class Main {
	static Store store = new Store();

	public static void main(String[] args) {

		loadMovies();
		printStore();
		userInput();

	}

	public static void userInput() {
		Scanner scanner = new Scanner(System.in);
		String status = "continue";

		while (status.equals("continue")) {
			int choice = (promptForChoice(scanner));
			Movie movie = store.getMovie(choice);
			double rating = promptForRating(scanner, movie.getName());

			movie.setRating(rating);
			store.setMovie(choice, movie);
			printStore();
			System.out.print("To edit another rating, type: 'continue': ");
			status = scanner.next();
		}
		scanner.close();
	}

	public static int promptForChoice(Scanner scanner) {
		while (true) {
			System.out.print("\nPlease choose an integer between 0 - 9: ");
			if (!scanner.hasNextInt()) {
				scanner.next();
				continue;
			}

			int choice = scanner.nextInt();
			if (!incorrectChoice(choice))
				return choice;
		}
	}

	public static boolean incorrectChoice(int choice) {
		return choice < 0 || choice > 9;
	}

	public static double promptForRating(Scanner scanner, String name) {

		while (true) {
			System.out.print("\nSet a new rating for " + name + ": ");
			if (!scanner.hasNextDouble()) {
				scanner.next();
				continue;
			}

			double rating = scanner.nextDouble();
			if (!incorrectRating(rating)) {
				return rating;
			}
		}
	}

	public static boolean incorrectRating(double rating) {
		return rating < 0 || rating > 10;
	}

	public static void loadMovies() {
		String[] movieList = new String[] { "The Shawshank Redemption--BlueRay--9.2", "The Godfather--BlueRay--9.1",
				"The Godfather: Part II--DVD--9.0", "The Dark Knight--BlueRay--9.0", "Schindler's List--DVD--8.9",
				"The Lord of the Rings: The Return of the King--BlueRay--8.9", "Pulp Fiction--DVD--8.8",
				"The Good, the Bad and the Ugly--DVD--8.8",
				"The Lord of the Rings: The Fellowship of the Ring--DVD--8.8" };

		for (String line : movieList) {
			String[] words = line.split("--");
			store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
		}
	}

	public static void printStore() {
		System.out.println("********************************MOVIE STORE*******************************");
		System.out.println(store);
	}

}
