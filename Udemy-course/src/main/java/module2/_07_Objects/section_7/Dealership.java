package module2._07_Objects.section_7;

public class Dealership {

	private Car[] cars;

	/*
	 * deep copy -> to prevent the reference trap (2 variables are referenced to 1
	 * object. So when you change the value of 1 variable, you'll also change the
	 * value of the other variable)
	 */

	public Dealership(Car[] cars) {
		this.cars = new Car[cars.length];
		for (int i = 0; i < this.cars.length; i++) {
			this.cars[i] = new Car(cars[i]);
		}
	}
	
	public void sell(int index) {
		this.cars[index].drive();
	}

	@Override
	public String toString() {
		String temp = "";
		for (int i = 0; i < this.cars.length; i++) {
			temp += "Parking Spot: " + i + "\n";
			String carDescription = this.cars[i].toString();
			temp += carDescription + "\n";
		}
		return temp;
	}
}
