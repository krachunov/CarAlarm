package programsStuff;

import java.util.Map;
import java.util.TreeMap;

import myObject.Car;
import myObject.Client;

public class Agent {
	private String nameAgent;
	private Integer numberAgent;
	private Map<String, Car> cars;
	private Map<Integer, Client> clients;

	public Agent(String nameAgent, Integer numberAgent) {
		setNameAgent(nameAgent);
		setNumberAgent(numberAgent);
		setCars(new TreeMap<String, Car>());
		setClients(new TreeMap<Integer, Client>());
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

	public Map<String, Car> getCars() {
		return cars;
	}

	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}

	public Map<Integer, Client> getClients() {
		return clients;
	}

	public void setClients(Map<Integer, Client> clients) {
		this.clients = clients;
	}

}
