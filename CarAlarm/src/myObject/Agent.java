package myObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import readInfo.Reader;

public class Agent {
	private String nameAgent;
	private Integer numberAgent;
	private List<MyPolicy> policy;

	public Agent(String nameAgent, Integer numberAgent) {
		setNameAgent(nameAgent);
		setNumberAgent(numberAgent);
		setPolicy(new ArrayList<MyPolicy>());
	}

	public boolean addNewPolicy(Long policyNumber, Agent agentNumber, MyPerson myClient,
			MyCar myCar, Date regDate, Date validDate) {
//		MyPerson client = Reader.getClients()
//	TODO 
		return false;
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

}
