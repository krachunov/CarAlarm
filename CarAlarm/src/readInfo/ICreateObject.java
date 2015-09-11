package readInfo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

import myObject.Car;
import myObject.Client;

public interface ICreateObject {
	public Map<Long, Client> clientReading() throws FileNotFoundException,
			IOException;

	public Map<String, Car> carReading() throws FileNotFoundException,
			IOException, InvalidCarDataException, ParseException;
}
