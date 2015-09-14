package myObject;

import java.util.Date;

public class MyPolicy {
	private Long policyNumber;
	private MyAgent agentNumber;
	private MyPerson myClient;
	private MyCar myCar;
	private Date registryDate;
	private Date validData;

	public MyPolicy(Long policyNumber, MyAgent agentNumber, MyPerson myClient,
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

	public MyAgent getAgentNumber() {
		return agentNumber;
	}

	public void setAgentNumber(MyAgent agentNumber) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((policyNumber == null) ? 0 : policyNumber.hashCode());
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
		MyPolicy other = (MyPolicy) obj;
		if (policyNumber == null) {
			if (other.policyNumber != null)
				return false;
		} else if (!policyNumber.equals(other.policyNumber))
			return false;
		return true;
	}

}
