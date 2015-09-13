package myObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import readInfo.Reader;

public class MyAgent {
	private String nameAgent;
	private Integer numberAgent;
	private List<MyPolicy> policy;

	public MyAgent(String nameAgent, Integer numberAgent) {
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
