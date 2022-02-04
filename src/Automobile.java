
public class Automobile extends Vehicle {
	private String typeOfRoof;

	public Automobile(String insuranceNumber, int yearOfInsurance, String plateCity, double engineVolume,
			int yearOfProduction, String typeOfGear, double fuelTankVolume, String typeOfRoof) {
		super(insuranceNumber, yearOfInsurance, plateCity, engineVolume, yearOfProduction, typeOfGear, fuelTankVolume);
		// TODO Auto-generated constructor stub
		this.typeOfRoof=typeOfRoof;
	}

	public String getTypeOfRoof() {
		return typeOfRoof;
	}

	public void setTypeOfRoof(String typeOfRoof) {
		this.typeOfRoof = typeOfRoof;
	}

	@Override
	public double calculateRiskFactor() {
		double riskFactor;
		riskFactor=getEngineVolume()*(0.004*getFuelTankVolume()*getAge()*(getPlateCityValue()*0.03)/(getTypeOfRoofValue()));
		return riskFactor;
	}
	
	public double getTypeOfRoofValue() {
		double typeOfRoofValue;
		if (typeOfRoof.equals("Regular")) { 
			typeOfRoofValue=0.1;}
		else if (typeOfRoof.equals("Sunroof")) {
			typeOfRoofValue=0.64;}
		else {
			typeOfRoofValue=0.48;}
		return typeOfRoofValue;
	}
	

}
