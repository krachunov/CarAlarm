package usersStuff;

public class Permissions {
	private boolean canAddnewAgent;
	private boolean canAddCar;
	private boolean canAddClient;
	private boolean canCreatePolicy;

	public void makeAdmin() {
		setCanAddnewAgent(true);
		setCanAddCar(true);
		setCanAddClient(true);
		setCanCreatePolicy(true);
	}

	public void makeAgentUser() {
		setCanAddnewAgent(false);
		setCanAddCar(true);
		setCanAddClient(true);
		setCanCreatePolicy(true);
	}

	public boolean isCanAddnewAgent() {
		return canAddnewAgent;
	}

	public void setCanAddnewAgent(boolean canAddnewAgent) {
		this.canAddnewAgent = canAddnewAgent;
	}

	public boolean isCanAddCar() {
		return canAddCar;
	}

	public void setCanAddCar(boolean canAddCar) {
		this.canAddCar = canAddCar;
	}

	public boolean isCanAddClient() {
		return canAddClient;
	}

	public void setCanAddClient(boolean canAddClient) {
		this.canAddClient = canAddClient;
	}

	public boolean isCanCreatePolicy() {
		return canCreatePolicy;
	}

	public void setCanCreatePolicy(boolean canCreatePolicy) {
		this.canCreatePolicy = canCreatePolicy;
	}

}
