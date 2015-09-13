package myObject;

public class MyPerson {

	private Long egn;
	private String firstName;
	private String lastName;
	private String phoneNumber;

	public MyPerson(Long egn, String firstName, String lastName,
			String phoneNumber) {
		setEgn(egn);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((egn == null) ? 0 : egn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyPerson other = (MyPerson) obj;
		if (egn == null) {
			if (other.egn != null)
				return false;
		} else if (!egn.equals(other.egn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getEgn() + ": " + getFirstName() + " " + getLastName() + ": "
				+ getPhoneNumber();
	}

	public Long getEgn() {
		return egn;
	}

	public void setEgn(Long egn) {
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

}
