package myObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import programsStuff.OfficeProgram;

public class MyAgent {
	private String nameAgent;
	private Integer numberAgent;
	private List<MyPolicy> policy;

	public MyAgent(String nameAgent, Integer numberAgent) {
		setNameAgent(nameAgent);
		setNumberAgent(numberAgent);
		setPolicy(new ArrayList<MyPolicy>());
	}

	public boolean createPolicy(Long egn, String firstName, String lastName,
			String phoneNumber, Long policyNumber, String dkn, String model,
			String brand, String chassis, String tonnage, Date prodYear,
			Integer seatsNum, Integer enginePower, Date regDate, Date validDate) {
		MyPerson newClient = null;
		MyCar newCar = null;
		if (!OfficeProgram.getPeople().containsKey(egn)) {
			newClient = new MyPerson(egn, firstName, lastName, phoneNumber);
			OfficeProgram.getPeople().put(egn, newClient);
		} else {
			newClient = OfficeProgram.getPeople().get(egn);
		}
		if (!OfficeProgram.getCars().containsKey(dkn)) {
			newCar = new MyCar(dkn, model, brand, chassis, tonnage, prodYear,
					seatsNum, enginePower);
			OfficeProgram.getCars().put(dkn, newCar);
		} else {
			newCar = OfficeProgram.getCars().get(dkn);
		}
		MyPolicy newPolicy = new MyPolicy(policyNumber, this, newClient,
				newCar, regDate, validDate);
		return true;
	}

	public String getNameAgent() {
		return nameAgent;
	}

	public void setNameAgent(String nameAgent) {
		this.nameAgent = nameAgent;
	}

	public Integer getNumberAgent() {
		return numberAgent;
	}

	public void setNumberAgent(Integer numberAgent) {
		this.numberAgent = numberAgent;
	}

	public List<MyPolicy> getPolicy() {
		return policy;
	}

	public void setPolicy(List<MyPolicy> policy) {
		this.policy = policy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numberAgent == null) ? 0 : numberAgent.hashCode());
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
		MyAgent other = (MyAgent) obj;
		if (numberAgent == null) {
			if (other.numberAgent != null)
				return false;
		} else if (!numberAgent.equals(other.numberAgent))
			return false;
		return true;
	}
}
