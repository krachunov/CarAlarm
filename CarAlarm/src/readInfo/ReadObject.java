package readInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

import myObject.*;

public class ReadObject {

	public Map<String, Car> carReading(String fileName)
			throws FileNotFoundException, IOException, InvalidCarDataException {
		try (BufferedReader br = new BufferedReader(new FileReader(new File(
				fileName)))) {
			String line = br.readLine();
			while (line != null) {

				String regex = ";";
				String[] element = line.split(regex);
				if (element.length > 0) {
					if (element[0] == null || element[0] == "") {
						throw new InvalidCarDataException("Enter the DKN");
					} else {
						String dkn = element[0];
					}
					if (element[1] == null || element[1] == "") {
						throw new InvalidCarDataException("Enter the model");
					} else {
						String model = element[1];
					}
					

					String brand = element[2];
					String chassis = element[3];
					String tonnage = element[4];
					String prodYear = element[5];
					Integer seatsNum = Integer.parseInt(element[6]);
					Integer enginePower = Integer.parseInt(element[7]);
				}

				line = br.readLine();
			}

		}

		return null;

	}
}
