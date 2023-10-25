package module2._11_MapCollections.ExtraPractice;

import java.util.HashMap;

public class CityPopulationTracker {

	private HashMap<String, City> cityPopulations;

	public CityPopulationTracker() {
		this.cityPopulations = new HashMap<>();
	}

//	Task 3
//	Create a getCity method that takes a city name as a parameter and returns a deep copy of the City object associated with that city.
	public City getCity(String name) {
		if (cityPopulations.isEmpty() || cityPopulations.get(name) == null) {
			throw new NullPointerException("City was not found");
		} else {
			return new City(cityPopulations.get(name));
		}
	}

	// Task 4
//	Create a setCity method that takes a City object as a parameter, and sets a deep copy of the City object in the HashMap with the corresponding city name as the key.
	public void setCity(City city) {
		if (cityPopulations.isEmpty() || !cityPopulations.containsKey(city.getName())) {
			throw new NullPointerException("City was not found");
		} else {
			cityPopulations.replace(city.getName(), new City(city));
		}
	}

	// Task 5
//	Create an addCity method that takes a City object as a parameter, and adds a deep copy of the City object to the HashMap with the corresponding city name as the key.
	public void addCity(City city) {
		cityPopulations.put(city.getName(), new City(city));
	}

	@Override
	public String toString() {
		return cityPopulations.values() + "\n";
	}

	// Task 6
//	Test the CityPopulationTracker class by adding a few City objects, and then use the getCity, setCity, and addCity methods to manipulate the city data.

}
