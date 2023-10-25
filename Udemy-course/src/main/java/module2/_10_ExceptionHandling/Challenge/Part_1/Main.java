package module2._10_ExceptionHandling.Challenge.Part_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import module2._10_ExceptionHandling.Challenge.Part_2.Movie;

public class Main {
	static Store store = new Store();

	public static void main(String[] args) {

		try {
			loadMovies("movies.txt");
			printStore();
//			userInput();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

//	public static void userInput() {
//		Scanner scanner = new Scanner(System.in);
//		String status = "continue";
//
//		while (status.equals("continue")) {
//			int choice = (promptForChoice(scanner));
//			Movie movie = store.getMovie(choice);
//			double rating = promptForRating(scanner, movie.getName());
//
//			movie.setRating(rating);
//			store.setMovie(choice, movie);
//			printStore();
//			System.out.print("To edit another rating, type: 'continue': ");
//			status = scanner.next();
//		}
//		scanner.close();
//	}

	public static int promptForChoice(Scanner scanner) {
		while (true) {
			System.out.print("\nPlease choose an integer between 0 - 9: ");

			// 1. Anticipate the user not entering an integer.
			try {
				int choice = scanner.nextInt();

				// 2. Anticipate the choice being incorrect.
				if (incorrectChoice(choice)) {
					throw new IllegalArgumentException("Choice must be between 0-10");
				}
				return choice;

			} catch (IllegalArgumentException e) {
				System.out.println("Please enter an integer");
			}
		}
	}

	public static boolean incorrectChoice(int choice) {
		return choice < 0 || choice > 9;
	}

	public static double promptForRating(Scanner scanner, String name) {
		while (true) {
			System.out.print("\nSet a new rating for " + name + ": ");

			// 1. Anticipate the user not entering a double.
			try {
				double rating = scanner.nextDouble();
				if (incorrectRating(rating)) {
					throw new IllegalArgumentException("Rating must be between 0 - 10");
				}
				// 2. Anticipate the rating being incorrect.

				return rating;
			} catch (IllegalArgumentException e) {
				System.out.println("Rating must be a double");
			}
		}
	}

	public static boolean incorrectRating(double rating) {
		return rating < 0 || rating > 10;
	}

	public static void loadMovies(String fileName) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Scanner scanFile = new Scanner(fis);

		while (scanFile.hasNextLine()) {
			String line = scanFile.nextLine();
			String[] words = line.split("--");
//			store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
		}
		scanFile.close();
	}

	public static void printStore() {
		System.out.println("********************************MOVIE STORE*******************************");
		System.out.println(store);
	}

}
