package readInfo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

import myObject.Car;

public class Test {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, InvalidCarDataException, ParseException {
		ReadObject ro = new ReadObject();
		Map<String, Car> c = ro.carReading("resource\\car2.txt");
		System.out.println(c.size());

	}

}
