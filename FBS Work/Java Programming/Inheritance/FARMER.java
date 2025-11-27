class Farmer {
    int farmerID;
    String farmerName;
    double landArea;
    String city;
    double annualIncome;
    int numberOfEquipment;
    double insuranceAmount;

    // Default Constructor
    Farmer() {
        this.farmerID = 0;
        this.farmerName = "";
        this.landArea = 0.0;
        this.city = "";
        this.annualIncome = 0.0;
        this.numberOfEquipment = 0;
        this.insuranceAmount = 0.0;
    }

    // Parameterized Constructor
    Farmer(int farmerID, String farmerName, double landArea, String city,
            double annualIncome, int numberOfEquipment, double insuranceAmount) {

        this.farmerID = farmerID;
        this.farmerName = farmerName;
        this.landArea = landArea;
        this.city = city;
        this.annualIncome = annualIncome;
        this.numberOfEquipment = numberOfEquipment;
        this.insuranceAmount = insuranceAmount;
    }

    // Setters
    void setFarmerID(int farmerID) {
        this.farmerID = farmerID;
    }

    void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    void setCity(String city) {
        this.city = city;
    }

    void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    void setNumberOfEquipment(int numberOfEquipment) {
        this.numberOfEquipment = numberOfEquipment;
    }

    void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    // Getters
    int getFarmerID() {
        return farmerID;
    }

    String getFarmerName() {
        return farmerName;
    }

    double getLandArea() {
        return landArea;
    }

    String getCity() {
        return city;
    }

    double getAnnualIncome() {
        return annualIncome;
    }

    int getNumberOfEquipment() {
        return numberOfEquipment;
    }

    double getInsuranceAmount() {
        return insuranceAmount;
    }

    // Display Method
    void display() {
        System.out.println("Farmer ID: " + farmerID);
        System.out.println("Farmer Name: " + farmerName);
        System.out.println("Land Area: " + landArea);
        System.out.println("City: " + city);
        System.out.println("Annual Income: " + annualIncome);
        System.out.println("Number of Equipment: " + numberOfEquipment);
        System.out.println("Insurance Amount: " + insuranceAmount);
    }
}

//  Dairy Farmer

class DairyFarmer extends Farmer {
    int numberOfCattle;
    double milkProducedPerDay;
    int dairyLicenseNumber;

    DairyFarmer() {
        super();
        this.numberOfCattle = 0;
        this.milkProducedPerDay = 0.0;
        this.dairyLicenseNumber = 0;
    }

    DairyFarmer(int farmerID, String farmerName, double landArea, String city,double annualIncome, int numberOfEquipment, double insuranceAmount,int numberOfCattle, double milkProducedPerDay, int dairyLicenseNumber) {

        super(farmerID, farmerName, landArea, city, annualIncome, numberOfEquipment, insuranceAmount);
        this.numberOfCattle = numberOfCattle;
        this.milkProducedPerDay = milkProducedPerDay;
        this.dairyLicenseNumber = dairyLicenseNumber;
    }

    void setNumberOfCattle(int numberOfCattle) {
        this.numberOfCattle = numberOfCattle;
    }

    void setMilkProducedPerDay(double milkProducedPerDay) {
        this.milkProducedPerDay = milkProducedPerDay;
    }

    void setDairyLicenseNumber(int dairyLicenseNumber) {
        this.dairyLicenseNumber = dairyLicenseNumber;
    }

    int getNumberOfCattle() {
        return numberOfCattle;
    }

    double getMilkProducedPerDay() {
        return milkProducedPerDay;
    }

    int getDairyLicenseNumber() {
        return dairyLicenseNumber;
    }

    void display() {
        super.display();
        System.out.println("Number of Cattle: " + numberOfCattle);
        System.out.println("Milk Produced Per Day: " + milkProducedPerDay);
        System.out.println("Dairy License Number: " + dairyLicenseNumber);
    }
}

// Poultry Farmer

class PoultryFarmer extends Farmer {
    int numberOfChickens;
    int numberOfHens;
    int numberOfSheds;
    double eggsProducedPerDay;
    int shedCapacity;
    String poultryFarmName;

