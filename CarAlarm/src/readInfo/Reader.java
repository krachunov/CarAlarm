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
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

import myObject.*;

public class Reader {
	public static HashSet<MyCar> cars;
	public static HashSet<MyPerson> clients;

	private static String clientFile = "resource\\client2.txt";
	private static String carFile = "resource\\car2.txt";

	public static HashSet<MyCar> carReading(String fileName)
			throws FileNotFoundException, IOException, InvalidCarDataException,
			ParseException {
		HashSet<MyCar> cars = new HashSet();
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
				Double tonnage = null;
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
						tonnage = 0.0;
					} else {
						tonnage = Double.parseDouble(element[4]);
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
				MyCar newCar = new MyCar(dkn, model, brand, chassis, tonnage,
						dateProd, seatsNum, enginePower);
				if (!cars.contains(newCar)) {
					cars.add(newCar);
				}

				line = br.readLine();
			}

		}

		return cars;

	}

	public static HashSet<MyCar> carReading() throws FileNotFoundException,
			IOException, InvalidCarDataException, ParseException {
		return carReading(carFile);

	}

	public static HashSet<MyPerson> clientReading(String fileName)
			throws FileNotFoundException, IOException {
		HashSet<MyPerson> clients = new HashSet<MyPerson>();
		try (BufferedReader br = new BufferedReader(new FileReader(new File(
				fileName)))) {
			String line = br.readLine();
			Long egn = null;

			String firstName;
			String lastName;
			String phoneNumber;
			String regex = ";";

			while (line != null) {
				String[] element = line.split(regex, -1);

				if (element.length >= 5) {
					if (element[0].length() == 10) {
						if (element[0].matches(("\\d*"))) {
							egn = Long.parseLong(element[0]);
						} else {
							line = br.readLine();
							continue;
						}
					} else {
						line = br.readLine();
						continue;
					}
					firstName = element[1];
					lastName = element[2];
					phoneNumber = element[3];

					MyPerson newClient = new MyPerson(egn, firstName, lastName,
							phoneNumber);

					clients.add(newClient);
				} else {
					line = br.readLine();
					continue;
				}

				line = br.readLine();
			}
		}
		return clients;

	}

	/**
	 * 
	 * @return HashSet with person. Every person who is duplicate is save last
	 *         record
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InvalidCarDataException
	 * @throws ParseException
	 */
	public static HashSet<MyPerson> clientReading()
			throws FileNotFoundException, IOException {
		return clientReading(clientFile);

	}

	public static HashSet<MyCar> getCars() {
		return cars;
	}

	public void setCars(HashSet<MyCar> cars) {
		this.cars = cars;
	}

	public static HashSet<MyPerson> getClients() {
		return clients;
	}

	public void setClients(HashSet<MyPerson> clients) {
		this.clients = clients;
	}

}
