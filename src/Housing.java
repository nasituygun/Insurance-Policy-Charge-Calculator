public class Housing extends Premises {
	private String residentSituation;

	

	public Housing(String insuranceNumber, int yearOfInsurance, String premisesCity, String typeOfConstruction,
			int numberOfFloor, int yearOfConstruction, int surfaceArea, String residentSituation) {
		super(insuranceNumber, yearOfInsurance, premisesCity, typeOfConstruction, numberOfFloor, yearOfConstruction,
				surfaceArea);
		this.residentSituation = residentSituation;
	}
	
	public String getResidentSituation() {
		return residentSituation;
	}

	public void setResidentSituation(String residentSituation) {
		this.residentSituation = residentSituation;
	}

	@Override
	public double calculateRiskFactor() {
		double riskFactor;
		riskFactor=(getPremisesCityValue()*getNumberOfFloorsValue()*getYearOfConstructionValue()*getTypeOfConstructionValue()*getSurfaceArea())/getResidentSituationValue();
		return riskFactor;
	}
	
	public double getResidentSituationValue() {
		double residentSituationValue=0.0;
		if (residentSituation.equals("tenant")) { 
			residentSituationValue=0.18;}
		else if (residentSituation.equals("landlord")) {
			residentSituationValue=0.42;}
		return residentSituationValue;
		
	}

}
