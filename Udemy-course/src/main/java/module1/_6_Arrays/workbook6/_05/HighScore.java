package module1._6_Arrays.workbook6._05;

public class HighScore {
	public static void main(String[] args) {

		int highScore = 0;

		int[] intArray = new int[10];

		System.out.print("Here are the scores:");

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = randomNumber();

			System.out.print(" " + intArray[i]);

			if (intArray[i] >= highScore) {
				highScore = intArray[i];
			}
		}

		System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

	}

	/**
	 * Function name: randomNumber()
	 * 
	 * @return (int)
	 * 
	 *         What it does: return a random number
	 */
	public static int randomNumber() {
		return (int) (Math.random() * 50000);
	}

}
