
public class Health extends Insurance {
	
	double fixedFee;
	double max;
	double min;
	
	
	

	public Health() {
		max=3000;
		min=1000;
		fixedFee = Math.random() * (max - min + 1) + min; 
		
	}



	public double calculatePolicyCharge(InsuredValue insuredValue) {
		double policyCharge;
		if ((insuredValue.calculateRiskFactor()>50 ) && (2020-insuredValue.getYearOfInsurance())<3) {
			policyCharge=1000000000;
		}
		else {
			policyCharge=(fixedFee*(Math.pow(insuredValue.calculateRiskFactor(),3))/208);
			if (2020-insuredValue.getYearOfInsurance()>2) {
			policyCharge=policyCharge*0.9;
			}
		}
		return policyCharge;
	}

}
