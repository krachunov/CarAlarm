package myObject;

import java.util.Date;

public class Car {
	private String dkn;
	private String model;
	private String brand;
	private String chassis;
	private String tonnage;
	private Date prodYear;
	private Integer seatsNum;
	private Integer enginePower;

	public Car(String dkn, String model, String brand, String chassis,
			String tonnage, Date prodYear, Integer seatsNum,
			Integer enginePower) {
		setDkn(dkn);
		setModel(model);
		setBrand(brand);
		setChassis(chassis);
		setTonnage(tonnage);
		setProdYear(prodYear);
		setSeatsNum(seatsNum);

	}

	public String getDkn() {
		return dkn;
	}

	public void setDkn(String dkn) {
		this.dkn = dkn;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public String getTonnage() {
		return tonnage;
	}

	public void setTonnage(String tonnage) {
		this.tonnage = tonnage;
	}

	public Date getProdYear() {
		return prodYear;
	}

	public void setProdYear(Date prodYear) {
		this.prodYear = prodYear;
	}

	public Integer getSeatsNum() {
		return seatsNum;
	}

	public void setSeatsNum(Integer seatsNum) {
		this.seatsNum = seatsNum;
	}

	public Integer getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(Integer enginePower) {
		this.enginePower = enginePower;
	}

}
