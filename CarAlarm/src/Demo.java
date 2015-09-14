import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

//		Reader.cars = Reader.carReading();
		Reader.clients = Reader.clientReading();

//		System.out.println(Reader.cars.size());
		System.out.println(Reader.clients.size());

		OfficeProgram testProgram = new OfficeProgram("CU");
		testProgram.addAgent("Perfekt", 8);
		
		MyAgent agentPerfect = testProgram.getAgents().get(8);
	
		
		agentPerfect.crateNewCar("Ca8078TX", "307", "peugeot", "sdf789", 1.2d, "01/01/2005", 5, 90);
		agentPerfect.cratenewClient(8511147125L, "hristo", "krachunov", "0899996347");
		agentPerfect.createPolicy(8511147125l, "Ca8078TX", 22112145145l, "14/09/2015", "14/09/2015");
		System.out.println(OfficeProgram.getPeople().size());
		System.out.println(OfficeProgram.getCars().size());
		System.out.println(OfficeProgram.getPolicies().size());

	}
}
