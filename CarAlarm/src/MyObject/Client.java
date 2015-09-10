package MyObject;

public class Client {
	private Integer egn;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Car myCar;

	public Client(Integer egn, String firstName, String lastName,
			String phoneNumber, Car mCar) {
		setEgn(egn);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setMyCar(mCar);

	}

	public Integer getEgn() {
		return egn;
	}

	public void setEgn(Integer egn) {
		this.egn = egn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Car getMyCar() {
		return myCar;
	}

	public void setMyCar(Car myCar) {
		this.myCar = myCar;
	}

}
