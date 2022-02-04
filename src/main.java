// nasit uygun 240201012


import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		InsurancePolicyCalculatorApp app=new InsurancePolicyCalculatorApp();
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1 All insured values, 2 Workplaces, 3 Housings, 4 Persons, 5 Automobiles, 6 Trucks.\r\n" + 
				"Please enter your choice: ");
		String input =sc.nextLine(); 
		if (input.equals("1")) {
			app.printAllInsuredValues();
			}
		else if (input.equals("2")) {
			app.printWorkplaces();
		}
		else if (input.equals("3")) {
			app.printHousing();
		}
		else if (input.equals("4")) {
			app.printPerson();
		}
		else if (input.equals("5")) {
			app.printAutomobile();
		}
		else if (input.equals("6")) {
			app.printTruck();
		}
		else {
			System.out.println("invalid input");
		}
	}

}
