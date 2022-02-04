public class Premises extends InsuredValue {
	
	private String premisesCity,typeOfConstruction;
	private int numberOfFloor,yearOfConstruction,surfaceArea;
	


	public Premises(String insuranceNumber, int yearOfInsurance, String premisesCity, String typeOfConstruction,
			int numberOfFloor, int yearOfConstruction, int surfaceArea) {
		super(insuranceNumber, yearOfInsurance);
		this.premisesCity = premisesCity;
		this.typeOfConstruction = typeOfConstruction;
		this.numberOfFloor = numberOfFloor;
		this.yearOfConstruction = yearOfConstruction;
		this.surfaceArea = surfaceArea;
		
	}


	public String getTypeOfConstruction() {
		return typeOfConstruction;
	}


	public void setTypeOfConstruction(String typeOfConstruction) {
		this.typeOfConstruction = typeOfConstruction;
	}


	public String getPremisesCity() {
		return premisesCity;
	}


	public void setPremisesCity(String premisesCity) {
		this.premisesCity = premisesCity;
	}


	public int getNumberOfFloor() {
		return numberOfFloor;
	}


	public void setNumberOfFloor(int numberOfFloor) {
		this.numberOfFloor = numberOfFloor;
	}


	public int getYearOfConstruction() {
		return yearOfConstruction;
	}


	public void setYearOfConstruction(int yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}


	public int getSurfaceArea() {
		return surfaceArea;
	}


	public void setSurfaceArea(int surfaceArea) {
		this.surfaceArea = surfaceArea;
	}


	@Override
	public double calculateRiskFactor() {
		return 0.0;
	}



	public double getPremisesCityValue() {

		double premisesCityValue;
		if (premisesCity.equals("Izmir")) { 
			premisesCityValue=0.4;}
		else if (premisesCity.equals("Istanbul")) {
			premisesCityValue=0.6;}
		else if (premisesCity.equals("Ankara")) {
			premisesCityValue=0.15;}
		else {
			premisesCityValue=0.25;}
		return premisesCityValue;
		
		
	}
	
	public double getNumberOfFloorsValue() {
		double numberOfFloorsValue;
		if (numberOfFloor<=3) { 
			numberOfFloorsValue=0.1;}
		else if (numberOfFloor<=7) { 
			numberOfFloorsValue=0.25;}
		else if (numberOfFloor<=18) { 
			numberOfFloorsValue=0.5;}
		else {
			numberOfFloorsValue=0.85;}
		return numberOfFloorsValue;
		
	}

	public double getYearOfConstructionValue() {
		double yearOfConstructionValue;
		if (yearOfConstruction<1975) { 
			yearOfConstructionValue=0.58;
			}
		else if (yearOfConstruction<1999) { 
			yearOfConstructionValue=0.32;
			}
		else {
			yearOfConstructionValue=0.1;}
		return yearOfConstructionValue;
		
	}

	public double getTypeOfConstructionValue() {
		double typeOfConstructionValue;
		if (typeOfConstruction.equals("steel")) { 
			typeOfConstructionValue=0.1;}
		else if (typeOfConstruction.equals("concrete")) {
			typeOfConstructionValue=0.37;}
		else if (typeOfConstruction.equals("wood")) {
			typeOfConstructionValue=0.58;}
		else {
			typeOfConstructionValue=0.92;}
		return typeOfConstructionValue;
		
	}

	
}