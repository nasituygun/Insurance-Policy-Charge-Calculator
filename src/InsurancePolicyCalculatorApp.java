import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class InsurancePolicyCalculatorApp {
	
	PolicyRecord policyRecord;
	
	public InsurancePolicyCalculatorApp() throws IOException{
		policyRecord=new PolicyRecord();
		}
	
	
	public void printAllInsuredValues() {
		printWorkplaces();
		printHousing();
		printTruck();
		printAutomobile();
		printPerson();
	}
	
	public void printWorkplaces() {
		ArrayList<InsuredValue> workplaces=policyRecord.getWorkplaceList();
		Insurance household=new Household();
		for (InsuredValue i: workplaces) {
			System.out.println("Insured Value: workplaces\nInsurance Number:"+ i.getInsuranceNumber()+"\nYear Of Insurance:"+i.getYearOfInsurance()+"\nThe Policy charge of "+i.getInsuranceNumber()+": "+BigDecimal.valueOf(household.calculatePolicyCharge(i))+"TL\n");
		}
	}
	
	public void printHousing() {
		ArrayList<InsuredValue> housing=policyRecord.getHousingList();
		Insurance household=new Household();
		for (InsuredValue i: housing) {
			System.out.println("Insured Value: housing\nInsurance Number:"+ i.getInsuranceNumber()+"\nYear Of Insurance:"+i.getYearOfInsurance()+"\nThe Policy charge of "+i.getInsuranceNumber()+": "+BigDecimal.valueOf(household.calculatePolicyCharge(i))+"TL\n");
		}
	}
	
	public void printTruck() {
		ArrayList<InsuredValue> truck=policyRecord.getTruckList();
		Insurance traffic=new Traffic();
		for (InsuredValue i: truck) {
			System.out.println("Insured Value: Truck\nInsurance Number:"+ i.getInsuranceNumber()+"\nYear Of Insurance:"+i.getYearOfInsurance()+"\nThe Policy charge of "+i.getInsuranceNumber()+": "+BigDecimal.valueOf(traffic.calculatePolicyCharge(i))+"TL\n");
		}
	}
	
	public void printAutomobile() {
		ArrayList<InsuredValue> automobile=policyRecord.getAutomobileList();
		Insurance traffic=new Traffic();
		for (InsuredValue i: automobile) {
			System.out.println("Insured Value: automobile \nInsurance Number:"+ i.getInsuranceNumber()+"\nYear Of Insurance:"+i.getYearOfInsurance()+"\nThe Policy charge of "+i.getInsuranceNumber()+": "+BigDecimal.valueOf(traffic.calculatePolicyCharge(i))+"TL\n");
		}
	}
	
	public void printPerson() {
		ArrayList<InsuredValue> person=policyRecord.getPersonList();
		Insurance health=new Health();
		for (InsuredValue i: person) {
			if (health.calculatePolicyCharge(i)==1000000000) {
				System.out.println("Insured Value: Person \nInsurance Number:"+ i.getInsuranceNumber()+"\nYear Of Insurance:"+i.getYearOfInsurance()+"\nThe Policy insurance application is denied.");
			}
			else {
			System.out.println("Insured Value: Person \nInsurance Number:"+ i.getInsuranceNumber()+"\nYear Of Insurance:"+i.getYearOfInsurance()+"\nThe Policy charge of "+i.getInsuranceNumber()+": "+BigDecimal.valueOf(health.calculatePolicyCharge(i))+"TL\n");
		}}
	}

}
