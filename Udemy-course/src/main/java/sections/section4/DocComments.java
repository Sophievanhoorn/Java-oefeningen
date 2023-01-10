package sections.section4;

public class DocComments {

	public static void main(String[] args) {
		greet();
	}

	/**
	 * Fuction name: greet
	 * 
	 * What it does: 1. Prints "Hi"
	 */
	public static void greet() {
		System.out.println("Hi!");
	}

	/**
	 * function name: getText
	 * 
	 * @param name (String)
	 * @param age  (String)
	 * @return (String)
	 * 
	 *         What it does: 1. It returns a text with the given parameters
	 */
	public static String getText(String name, String age) {
		return "Hi, my name is " + name + " and I'm " + age + " years old.";
	}

}
