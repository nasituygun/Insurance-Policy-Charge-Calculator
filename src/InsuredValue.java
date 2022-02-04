public class InsuredValue {
	private String insuranceNumber;
	private int yearOfInsurance;
		


	public InsuredValue(String insuranceNumber, int yearOfInsurance) {
		// TODO Auto-generated constructor stub
		this.insuranceNumber=insuranceNumber;
		this.yearOfInsurance=yearOfInsurance;
	}









	public String getInsuranceNumber() {
		return insuranceNumber;
	}



	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}



	public int getYearOfInsurance() {
		return yearOfInsurance;
	}



	public void setYearOfInsurance(int yearOfInsurance) {
		this.yearOfInsurance = yearOfInsurance;
	}


	public double calculateRiskFactor() {return 0.0;}
	
















	
}
