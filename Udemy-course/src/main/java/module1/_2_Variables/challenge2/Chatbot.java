package module1._2_Variables.challenge2;

import java.util.Scanner;

public class Chatbot {
	public static void main(String[] args) {

		// See Learn the Part for the complete instructions.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello. What is your name?");
		String name = scanner.nextLine();

		// add new a line before asking next question.
		// Pick up user's home and store it.
		System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
		String city = scanner.nextLine();

		// add new a line before asking next question.
		System.out.println("\nI hear it's beautiful at " + city + "! I'm from a place called Oracle");

		System.out.println("\nHow old are you?");
		int age = scanner.nextInt();

		// add new a line before asking next question.
		System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
		System.out.println("This means I'm " + (400 / age) + " times older than you.");
		System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
		scanner.nextLine();
		String language = scanner.nextLine();

		System.out.println("\n" + language + ", that's great! Nice chatting with you " + name
				+ ". I have to log off now. See ya!");

		scanner.close();

	}
}
