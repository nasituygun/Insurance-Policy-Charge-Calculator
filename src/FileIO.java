import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileIO {
	
	ArrayList<InsuredValue> aList;
	
	public FileIO() {
		aList=new ArrayList<InsuredValue>();
	}
	public ArrayList<InsuredValue> readFile() throws IOException{
		String line;
		BufferedReader br = new BufferedReader(new FileReader("HW2_InsuredValues.csv"));
		while ((line=br.readLine()) != null) {
			String[] data=line.toString().split(",");
			if (data[0].substring(0,1).equals("A")) {
				String insuranceNumber,plateCity,typeOfGear,typeOfRoof;
				int yearOfInsurance,yearOfProduction;
				double engineVolume,fuelTankVolume;
				insuranceNumber=data[0];
				yearOfInsurance=Integer.parseInt(data[1]);
				plateCity=data[2];
				engineVolume=Double.parseDouble(data[3]);
				yearOfProduction=Integer.parseInt(data[4]);
				typeOfGear=data[5];
				fuelTankVolume=engineVolume=Double.parseDouble(data[6]);
				typeOfRoof=data[7];
				aList.add(new Automobile(insuranceNumber,yearOfInsurance,plateCity,engineVolume,yearOfProduction,typeOfGear,fuelTankVolume,typeOfRoof));
				
			} 
			else if ((data[0].substring(0,1).equals("W"))){
				String insuranceNumber,premisesCity,typeOfconstruction;
				int numberOfFloor,yearOfConstruction,annualRevenue,yearOfInsurance,surfaceArea;
				insuranceNumber=data[0];
				yearOfInsurance=Integer.parseInt(data[1]);
				premisesCity=data[2];
				numberOfFloor=Integer.parseInt(data[3]);
				yearOfConstruction=Integer.parseInt(data[4]);
				typeOfconstruction=data[5];
				surfaceArea=Integer.parseInt(data[6]);
				annualRevenue=Integer.parseInt(data[7]);
				aList.add(new Workplace(insuranceNumber,yearOfInsurance,premisesCity,typeOfconstruction,numberOfFloor,yearOfConstruction,surfaceArea,annualRevenue));
				
				
			}
			else if ((data[0].substring(0,1).equals("H"))){
				String insuranceNumber,premisesCity,typeOfconstruction,residentSituation;
				int numberOfFloor,yearOfConstruction,yearOfInsurance,surfaceArea;
				insuranceNumber=data[0];
				yearOfInsurance=Integer.parseInt(data[1]);
				premisesCity=data[2];
				numberOfFloor=Integer.parseInt(data[3]);
				yearOfConstruction=Integer.parseInt(data[4]);
				typeOfconstruction=data[5];
				surfaceArea=Integer.parseInt(data[6]);
				residentSituation=(data[7]);
				aList.add(new Housing(insuranceNumber,yearOfInsurance,premisesCity,typeOfconstruction,numberOfFloor,yearOfConstruction,surfaceArea,residentSituation));
				
				
			}
			else if (data[0].substring(0,1).equals("T")) {
				String insuranceNumber,plateCity,typeOfGear,typeOfTruckBed;
				int yearOfInsurance,yearOfProduction;
				double engineVolume,fuelTankVolume;
				insuranceNumber=data[0];
				yearOfInsurance=Integer.parseInt(data[1]);
				plateCity=data[2];
				engineVolume=Double.parseDouble(data[3]);
				yearOfProduction=Integer.parseInt(data[4]);
				typeOfGear=data[5];
				fuelTankVolume=engineVolume=Double.parseDouble(data[6]);
				typeOfTruckBed=data[7];
				aList.add(new Truck(insuranceNumber,yearOfInsurance,plateCity,engineVolume,yearOfProduction,typeOfGear,fuelTankVolume,typeOfTruckBed));
				
			} 
			else if (data[0].substring(0,1).equals("P")) {
				String insuranceNumber,residenceCity,name,gender,typeOfChronicleIllness,nationalId;
				int yearOfInsurance,yearOfBirth;
				insuranceNumber=data[0];
				yearOfInsurance=Integer.parseInt(data[1]);
				residenceCity=data[2];
				name=(data[3]);
				nationalId=(data[4]);
				gender=data[5];
				yearOfBirth=Integer.parseInt(data[6]);
				typeOfChronicleIllness=data[7];
				aList.add(new Person(insuranceNumber,yearOfInsurance,residenceCity,name,gender,typeOfChronicleIllness,nationalId,yearOfBirth));
				
			} 
			
			
		}
		return aList;
		
		
	}
	
		
	}

