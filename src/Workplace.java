public class Workplace extends Premises {
	
	private int annualRevenue;

	public Workplace(String insuranceNumber, int yearOfInsurance, String premisesCity, String typeOfConstruction,
			int numberOfFloor, int yearOfConstruction, int surfaceArea, int annualRevenue) {
		super(insuranceNumber, yearOfInsurance, premisesCity, typeOfConstruction, numberOfFloor, yearOfConstruction,
				surfaceArea);
		this.setAnnualRevenue(annualRevenue);
	}

	public int getAnnualRevenue() {
		return annualRevenue;
	}

	public void setAnnualRevenue(int annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

	@Override
	public double calculateRiskFactor() {
		double riskFactor;
		riskFactor=getPremisesCityValue()*getNumberOfFloorsValue()*getYearOfConstructionValue()*getTypeOfConstructionValue()*(getSurfaceArea()*0.2)*(annualRevenue*0.003);
		return riskFactor;
		
	}
	

}
