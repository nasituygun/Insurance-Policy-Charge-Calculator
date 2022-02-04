

public class Household extends Insurance {
	
	double policyCharge,fixedFee;
	double max;
	double min;
	
	

	public Household() {
		max=3000;
		min=1000;
		fixedFee = Math.random() * (max - min + 1) + min; 
	}



	public double calculatePolicyCharge(InsuredValue insuredValue) {
		double policyCharge;
		policyCharge=fixedFee* (Math.pow(insuredValue.calculateRiskFactor(),2));
		if (2020-insuredValue.getYearOfInsurance()>2) {
			policyCharge=policyCharge*0.9;
		}
		policyCharge=(Math.round(policyCharge));
		return policyCharge;
	}

}
