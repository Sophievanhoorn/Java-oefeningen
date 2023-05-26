package module2._09_ListCollections.Workbook.extraChallenge;

import java.util.ArrayList;
import java.util.List;

public class Store {

	private List<Book> bookCollection;
	private double wallet = 0;
	private List<Customer> customerList;

	public Store() {
		this.bookCollection = new ArrayList<>();
		this.customerList = new ArrayList<>();
	}

	public List<Book> getBookCollection() {
		List<Book> collection = new ArrayList<>();
		for (Book book : this.bookCollection) {
			collection.add(new Book(book));
		}
		return collection;
	}

	// returns a copy of the Book object -> deep copy
	public Book getBook(int index) {
		return new Book(bookCollection.get(index));
	}

	/**
	 * name: getBookByTitle()
	 * 
	 * What it does: gets the book by title.
	 * 
	 * @param title
	 * @return
	 */
	public Book getBookByTitle(String title) {
		for (Book book : this.bookCollection) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				return new Book(book);
			}
		}
		System.err.println("Book was not found.");
		return null;
	}

	public void setBook(int index, Book book) {
		this.bookCollection.set(index, book);
	}

	// Sets a new Book object at the given index -> deep copy
	public void editBookPrice(int index, double price) {
		Book book = new Book(getBook(index));
		book.setPrice(price);
		setBook(index, book);

	}

	// Adds a new Book object to the ArrayList -> deep copy
	public void addBook(Book book) {
		this.bookCollection.add(new Book(book));
	}

	public void removeBook(int index) {
		this.bookCollection.remove(index);
	}

	public void removeBook(Book book) {
		this.bookCollection.remove(book);
	}

	public double getWallet() {
		return this.wallet;
	}

	private double setWallet(double price) {
		wallet += price;
		return wallet;
	}

	public List<Customer> getCustomerList() {
		List<Customer> customerList = new ArrayList<>();
		for (Customer customer : this.customerList) {
			customerList.add(new Customer(customer));
		}
		return customerList;
	}

	public Customer getCustomerByName(String name) {
		for (Customer customer : this.customerList) {
			if (customer.getName().equalsIgnoreCase(name)) {
				return customer;
			}
		}
		System.err.println("Customer was not found.");
		return null;
	}

	public void setCustomer(Customer customer) {
		this.customerList.add(customer);
		customer.setCustomerNumber(customerList.size());

	}

	public void editCustomerList(Customer customer, String name) {
		if (customerList.contains(customer)) {
			customerList.get(customerList.indexOf(customer)).setName(name);
		} else {
			System.out.println("Customer not found");
		}
	}

	public void sellBook(Book book) {
		if (this.bookCollection.contains(book)) {
			setWallet(getBookByTitle(book.getTitle()).getPrice());
			removeBook(book);
		} else {
			System.out.println("The book was not found.");
		}
	}

	public String toString() {
		String temp = "* * * * * BOOK COLLECTION * * * * *\n\n";
		int i = 1;
		for (Book book : bookCollection) {
			temp += i++ + book.toString() + "\n";
		}
		return temp;
	}
}
