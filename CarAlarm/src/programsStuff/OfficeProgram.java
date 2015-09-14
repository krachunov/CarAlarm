package programsStuff;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import readInfo.ISearchOperation;
import readInfo.Reader;
import myObject.MyAgent;
import myObject.MyCar;
import myObject.MyPerson;
import myObject.MyPolicy;

public class OfficeProgram implements ISearchOperation {
	private String officeName;
	private Map<Integer, MyAgent> agents;
	private int numberOfAgent;
	private Reader reader;
	public static Map<Long, MyPerson> people; // key is EGN
	public static Map<String, MyCar> cars; // key is DKN
	public static Map<Long, MyPolicy> policies; // key is policy number
	public static Map<String, List<MyPolicy>> policiesByDKN;// key is DKN
	public static TreeMap<Date, List<MyPolicy>> policiesByTime; // key is Date
	public static TreeMap<Integer, List<MyPolicy>> policiesByAgent;// key is
																	// Agent
																	// number

	public OfficeProgram(String name) {
		setOfficeName(name);
		setAgents(new TreeMap<Integer, MyAgent>());
		setReader(new Reader());
		setPeople(new TreeMap<Long, MyPerson>());
		setCars(new TreeMap<String, MyCar>());
		setPolicies(new TreeMap<Long, MyPolicy>());
		setPoliciesByTime(new TreeMap<Date, List<MyPolicy>>());
		setPoliciesByDKN(new TreeMap<String, List<MyPolicy>>());
		setPoliciesByAgent(new TreeMap<Integer, List<MyPolicy>>());
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

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
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

	public static TreeMap<Date, List<MyPolicy>> getPoliciesByTime() {
		return policiesByTime;
	}

	public static void setPoliciesByTime(
			TreeMap<Date, List<MyPolicy>> policiesByTime) {
		OfficeProgram.policiesByTime = policiesByTime;
	}

	public static Map<String, List<MyPolicy>> getPoliciesByDKN() {
		return policiesByDKN;
	}

	public static void setPoliciesByDKN(
			Map<String, List<MyPolicy>> policiesByDKN) {
		OfficeProgram.policiesByDKN = policiesByDKN;
	}

	@Override
	public List<MyPolicy> serachingByDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyPolicy> serachingPolicyByDKN() {
		// TODO Auto-generated method stub
		return null;
	}

	public static TreeMap<Integer, List<MyPolicy>> getPoliciesByAgent() {
		return policiesByAgent;
	}

	public static void setPoliciesByAgent(
			TreeMap<Integer, List<MyPolicy>> policiesByAgent) {
		OfficeProgram.policiesByAgent = policiesByAgent;
	}

}
