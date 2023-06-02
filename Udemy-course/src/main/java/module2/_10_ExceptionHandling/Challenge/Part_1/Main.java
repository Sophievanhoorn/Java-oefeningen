package module2._10_ExceptionHandling.Challenge.Part_1;

import java.util.Scanner;

public class Main {
	static Store store = new Store();

	public static void main(String[] args) {

		loadMovies("movies.txt");
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

			if (!incorrectChoice(choice)) {
				return choice;
			}
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

	public static void loadMovies(String fileName) {

		try (Scanner scanFile = new Scanner(Main.class.getResourceAsStream(fileName))) {
			while (scanFile.hasNextLine()) {
				String movie = scanFile.nextLine();
				System.out.println(movie);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void printStore() {
		System.out.println("********************************MOVIE STORE*******************************");
		System.out.println(store);
	}

}
