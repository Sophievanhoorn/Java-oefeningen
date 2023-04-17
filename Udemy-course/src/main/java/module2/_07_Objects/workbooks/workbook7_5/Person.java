package module2._07_Objects.workbooks.workbook7_5;

public class Person {

	private String name;
	private String nationality;
	private String dateOfBirth;
	private String[] passport;
	private int seatNumber;

	public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
		this.name = name;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.seatNumber = seatNumber;
	}

	public Person(Person source) {
		this.name = source.name;
		this.nationality = source.nationality;
		this.dateOfBirth = source.dateOfBirth;
		this.seatNumber = source.seatNumber;
	}

	/**
	 * what it does: Returns a random boolean
	 * 
	 * @return (boolean)
	 */
	public boolean applyPassport() {
		int number = (int) (Math.random() * 2);
		return number == 1;
	}

	/**
	 * what it does: sets seatNumber to random number between 1 - 11
	 */
	public void chooseSeat() {
		this.seatNumber = (int) (Math.random() * 11 + 1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

}
