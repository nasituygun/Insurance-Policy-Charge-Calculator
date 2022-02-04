public class Person extends InsuredValue {
	
	private String residenceCity,name,gender,typeOfChronicleIllness,nationalId;
	private int yearOfBirth;
	private int thisYear,age;
	public Person(String insuranceNumber, int yearOfInsurance, String residenceCity, String name, String gender,
			String typeOfChronicleIllness, String nationalId, int yearOfBirth) {
		super(insuranceNumber, yearOfInsurance);
		this.residenceCity = residenceCity;
		this.name = name;
		this.gender = gender;
		this.typeOfChronicleIllness = typeOfChronicleIllness;
		this.nationalId = nationalId;
		this.yearOfBirth = yearOfBirth;
		thisYear=2020;
		age=(thisYear-yearOfBirth);
		
	}
	public void setResidenceCity(String residenceCity) {
		this.residenceCity = residenceCity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setTypeOfChronicleIllness(String typeOfChronicleIllness) {
		this.typeOfChronicleIllness = typeOfChronicleIllness;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getResidenceCity() {
		return residenceCity;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getTypeOfChronicleIllness() {
		return typeOfChronicleIllness;
	}
	public String getNationalId() {
		return nationalId;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	@Override
	public double calculateRiskFactor() {
		double riskFactor;
		
		riskFactor=((age*age)/(getChronicleIllnessValue()*18));
		return riskFactor;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getChronicleIllnessValue() {
		double chronicleIllnessValue;
		if (typeOfChronicleIllness.equals("cardiovascular")) { 
			chronicleIllnessValue=1.85;}
		else if (typeOfChronicleIllness.equals("diabetes")) {
			chronicleIllnessValue=1.84;}
		else if (typeOfChronicleIllness.equals("respiratory")) {
			chronicleIllnessValue=1.86;}
		else if (typeOfChronicleIllness.equals("none")) {
			chronicleIllnessValue=0.1;}
		else {
			chronicleIllnessValue=1.8;}
		return chronicleIllnessValue;
			
	}
	
		
		
		

		
	}


