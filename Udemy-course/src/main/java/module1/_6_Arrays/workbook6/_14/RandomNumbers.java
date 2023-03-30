package module1._6_Arrays.workbook6._14;

public class RandomNumbers {
	public static void main(String[] args) {

		// The instructions for this workbook are on Learn the Part (Workbook 6.14)

		int[][] array = new int[100][10];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = randomNumber();
			}
		}

		print2DArray(array);
	}

	/**
	 * function name: randomNumbers (int)
	 * 
	 * @return (int)
	 * 
	 *         What it does: Generates a random number
	 */
	public static int randomNumber() {
		return (int) (Math.random() * 100);
	}

	/**
	 * function name: print2DArray
	 * 
	 * @param array (int[][])
	 * 
	 *              What it does: Prints the 2D array
	 */
	public static void print2DArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
