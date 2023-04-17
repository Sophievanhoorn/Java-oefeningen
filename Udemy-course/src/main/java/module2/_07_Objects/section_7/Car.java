package module2._07_Objects.section_7;

import java.util.Arrays;

public class Car {

	private String make;
	private double price;
	private int year;
	private String color;
	private String[] parts;

	public Car(String make, double price, int year, String color, String[] parts) {
		this.make = make;
		this.price = price;
		this.year = year;
		this.color = color;
		this.parts = Arrays.copyOf(parts, parts.length);
	}

	public Car(Car source) {
		this.make = source.make;
		this.price = source.price;
		this.year = source.year;
		this.color = source.color;
		this.parts = source.parts;
	}

	public void drive() {
		System.out
				.println("You bought a " + color + " " + make + " from the year " + year + " for only €" + price + ".");
		System.out.println("Please drive your car to the nearest exit.\n");
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String[] getParts() {
		return Arrays.copyOf(parts, parts.length);
	}

	public void setParts(String[] parts) {
		this.parts = Arrays.copyOf(parts, parts.length);
	}

	public void setParts2(int index, String part) {

		this.parts[index] = part;
	}

	public String toString() {
		return "Make: " + this.make + ".\n" + "Price: " + this.price + ".\n" + "Year: " + this.year + ".\n" + "Color: "
				+ this.color + ".\n" + "Parts: " + Arrays.toString(parts) + ".\n";
	}
}
