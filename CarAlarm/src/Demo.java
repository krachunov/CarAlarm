import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.util.Map;

import myObject.MyPerson;
import readInfo.InvalidCarDataException;
import readInfo.ReadObject;
import programsStuff.*;

public class Demo {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException,
			IOException, InvalidCarDataException, ParseException {

		ReadObject reader = new ReadObject();
		reader.setCars(reader.carReading());
		reader.setClients(reader.clientReading());

		Agent agent0008 = new Agent("SCC", 8);

//		System.out.println(agent0008.getClients().size());

//		System.out.println(agent0008.getCars().size());

	}
}
