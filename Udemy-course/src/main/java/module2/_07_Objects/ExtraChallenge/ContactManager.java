package module2._07_Objects.ExtraChallenge;

import java.util.Arrays;

public class ContactManager {

	private Contact[] contacts;

	public ContactManager(Contact[] contacts) {
		this.contacts = Arrays.copyOf(contacts, contacts.length);
		for (int i = 0; i < this.contacts.length; i++) {
			this.contacts[i] = new Contact(contacts[i]);
		}
	}

	public Contact getContact(int index) {
		return new Contact(contacts[index]);
	}

	public void setContact(Contact contact, int index) {
		this.contacts[index] = new Contact(contact);
	}

	public String toString() {
		String temp = "";
		for (int i = 0; i < contacts.length; i++) {
			temp += contacts[i].toString();
		}
		return temp;
	}
}
