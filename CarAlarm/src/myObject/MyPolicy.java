package myObject;

import java.util.Date;

import programsStuff.Agent;

public class MyPolicy {
	private Long policyNumber;
	private Agent agentNumber;
	private MyPerson myClient;
	private MyCar myCar;
	private Date registryDate;
	private Date validData;

	public MyPolicy(Long policyNumber, Agent agentNumber, MyPerson myClient,
			MyCar myCar, Date regDate, Date validDate) {
		setPolicyNumber(policyNumber);
		setAgentNumber(agentNumber);
		setMyClient(myClient);
		setMyCar(myCar);
		setRegistryDate(regDate);
		setValidData(validDate);
	}

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

	public Date getRegistryDate() {
		return registryDate;
	}

	public void setRegistryDate(Date registryDate) {
		this.registryDate = registryDate;
	}

	public Date getValidData() {
		return validData;
	}

	public void setValidData(Date validData) {
		this.validData = validData;
	}

}
