public class Traffic extends Insurance {

	double fixedFee;
	double max;
	double min;
	
	

	public Traffic() {
		max=3000;
		min=1000;
		fixedFee = Math.random() * (max - min + 1) + min; 
	}



	@Override
	double calculatePolicyCharge(InsuredValue insuredValue) {
		double policyCharge;
		policyCharge=(fixedFee*0.9)+(fixedFee*Math.pow(insuredValue.calculateRiskFactor(),0.5));
		if (2020-insuredValue.getYearOfInsurance()>1) {
			policyCharge=policyCharge*0.8;
		}
		return policyCharge;
	}
	
	
}
