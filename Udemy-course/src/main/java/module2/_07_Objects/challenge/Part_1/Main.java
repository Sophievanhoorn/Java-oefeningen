package module2._07_Objects.challenge.Part_1;

public class Main {

	/*
	 * Task 1 Add the following fields to the Movie class.
	 * 
	 * private String name; private String format; private double rating; Then
	 * create a constructor, copy constructor, getters, and setters.
	 * 
	 * Task 2 Create a toString method that returns the following String.
	 * 
	 * return this.rating + "\t" + this.format + "\t\t" + this.name + ""; Task 3
	 * Populate the array inside main() with the following Movie objects.
	 */

	public static void main(String[] args) {
		Movie[] movies = new Movie[] { new Movie("The Shawshank Redemption", "BlueRay", 9.2),
				new Movie("The Godfather", "BlueRay", 9.1), new Movie("The Godfather: Part II", "DVD", 9.0),
				new Movie("The Dark Knight", "BlueRay", 9.0), new Movie("Schindler's List", "DVD", 8.9),
				new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
				new Movie("Pulp Fiction", "DVD", 8.8),
				new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8) };

		System.out.println("********************************MOVIE STORE*******************************");
		for (int i = 0; i < movies.length; i++) {
			System.out.println(movies[i]);
		}

	}
}
