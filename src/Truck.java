
public class Truck extends Vehicle {
	private String typeOfTruckBed;

	public Truck(String insuranceNumber, int yearOfInsurance, String plateCity, double engineVolume,
			int yearOfProduction, String typeOfGear, double fuelTankVolume, String typeOfTruckBed) {
		super(insuranceNumber, yearOfInsurance, plateCity, engineVolume, yearOfProduction, typeOfGear, fuelTankVolume);
		// TODO Auto-generated constructor stub
		this.typeOfTruckBed=typeOfTruckBed;
		
	}

	public String getTypeOfTruckBed() {
		return typeOfTruckBed;
	}

	public void setTypeOfTruckBed(String typeOfTruckBed) {
		this.typeOfTruckBed = typeOfTruckBed;
	}

	@Override
	public double calculateRiskFactor() {
		double riskFactor;
		riskFactor=((Math.pow(getAge(), 3)/(0.008*getFuelTankVolume()))*getEngineVolume()*(getPlateCityValue()*0.03))/Math.pow(getTypeOfTruckBedValue(),2);
		return riskFactor;
	}
	
	public double getTypeOfTruckBedValue() {
		double typeOfTruckBedValue;
		if (typeOfTruckBed.equals("Trailer")) { 
			typeOfTruckBedValue=0.87;}
		else if (typeOfTruckBed.equals("Tanker")) {
			typeOfTruckBedValue=0.84;}
		else {
			typeOfTruckBedValue=0.15;}
		return typeOfTruckBedValue;
	}

}
