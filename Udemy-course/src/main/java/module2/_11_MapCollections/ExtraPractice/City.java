package module2._11_MapCollections.ExtraPractice;

public class City {

	private String name;
	private String country;
	private long population;

	public City(String name, String country, long population) {
		setName(name);
		setCountry(country);
		setPopulation(population);
	}

	public City(City city) {
		name = city.name;
		country = city.country;
		population = city.population;
	}

	public void setName(String name) {
		if (!name.isEmpty() || !name.equals("")) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Name cannot be empty.");
		}
	}

	public String getName() {
		return name;
	}

	public void setCountry(String country) {
		if (!country.isEmpty() || !country.equals("")) {
			this.country = country;
		} else {
			throw new IllegalArgumentException("Country cannot be empty.");
		}
	}

	public String getCountry() {
		return country;
	}

	public void setPopulation(long population) {
		if (population > 0) {
			this.population = population;
		} else {
			throw new IllegalArgumentException("Population must be higher than 0.");
		}
	}

	public long getPopulation() {
		return population;
	}

	@Override
	public String toString() {
		return "\n\nCity:\t\t" + name + "\nCountry:\t" + country + "\nPopulation:\t" + population;
	}
}
