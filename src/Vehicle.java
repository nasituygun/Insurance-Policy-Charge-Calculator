public class Vehicle extends InsuredValue {
	private String plateCity;
	private double engineVolume;
	private int yearOfProduction,age,thisYear;
	private String typeOfGear;
	private double fuelTankVolume;

	

	public Vehicle(String insuranceNumber, int yearOfInsurance, String plateCity, double engineVolume, int yearOfProduction, String typeOfGear, double fuelTankVolume) {
		super(insuranceNumber, yearOfInsurance);
		this.plateCity=plateCity;
		this.engineVolume=engineVolume;
		this.yearOfProduction=yearOfProduction;
		this.typeOfGear=typeOfGear;
		this.fuelTankVolume=fuelTankVolume;
		thisYear=2020;
		setAge((thisYear-yearOfProduction));
		
		
		
		// TODO Auto-generated constructor stub
	}

	public String getPlateCity() {
		return plateCity;
	}

	public void setPlateCity(String plateCity) {
		this.plateCity = plateCity;
	}

	public double getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public String getTypeOfGear() {
		return typeOfGear;
	}

	public void setTypeOfGear(String typeOfGear) {
		this.typeOfGear = typeOfGear;
	}

	public double getFuelTankVolume() {
		return fuelTankVolume;
	}

	public void setFuelTankVolume(double fuelTankVolume) {
		this.fuelTankVolume = fuelTankVolume;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public double calculateRiskFactor() {
		return 0.0;
	}
	
	public double getPlateCityValue() {

		double plateCityValue;
		if (plateCity.equals("Izmir")) { 
			plateCityValue=0.78;}
		else if (plateCity.equals("Istanbul")) {
			plateCityValue=0.97;}
		else if (plateCity.equals("Ankara")) {
			plateCityValue=0.85;}
		else {
			plateCityValue=0.65;}
		return plateCityValue;
		
		
	}

	
	
}

	
