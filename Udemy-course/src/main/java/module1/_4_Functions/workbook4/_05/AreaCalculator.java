package module1._4_Functions.workbook4._05;

public class AreaCalculator {

	static String error = "Error: impossible";

	public static void main(String[] args) {
		System.out.println("Thank you for using the area calculator");
		System.out.println("This calculator lets you get the area of: ");
		System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

		// Task 5 – Call area functions.

		double square = areaSquare(2);
		double rectangle = areaRectangle(1, 2);
		double triangle = areaTriangle(1, 2);
		double circle = areaCircle(2);

		// Task 7 – Call a function that prints all the areas.

		printAreas(square, rectangle, triangle, circle);

	}

	// Task 1 - Write a function that calculates the area of a square.
	/**
	 * Function name: areaSquare
	 * 
	 * @param side (double)
	 * @return (double)
	 */
	public static double areaSquare(double side) {
		if (side < 0) {
			System.out.println(error);
			System.exit(0);
		}
		return Math.pow(side, 2);
	}

	// Task 2 - Write a function that calculates the area of a rectangle.

	/**
	 * function name: areaRectangle
	 * 
	 * @param l (double)
	 * @param w (double)
	 * @return (double)
	 */
	public static double areaRectangle(double length, double width) {
		if (length < 0 || width < 0) {
			System.out.println(error);
			System.exit(0);
		}
		return length * width;
	}

	// Task 3 - Write a function that calculates the area of a triangle.

	/**
	 * Function name: areaTriangle
	 * 
	 * @param length (double)
	 * @param hight  (double)
	 * @return (double)
	 */
	public static double areaTriangle(double base, double hight) {
		if (base < 0 || hight < 0) {
			System.out.println(error);
			System.exit(0);
		}
		return (base * hight) / 2;
	}

	// Task 4 - Write a function that calculates the area of circle.

	/**
	 * Fuction name: areaCircle
	 * 
	 * @param radius (double)
	 * @return (double)
	 */
	public static double areaCircle(double radius) {
		if (radius < 0) {
			System.out.println(error);
			System.exit(0);
		}
		return Math.PI * Math.pow(radius, 2);
	}

	// Task 6: Write a function that prints every area.
	/**
	 * Function name: printAreas
	 * 
	 * @param square    (double)
	 * @param rectangle (double)
	 * @param triangle  (double)
	 * @param circle    (double)
	 */
	public static void printAreas(double square, double rectangle, double triangle, double circle) {
		System.out.println("Square area: " + square);
		System.out.println("Rectangle area: " + rectangle);
		System.out.println("Triangle area: " + triangle);
		System.out.println("Circle area " + circle);
	}
}
