package programsStuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import myObject.MyAgent;

public class OfficeProgram {
	private String officeName;
	private Map<Integer, MyAgent> agents;
	private int numberOfAgent;

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

}
