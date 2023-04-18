package module2._07_Objects.challenge.Part_2;

public class Main {

	/*
	 * Task 1 The Store constructor must grant this.movies the capacity to store 10
	 * elements.
	 * 
	 * Task 2 The getter must return a new copy of the Movie object being requested.
	 * 
	 * public Movie getMovie(int index) { // TODO return null; }
	 * 
	 * Task 3 The setter must update the array with a new copy of the Movie object.
	 * 
	 * public void setMovie(int index, Movie movie) { // TODO }
	 * 
	 * Task 4 Inside main(), populate the store (defined on top) with movies before
	 * printing it.
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
	}

	public static void printStore() {
		System.out.println("********************************MOVIE STORE*******************************");
		System.out.println(store);
	}
}
