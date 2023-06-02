package module2._10_ExceptionHandling.Lessons.uncheckedExceptions.argumentValidation;

public class User {

	private String username;
	private int age;

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}
		this.age = age;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		if (username == null || username.isEmpty()) {
			throw new IllegalArgumentException("Username cannot be empty");
		}
		this.username = username;
	}

}
