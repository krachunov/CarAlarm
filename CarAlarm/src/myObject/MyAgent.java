package myObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

import programsStuff.OfficeProgram;
import readInfo.IOperation;

public class MyAgent implements IOperation {
	private String nameAgent;
	private Integer numberAgent;

	public MyAgent(String nameAgent, Integer numberAgent) {
		setNameAgent(nameAgent);
		setNumberAgent(numberAgent);
	}

	public MyPerson cratenewClient(Long egn, String firstName, String lastName,
			String phoneNumber) {
		MyPerson newClient = null;

		if (!OfficeProgram.getPeople().containsKey(egn)) {
			newClient = new MyPerson(egn, firstName, lastName, phoneNumber);
			OfficeProgram.getPeople().put(egn, newClient);
		} else {
			newClient = OfficeProgram.getPeople().get(egn);
		}
		// TODO
		return newClient;
	}

	/**
	 * 
	 * @param dkn
	 *            - String
	 * @param model
	 *            - String
	 * @param brand
	 *            - String
	 * @param chassis
	 *            - String
	 * @param tonnage
	 *            - Double
	 * @param prodYear
	 *            - String in format DD/MM/YYYY
	 * @param seatsNum
	 *            - int
	 * @param enginePower
	 *            -int
	 * @return - null or new element
	 */
	public MyCar crateNewCar(String dkn, String model, String brand,
			String chassis, Double tonnage, String prodYear, Integer seatsNum,
			Integer enginePower) {

		String[] splitedTime;
		String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
		String regexSeparator = "/";
		if (prodYear.matches(regex)) {
			splitedTime = prodYear.split(regexSeparator);
		} else {
			throw new IllegalArgumentException(
					"Enter the date in type DD/MM/YYYY");
		}

		Date validDateValue = new Date();
		validDateValue.setDate(Integer.parseInt(splitedTime[0]));
		validDateValue.setMonth(Integer.parseInt(splitedTime[1]));
		validDateValue.setYear((Integer.parseInt(splitedTime[2])));

		MyCar newCar = null;
		if (!OfficeProgram.getCars().containsKey(dkn)) {
			newCar = new MyCar(dkn, model, brand, chassis, tonnage,
					validDateValue, seatsNum, enginePower);
			OfficeProgram.getCars().put(dkn, newCar);
		} else {
			newCar = OfficeProgram.getCars().get(dkn);
		}
		OfficeProgram.getCars().put(dkn, newCar);
		return newCar;
	}

	public boolean createPolicy(Long egn, String dkn, Long policyNumber,
			String regDate, String validDate) throws DuplicateName {

		MyPerson client = OfficeProgram.getPeople().get(egn);
		MyCar car = OfficeProgram.getCars().get(dkn);
		String[] splitedTime;
		String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
		String regexSeparator = "/";
		if (validDate.matches(regex)) {
			splitedTime = validDate.split(regexSeparator);
		} else {
			throw new IllegalArgumentException(
					"Enter the date in type DD/MM/YYYY");
		}

		Date validDateValue = new Date();
		validDateValue.setDate(Integer.parseInt(splitedTime[0]));
		validDateValue.setMonth(Integer.parseInt(splitedTime[1]));
		validDateValue.setYear((Integer.parseInt(splitedTime[2])));
		MyPolicy newPolicy = new MyPolicy(policyNumber, this, client, car,
				new Date(), validDateValue);

		// Add policy to the general office
		if (OfficeProgram.getPolicies().containsKey(policyNumber)) {
			throw new DuplicateName("The number of policy already exist");
		} else {
			OfficeProgram.getPolicies().put(policyNumber, newPolicy);
		}

		// Add policy to the Date tree
		if (OfficeProgram.getPoliciesByTime().containsKey(validDateValue)) {
			List<MyPolicy> listOfPolicy = OfficeProgram.getPoliciesByTime()
					.get(validDateValue);
			listOfPolicy.add(newPolicy);
		} else {
			List<MyPolicy> listOfPolicy = new ArrayList<MyPolicy>();
			listOfPolicy.add(newPolicy);
			OfficeProgram.getPoliciesByTime().put(validDateValue, listOfPolicy);
		}

		// Add policy to Map in DKN. Every key-DKN contains list of polices
		if (OfficeProgram.getPoliciesByDKN().containsKey(dkn)) {
			List<MyPolicy> listOfPolicy = OfficeProgram.getPoliciesByDKN().get(
					dkn);
			listOfPolicy.add(newPolicy);
		} else {
			List<MyPolicy> listOfPolicy = new ArrayList<MyPolicy>();
			listOfPolicy.add(newPolicy);
			OfficeProgram.getPoliciesByDKN().put(dkn, listOfPolicy);
		}

		// Add policy to Map in AgentNumber. key is AgentNumber contains list of
		// polices
		if (OfficeProgram.getPoliciesByAgent().containsKey(getNumberAgent())) {
			List<MyPolicy> listOfPolicy = OfficeProgram.getPoliciesByAgent()
					.get(getNumberAgent());
			listOfPolicy.add(newPolicy);
		} else {
			List<MyPolicy> listOfPolicy = new ArrayList<MyPolicy>();
			listOfPolicy.add(newPolicy);
			OfficeProgram.getPoliciesByAgent().put(getNumberAgent(),
					listOfPolicy);
		}

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

	@Override
	public List<MyPolicy> serachingByDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyPolicy> serachingByDKN() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<MyPolicy> getPolicy() {
		
		return OfficeProgram.getPoliciesByAgent().get(getNumberAgent());
	}
}
