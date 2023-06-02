package module2._10_ExceptionHandling.Lessons.uncheckedExceptions.argumentValidation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		User user = new User();
		System.out.println("We are setting up your user account.");

		System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
		String username = scanner.nextLine();
		if (username.isEmpty()) {
			System.out.println("Sorry, this is an invalid username");
		}else {
			user.setUsername(scanner.nextLine());
		}

		System.out.print("Your age is currently " + user.getAge() + ". Please update it here: ");
		user.setAge(scanner.nextInt());
		scanner.close();
	}
}