package programsStuff;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import myObject.MyAgent;
import myObject.MyCar;
import myObject.MyPerson;
import myObject.MyPolicy;

public class OfficeProgram {
	private String officeName;
	private Map<Integer, MyAgent> agents;
	private int numberOfAgent;
	public static Map<Long, MyPerson> people;
	public static Map<String, MyCar> cars;
	public static Map<Long, MyPolicy> policies;
	// Convert type Date to String
	public static TreeMap<String, List<MyPolicy>> policiesByTime;

	public OfficeProgram(String name) {
		setOfficeName(name);
		setAgents(new TreeMap<Integer, MyAgent>());
	}

	/**
	 * 
	 * @param nameAgent
	 * @param numberAgent
	 *            - number of agent must be unique
	 * @return true if agent successfully add. And false if agentNumber already
	 *         exist
	 */
	public boolean addAgent(String nameAgent, Integer numberAgent) {

		if (!getAgents().containsKey(numberAgent)) {
			MyAgent newAgent = new MyAgent(nameAgent, numberAgent);
			getAgents().put(numberAgent, newAgent);
			int currentNumOfAgent = getNumberOfAgent();
			this.setNumberOfAgent(++currentNumOfAgent);
			return true;
		} else {

			return false;
		}
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public Map<Integer, MyAgent> getAgents() {
		return agents;
	}

	public void setAgents(Map<Integer, MyAgent> agents) {
		this.agents = agents;
	}

	public int getNumberOfAgent() {
		return numberOfAgent;
	}

	public void setNumberOfAgent(int numberOfAgent) {
		this.numberOfAgent = numberOfAgent;
	}

	public static Map<Long, MyPerson> getPeople() {
		return people;
	}

	public static void setPeople(Map<Long, MyPerson> people) {
		OfficeProgram.people = people;
	}

	public static Map<String, MyCar> getCars() {
		return cars;
	}

	public static void setCars(Map<String, MyCar> cars) {
		OfficeProgram.cars = cars;
	}

	public static Map<Long, MyPolicy> getPolicies() {
		return policies;
	}

	public static void setPolicies(Map<Long, MyPolicy> policies) {
		OfficeProgram.policies = policies;
	}

	public static TreeMap<String, List<MyPolicy>> getPoliciesByTime() {
		return policiesByTime;
	}

	public static void setPoliciesByTime(
			TreeMap<String, List<MyPolicy>> policiesByTime) {
		OfficeProgram.policiesByTime = policiesByTime;
	}

}
