package readInfo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Map;

import myObject.MyCar;
import myObject.MyPerson;

public interface ICreateObject {
	public HashSet<MyPerson> clientReading() throws FileNotFoundException,
			IOException;

	public HashSet<MyCar> carReading() throws FileNotFoundException, IOException,
			InvalidCarDataException, ParseException;
}
