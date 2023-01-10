package sections.section4;

public class Parameters {

	public static void main(String[] args) {
		
		double l = 2.50;
		double w = 3.800;
		
		calculateArea(l, w);
		calculateArea(3.89, 5.02);
		calculateArea(1.5, 2.90);
	}

	private static void calculateArea(double length, double width) {
		System.out.println("Area: " + length * width);
	}
}
