package myObject;

import java.util.Date;

import programsStuff.Agent;

public class MyPolicy {
	private Long policyNumber;
	private Agent agentNumber;
	private MyPerson myClient;
	private MyCar myCar;
	private Date date;

	public Long getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(Long policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Agent getAgentNumber() {
		return agentNumber;
	}

	public void setAgentNumber(Agent agentNumber) {
		this.agentNumber = agentNumber;
	}

	public MyPerson getMyClient() {
		return myClient;
	}

	public void setMyClient(MyPerson myClient) {
		this.myClient = myClient;
	}

	public MyCar getMyCar() {
		return myCar;
	}

	public void setMyCar(MyCar myCar) {
		this.myCar = myCar;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
