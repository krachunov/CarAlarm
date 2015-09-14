import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

import myObject.MyAgent;
import myObject.MyPerson;
import readInfo.InvalidCarDataException;
import readInfo.Reader;
import programsStuff.*;

public class Demo {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException,
			IOException, InvalidCarDataException, ParseException, DuplicateName {

		OfficeProgram testProgram = new OfficeProgram("CU");
		testProgram.addAgent("Perfekt", 8);
		testProgram.addAgent("plovdiv", 9);
		MyAgent agentPerfect = testProgram.getAgents().get(8);
		MyAgent agentPerfect2 = testProgram.getAgents().get(9);

		agentPerfect.crateNewCar("Ca80785TX", "307", "peugeot", "sdf789", 1.2d,
				"01/01/2005", 5, 90);
		agentPerfect.cratenewClient(951147125L, "hristo", "krachunov",
				"0899996347");
		agentPerfect.createPolicy(8511147125l, "Ca8078TX", 2216612145145l,
				"14/09/2015", "14/09/2015");

		agentPerfect2.crateNewCar("Ca8078TX", "307", "peugeot", "sdf789", 1.2d,
				"01/01/2005", 5, 90);
		agentPerfect2.cratenewClient(8511147125L, "hristo", "krachunov",
				"0899996347");
		agentPerfect2.createPolicy(8511147125l, "Ca8078TX", 22112145145l,
				"14/09/2015", "14/09/2015");

		System.out.println(OfficeProgram.getPeople().size());
		System.out.println(OfficeProgram.getCars().size());
		System.out.println(OfficeProgram.getPolicies().size());
		System.out.println("Agent1 " + agentPerfect.getPolicy().size());
		System.out.println("Agent2 " + agentPerfect2.getPolicy().size());
	}
}
