package readInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import myObject.*;

public class ReadObject implements ICreateObject {

	public Map<String, Car> carReading(String fileName)
			throws FileNotFoundException, IOException, InvalidCarDataException,
			ParseException {
		Map<String, Car> cars = new TreeMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(new File(
				fileName)))) {
			String line = br.readLine();
			while (line != null) {

				String regex = ";";
				String[] element = line.split(regex, -1);
				String dkn = null;
				String model = null;
				String brand = null;
				String chassis = null;
				String tonnage = null;
				Date dateProd = null;
				Integer seatsNum = null;
				Integer enginePower = null;
				if (element.length > 0) {

					if (element[0] == null || element[0].equals("")) {
						dkn = "none";
					} else {
						dkn = element[0];
					}
					if (element[1] == null || element[1].equals("")) {
						model = "none";
					} else {
						model = element[1];
					}
					if (element[2] == null || element[2].equals("")) {
						brand = "none";
					} else {
						brand = element[2];
					}
					if (element[3] == null || element[3].equals("")) {
						chassis = "none";
					} else {
						chassis = element[3];
					}
					if (element[4] == null || element[4].equals("")) {
						tonnage = "0";
					} else {
						tonnage = element[4];
					}

					if (element[5] == null || element[5].equals("")) {
						DateFormat df = new SimpleDateFormat("YYYY");
						dateProd = df.parse("1970");
					} else {
						DateFormat df = new SimpleDateFormat("YYYY");
						dateProd = df.parse(element[5]);
					}
					if (element[6] == null || element[6].equals("")
							|| element[6].equals(" ")) {
						seatsNum = 0;
					} else {
						seatsNum = Integer.parseInt(element[6]);
					}
					if (element[7] == null || element[7].equals("")) {
						enginePower = 0;
					} else {
						enginePower = Integer.parseInt(element[7]);
					}

				} else {
					System.out.println("Element do not add: " + line);
					continue;
				}
				if (!cars.containsKey(dkn)) {
					cars.put(dkn, new Car(dkn, model, brand, chassis, tonnage,
							dateProd, seatsNum, enginePower));
				}

				line = br.readLine();
			}

		}

		return cars;

	}

	public Map<String, Car> carReading() throws FileNotFoundException,
			IOException, InvalidCarDataException, ParseException {
		return carReading("resource\\car2.txt");

	}

	public Map<Integer, Client> clientReadin(String fileName)
			throws FileNotFoundException, IOException {
		Map<Integer, Client> clients = new TreeMap<Integer, Client>();
		try (BufferedReader br = new BufferedReader(new FileReader(new File(
				fileName)))) {
			String line = br.readLine();
			while (line != null) {
				String regex = ";";
				String[] element = line.split(regex, -1);
				Integer egn = Integer.parseInt(element[0]);
				String firstName = element[1];
				String lastName = element[2];
				String phoneNumber = element[3];
				Car myCar = null;
				if (!clients.containsKey(egn)) {
					clients.put(egn, new Client(egn, firstName, lastName,
							phoneNumber, myCar));
				}

			}
		}
		return clients;

	}

	public Map<Integer, Client> clientReadin() throws FileNotFoundException,
			IOException {
		return clientReadin("resource\\client.txt");

	}
}
