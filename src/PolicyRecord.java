import java.io.IOException;
import java.util.ArrayList;

public class PolicyRecord {
	
	ArrayList<InsuredValue> insuredValueList;
	
	public PolicyRecord() throws IOException {
		FileIO fileIO=new FileIO();
		insuredValueList=new ArrayList<InsuredValue>();
		insuredValueList=fileIO.readFile();
		}
	
	public ArrayList<InsuredValue> getWorkplaceList() {
		ArrayList<InsuredValue> workPlaceList=new ArrayList<InsuredValue>();;
		for (InsuredValue i: insuredValueList) {
			if (i instanceof Workplace) {
				workPlaceList.add(i);			}
		}
		return workPlaceList;
	}
	
	public ArrayList<InsuredValue> getHousingList() {
		ArrayList<InsuredValue> housingList=new ArrayList<InsuredValue>();;
		for (InsuredValue i: insuredValueList) {
			if (i instanceof Housing) {
				housingList.add(i);
			}
		}
		return housingList;
	}
	
	public ArrayList<InsuredValue> getPersonList() {
		ArrayList<InsuredValue> personList=new ArrayList<InsuredValue>();;
		for (InsuredValue i: insuredValueList) {
			if (i instanceof Person) {
				personList.add(i);
			}
		}
		return personList;
	}
	
	public ArrayList<InsuredValue> getAutomobileList() {
		ArrayList<InsuredValue> automobileList=new ArrayList<InsuredValue>();;
		for (InsuredValue i: insuredValueList) {
			if (i instanceof Automobile) {
				automobileList.add(i);
			}
		}
		return automobileList;
	}
	
	public ArrayList<InsuredValue> getTruckList() {
		ArrayList<InsuredValue> truckList=new ArrayList<InsuredValue>();;
		for (InsuredValue i: insuredValueList) {
			if (i instanceof Truck) {
				truckList.add(i);
			}
		}
		return truckList;
	}
	

}
