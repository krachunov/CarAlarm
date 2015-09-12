package readInfo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Map;

import myObject.Car;
import myObject.Person;

public interface ICreateObject {
	public HashSet<Person> clientReading() throws FileNotFoundException,
			IOException;

	public HashSet<Car> carReading() throws FileNotFoundException, IOException,
			InvalidCarDataException, ParseException;
}
