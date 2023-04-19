package module2._07_Objects.ExtraChallenge;

import java.time.LocalDate;
import java.time.Period;

public class Contact {

	private String name;
	private String phoneNumber;
	private String birthDate;
	private int age;

	public Contact(String name, String phoneNumber, String birthDate) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
		this.age = toAge(this.birthDate);
	}

	public Contact(Contact source) {
		this.name = source.name;
		this.phoneNumber = source.phoneNumber;
		this.birthDate = source.birthDate;
		this.age = source.age;
	}

	private int toAge(String birthDate) {
		LocalDate date = LocalDate.now();
		LocalDate birthDateFormat = LocalDate.parse(birthDate);

		return Period.between(birthDateFormat, date).getYears();
	}

	private void setAge(String birthDate) {
		this.age = toAge(birthDate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
		setAge(birthDate);
	}

	public String toString() {
		return "Name: " + this.name + "\n" + "\tPhone number: " + this.phoneNumber + "\n" + "\tBirth Date: "
				+ this.birthDate + "\n" + "\tAge: " + this.age + " years old\n";
	}
}
