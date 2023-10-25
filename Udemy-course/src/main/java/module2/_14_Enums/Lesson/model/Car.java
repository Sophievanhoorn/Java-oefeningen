package module2._14_Enums.Lesson.model;


public class Car {
	private String make;
	private String model;
	private int productionYear;
	private double price;

	private enum BodyType {
		SEDAN, COUPE, HATCHBACK, SUV, TRUCK, VAN
	}

	public enum TrafficLight {
		RED, GREEN, YELLOW
	}

	public Car(String make, int year, String model, int productionYear, double price, BodyType bodyType) {
		this.make = make;
		this.productionYear = year;
		this.model = model;
//		if() {
//			
//		}
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return this.productionYear;
	}

	public void setYear(int year) {
		this.productionYear = year;
	}

	public void drive(TrafficLight trafficLight) {
		if (trafficLight == null)
			throw new IllegalArgumentException("Traffic Light cannot be null");

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

	// public void drive(TrafficLight trafficLight) {
	// if (trafficLight == null) throw new IllegalArgumentException("Traffic Light
	// cannot be null");
	// switch (trafficLight) {
	// case RED: System.out.println("STOP"); break;
	// case GREEN: System.out.println("DRIVE"); break;
	// case YELLOW: System.out.println("SLOW DOWN"); break;
	// }
	// }

}
