package sections.section4;

public class ReturnValues {

	public static void main(String[] args) {

		System.out.println(calculateArea(5.90, 2.00));
		System.out.println(getLanguage("Dutch"));
	}

	public static double calculateArea(double length, double width) {

		if (length < 0 || width < 0) {
			System.out.println("INVALID NUMBERS");
			System.exit(0);
		}
		return length * width;
	}

	public static String getLanguage(String language) {

		switch (language) {
		case "English":
			return "You chose English";
		case "Dutch":
			return "You chose Dutch";
		case "French":
			return "You chose French";
		default:
			return "You chose non of the options";
		}
	}
}
