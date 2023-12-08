package module2._14_Enums.Workbook.extra;

import java.util.ArrayList;
import java.util.List;

import module2._14_Enums.Workbook.extra.model.Car;

public class CarDealership {

	private List<Car> carArray;

	public CarDealership() {
		this.carArray = new ArrayList<>();
	}

	public Car getCar(int index) {
		return new Car(carArray.get(index));
	}

	/*
	 * Task 3 Create a getCar method that takes an index as a parameter and returns
	 * a deep copy of the Car object at that index. Hint: You must return to the Car
	 * class and give it a copy constructor.
	 */

	public void setCar(Car car, int index) {
		carArray.set(index, new Car(car));
	}

	/*
	 * Task 4 Create a setCar method that takes a Car object and an index as
	 * parameters and sets the Car object at the specified index to a deep copy of
	 * the given object.
	 */

	public void addCar(Car car) {
		carArray.add(new Car(car));
	}

	/*
	 * Task 5 Create an addCar method that takes a Car object as a parameter and
	 * adds a deep copy of the object to the cars ArrayList.
	 */

}
