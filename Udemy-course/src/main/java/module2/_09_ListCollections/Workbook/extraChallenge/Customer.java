package module2._09_ListCollections.Workbook.extraChallenge;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	String name;
	int customerNumber;
	double savings;
	List<Book> bookCollection;
	List<Book> shoppingBasket;

	public Customer(String name) {
		this.name = name;
		setSavings();
		this.bookCollection = new ArrayList<>();
		this.shoppingBasket = new ArrayList<>();
	}

	public Customer(Customer source) {
		this.name = source.name;
		setSavings();
		this.bookCollection = source.getBookCollection();
		this.shoppingBasket = new ArrayList<>();
	}

	public int getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public double getSavings() {
		return this.savings;
	}

	private void setSavings() {
		int temp = (int) (Math.random() * 500);
		this.savings = temp;
	}

	public List<Book> getBookCollection() {
		List<Book> collection = new ArrayList<>();
		for (Book book : this.bookCollection) {
			collection.add(new Book(book));
		}
		return collection;
	}

	public void addToBookCollection(Book book) {
		this.bookCollection.add(new Book(book));
	}

	public List<Book> getshoppingBasket() {
		List<Book> basket = new ArrayList<>();
		for (Book book : this.shoppingBasket) {
			basket.add(new Book(book));
		}
		return basket;
	}

	public void addToshoppingBasket(Book book) {
		this.shoppingBasket.add(new Book(book));
	}

	public void pay(double totalPrice) {
		if (this.savings < totalPrice) {
			System.out.println("Card declined.");
		} else {
			this.savings -= totalPrice;
			this.bookCollection.addAll(shoppingBasket);
			this.shoppingBasket.clear();

			System.out.println("Payment succesfull!");
			System.out.println("Books were added to your personal collection:\n");
			System.out.println(bookCollection);
		}
	}

	public String toString() {
		String temp = "Name:\t " + getName() + "\nBook collection:\n";
		for (Book book : bookCollection) {
			temp += "\t" + book.getTitle() + "\n";
		}
		return temp;
	}
}