    PoultryFarmer() {
        super();
        this.numberOfChickens = 0;
        this.numberOfHens = 0;
        this.numberOfSheds = 0;
        this.eggsProducedPerDay = 0.0;
        this.shedCapacity = 0;
        this.poultryFarmName = "";
    }

    PoultryFarmer(int farmerID, String farmerName, double landArea, String city,
            double annualIncome, int numberOfEquipment, double insuranceAmount,
            int numberOfChickens, int numberOfHens, int numberOfSheds,
            double eggsProducedPerDay, int shedCapacity, String poultryFarmName) {

        super(farmerID, farmerName, landArea, city, annualIncome, numberOfEquipment, insuranceAmount);
        this.numberOfChickens = numberOfChickens;
        this.numberOfHens = numberOfHens;
        this.numberOfSheds = numberOfSheds;
        this.eggsProducedPerDay = eggsProducedPerDay;
        this.shedCapacity = shedCapacity;
        this.poultryFarmName = poultryFarmName;
    }

    void setNumberOfChickens(int numberOfChickens) {
        this.numberOfChickens = numberOfChickens;
    }

    void setNumberOfHens(int numberOfHens) {
        this.numberOfHens = numberOfHens;
    }

    void setNumberOfSheds(int numberOfSheds) {
        this.numberOfSheds = numberOfSheds;
    }

    void setEggsProducedPerDay(double eggsProducedPerDay) {
        this.eggsProducedPerDay = eggsProducedPerDay;
    }

    void setShedCapacity(int shedCapacity) {
        this.shedCapacity = shedCapacity;
    }

    void setPoultryFarmName(String poultryFarmName) {
        this.poultryFarmName = poultryFarmName;
    }

    int getNumberOfChickens() {
        return numberOfChickens;
    }

    int getNumberOfHens() {
        return numberOfHens;
    }

    int getNumberOfSheds() {
        return numberOfSheds;
    }

    double getEggsProducedPerDay() {
        return eggsProducedPerDay;
    }

    int getShedCapacity() {
        return shedCapacity;
    }

    String getPoultryFarmName() {
        return poultryFarmName;
    }

    void display() {
        super.display();
        System.out.println("Number of Chickens: " + numberOfChickens);
        System.out.println("Number of Hens: " + numberOfHens);
        System.out.println("Number of Sheds: " + numberOfSheds);
        System.out.println("Eggs Produced Per Day: " + eggsProducedPerDay);
        System.out.println("Shed Capacity: " + shedCapacity);
        System.out.println("Poultry Farm Name: " + poultryFarmName);
    }
}


// Organic Farmer

class OrganicFarmer extends Farmer {
    int organicCertID;
    String cropType;
    String fertilizerUsed;

    OrganicFarmer() {
        super();
        this.organicCertID = 0;
        this.cropType = "";
        this.fertilizerUsed = "";
    }

    OrganicFarmer(int farmerID, String farmerName, double landArea, String city,double annualIncome, int numberOfEquipment, double insuranceAmount,int organicCertID, String cropType, String fertilizerUsed) {

        super(farmerID, farmerName, landArea, city, annualIncome, numberOfEquipment, insuranceAmount);
        this.organicCertID = organicCertID;
        this.cropType = cropType;
        this.fertilizerUsed = fertilizerUsed;
    }

    void setOrganicCertID(int organicCertID) {
        this.organicCertID = organicCertID;
    }

    void setCropType(String cropType) {
        this.cropType = cropType;
    }

    void setFertilizerUsed(String fertilizerUsed) {
        this.fertilizerUsed = fertilizerUsed;
    }

    int getOrganicCertID() {
        return organicCertID;
    }

    String getCropType() {
        return cropType;
    }

    String getFertilizerUsed() {
        return fertilizerUsed;
    }

    void display() {
        super.display();
        System.out.println("Organic Cert ID: " + organicCertID);
        System.out.println("Crop Type: " + cropType);
        System.out.println("Fertilizer Used: " + fertilizerUsed);
    }
}


// Test Class

class TestFarmer {
    public static void main(String[] args) {
        DairyFarmer d = new DairyFarmer();
        Farmer f1 = new Farmer();
        OrganicFarmer o1 = new OrganicFarmer(101,"Onkar Shahagadkar",15,"Barshi",599999,5,23000,555,"wheat","compost");
        d.display();
        f1.display();
        o1.display();

    }
}
