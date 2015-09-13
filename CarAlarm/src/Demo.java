import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.util.Map;

import myObject.MyAgent;
import myObject.MyPerson;
import readInfo.InvalidCarDataException;
import readInfo.Reader;
import programsStuff.*;

public class Demo {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException,
			IOException, InvalidCarDataException, ParseException {

		MyAgent agent0008 = new MyAgent("SCC", 8);

		Reader.cars = Reader.carReading();
		Reader.clients = Reader.clientReading();

		System.out.println(Reader.cars.size());
		System.out.println(Reader.clients.size());

		OfficeProgram testProgram = new OfficeProgram("CU");
		testProgram.addAgent("Perfekt", 8);

	}
}
