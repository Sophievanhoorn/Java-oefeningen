package module2._14_Enums.Workbook.extra.model;

import java.time.LocalDate;

public class Car {
	private static int MIN_YEAR = 1900;
	private static double MIN_PRICE = 0;
	private static double MAX_PRICE = 200000;

	private String make;
	private String model;
	private BodyType bodyType;
	private int year;
	private double price;

	public enum BodyType {
		SEDAN, COUPE, HATCHBACK, SUV, TRUCK, VAN
	}

	private enum TrafficLight {
		RED, GREEN, YELLOW
	}

	public Car(String make, String model, BodyType bodyType, int year, double price) {
		setMake(make);
		setModel(model);
		setBodyType(bodyType);
		setYear(year);
		setPrice(price);

	}

//	public Car(String make, String model, int year, double price, BodyType bodyType) {
//		this.make = make;
//		this.model = model;
//		this.bodyType = bodyType;
//		this.year = year;
//		this.price = price;
//
//	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		if (make == null || make.isEmpty()) {
			throw new IllegalArgumentException("Make can't be empty");
		} else {
			this.make = make;
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		if (model == null || model.isEmpty()) {
			throw new IllegalArgumentException("Model can't be empty");
		} else {
			this.model = model;
		}
	}

	public BodyType getBodyType() {
		return this.bodyType;
	}

	public void setBodyType(BodyType bodyType) {
		if (bodyType == null) {
			throw new IllegalArgumentException("The bodytype can't be empty");
		} else {
			this.bodyType = bodyType;
		}
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		if (year < MIN_YEAR || year > LocalDate.now().getYear()) {
			throw new IllegalArgumentException(
					"Year can't be lower than " + MIN_YEAR + " or higher than " + LocalDate.now().getYear());
		} else {
			this.year = year;
		}
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		if (price < MIN_PRICE || price > MAX_PRICE) {
			throw new IllegalArgumentException("Price can't be lower than 0 or higher than 200.000");
		} else {
			this.price = price;
		}
	}

	public void drive(TrafficLight trafficLight) {
		if (trafficLight == null)
			throw new IllegalArgumentException("Traffic light can't be empty");

		switch (trafficLight) {
		case RED:
			System.out.println("STOP");
			break;
		case GREEN:
			System.out.println("DRIVE");
			break;
		case YELLOW:
			System.out.println("SLOW DOWN");
			break;
		}
	}

	public String toString() {
		return "Make:\t\t" + getMake() + "\nModel:\t\t" + getModel() + "\nBodyType:\t" + getBodyType() + "\nYear:\t\t"
				+ getYear() + "\nPrice:\t\t" + "€" + getPrice();
	}
}
