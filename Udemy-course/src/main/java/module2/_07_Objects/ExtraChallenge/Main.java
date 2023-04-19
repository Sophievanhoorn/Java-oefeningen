package module2._07_Objects.ExtraChallenge;

import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		ContactManager contactManager = new ContactManager(contactData());
		displayContacts(contactManager);

		System.out.println("\nYou have 8 contacts. Enter 'continue' to edit them: ");
		String status = scan.nextLine();

		while (status.equalsIgnoreCase("continue")) {
			System.out.println("Choose an index between 1 -8: ");
			int index = scan.nextInt() - 1;
			scan.nextLine();

			contactManager.setContact(editedContact(), index);
			
			System.out.println("\n\nUPDATED CONTACTS\n\n");
			displayContacts(contactManager);
			System.out.println("Enter 'continue to make more changes: '");
			status = scan.nextLine();
		}

		scan.close();
	}

	public static Contact[] contactData() {

		return new Contact[] { new Contact("John Doe", "555-123-4567", "1985-01-01"),
				new Contact("Jane Smith", "555-987-6543", "1990-02-14"),
				new Contact("Alice Johnson", "555-345-6789", "1975-03-30"),
				new Contact("Bob Brown", "555-567-8910", "2000-12-25"),
				new Contact("Charlie Davis", "555-111-2222", "1983-07-04"),
				new Contact("Diana White", "555-333-4444", "1997-11-18"),
				new Contact("Ethan Green", "555-555-6666", "1988-05-22"),
				new Contact("Fiona Black", "555-777-8888", "2002-10-31") };
	}

	public static void displayContacts(ContactManager contactManager) {
		for (int i = 0; i < 8; i++) {
			Contact contact = contactManager.getContact(i);
			System.out.println(contact);
		}
	}

	public static Contact editedContact() {
		System.out.println("\tName: ");
		String name = scan.nextLine();
		System.out.println("\tPhone Number: ");
		String phoneNumber = scan.nextLine();
		System.out.println("\tBirth Date: ");
		String birthDate = scan.nextLine();

		return new Contact(name, phoneNumber, birthDate);
	}
}
