package module2._09_ListCollections.Workbook.extraChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	/*
	 * Test the Store class by creating a few Book objects, initializing a Store
	 * object with those books, and then using the getBook, setBook, addBook,
	 * contains, and sellBook methods to manipulate the books. Use breakpoints to
	 * visualize the runtime.
	 */

	public static final Scanner scan = new Scanner(System.in);
	public static Store store;

	public static void main(String[] args) {

		store = new Store();

		List<Book> shoppingBasket = new ArrayList<>();

		Customer[] customers = new Customer[] { (new Customer("Sophie")), (new Customer("Bart")),
				(new Customer("Simone")) };

		Book[] books = new Book[] { new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99),
				new Book("1984", "George Orwell", 4.17, 12.99), new Book("Moby-Dick", "Herman Melville", 3.5, 14.99),
				new Book("Pride and Prejudice", "Jane Austen", 4.25, 10.99) };

		fillCustomerList(customers);
		fillBookCollection(books);

		System.out.println("Welcome! What is your name?\t");
		String name = scan.nextLine();

		if (store.getCustomerByName(name) == null) {
			System.out.println("You are not yet in our system.\nDo you want to register now?");
			String register = scan.nextLine();

			if (register.equalsIgnoreCase("yes")) {
				Customer newCustomer = new Customer(name);

				registerCustomer(newCustomer);
				System.out.println("You are now registered!\nHave fun shopping :)\n");

				helpCustomer(newCustomer);
			} else {
				System.out.println("Okay, maybe next time.\nHave a nice day!");
				System.exit(0);
			}

		} else {
			helpCustomer(store.getCustomerByName(name));
		}

		System.out.println(store.toString());
	}

	public static void fillCustomerList(Customer[] customerList) {
		for (Customer customer : customerList) {
			store.setCustomer(customer);
		}
	}

	public static void fillBookCollection(Book[] books) {
		for (Book book : books) {
			store.addBook(book);
		}
	}

	public static void registerCustomer(Customer newCustomer) {
		store.getCustomerList().add(newCustomer);
	}

	public static void helpCustomer(Customer customer) {
		boolean checkout = false;
		System.out.println(store.toString());

		while (!checkout) {

			System.out.println("What book would you like to buy? 1 - " + store.getBookCollection().size());
			int index = scan.nextInt() - 1;
			scan.nextLine();

			customer.addToshoppingBasket(store.getBook(index));
			System.out.println("\nThe book: " + store.getBook(index).getTitle() + " was added to your basket:\n");
			System.out.println(customer.getshoppingBasket());
			System.out.println("\nWould you like to check-out? yes/no\n");
			if (scan.nextLine().equalsIgnoreCase("yes")) {
				customer.getshoppingBasket();
				checkout = checkout(customer);
			} else {
				checkout = false;
			}
		}
	}

	public static boolean checkout(Customer customer) {
		double totalPrice = 0;

		for (Book book : customer.getshoppingBasket()) {
			totalPrice += book.getPrice();
		}
		System.out.println("\nItems in your basket:");
		for (int i = 0; i < customer.getshoppingBasket().size(); i++) {
			Book book = customer.getshoppingBasket().get(i);
			System.out.println((i + 1) + ". €" + book.getPrice() + "\t" + book.getTitle());
		}
		System.out.println("---------------------");
		System.out.println("   €" + totalPrice + "\tTOTAL");

		System.out.println("\nWould you like to continue check-out? yes/no\n");
		if (scan.nextLine().equalsIgnoreCase("yes")) {

			for (Book soldBook : customer.getshoppingBasket()) {
				store.getBookByTitle(soldBook.getTitle());
				for (Book book : store.getBookCollection()) {

					if (book.getTitle().equalsIgnoreCase(soldBook.getTitle())) {
						store.sellBook(soldBook);
						customer.pay(totalPrice);
					}
				}
			}
			return true;
		} else {
			System.out.println("Check-out cancelled.");
			return false;
		}
	}
}
