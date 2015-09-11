package programsStuff;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;
import java.util.TreeMap;

import readInfo.ICreateObject;
import readInfo.InvalidCarDataException;
import readInfo.ReadObject;
import myObject.Car;
import myObject.Client;

public class Agent implements ICreateObject {
	private ReadObject read;
	private String nameAgent;
	private Integer numberAgent;
	private Map<String, Car> cars;
	private Map<Long, Client> clients;

	public Agent(String nameAgent, Integer numberAgent)
			throws FileNotFoundException, IOException, InvalidCarDataException,
			ParseException {
		setRead(new ReadObject());
		setNameAgent(nameAgent);
		setNumberAgent(numberAgent);
		setCars();
		setClients();
	}

	public void machCarClient() {
		for (Map.Entry<Long, Client> client : clients.entrySet()) {
			
		}
	}

	public ReadObject getRead() {
		return read;
	}

	public void setRead(ReadObject read) {
		this.read = read;
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

	public void setCars() throws FileNotFoundException, IOException,
			InvalidCarDataException, ParseException {
		this.cars = read.carReading();
	}

	public Map<Long, Client> getClients() {
		return clients;
	}

	public void setClients() throws FileNotFoundException, IOException {
		this.clients = read.clientReading();
	}

	@Override
	public Map<Long, Client> clientReading() throws FileNotFoundException,
			IOException {
		// TODO Auto-generated method stub
		return read.clientReading();
	}

	@Override
	public Map<String, Car> carReading() throws FileNotFoundException,
			IOException, InvalidCarDataException, ParseException {
		// TODO Auto-generated method stub
		return read.carReading();
	}

}
