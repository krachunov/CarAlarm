package programsStuff;

import java.util.ArrayList;
import java.util.List;

import myObject.MyPolicy;

public class Agent {
	private String nameAgent;
	private Integer numberAgent;
	private List<MyPolicy> policy;

	public Agent(String nameAgent, Integer numberAgent) {
		setNameAgent(nameAgent);
		setNumberAgent(numberAgent);
		setPolicy(new ArrayList<MyPolicy>());
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
