// Agriculture Class
class Agriculture {
    String farmName;
    String location;
    double totalArea; 
    int numberOfWorkers;
    double annualBudget;
    int numberOfMachinery;
    String cropType;
    int numberOfFields;
    int numberOfIrrigationSystems;
    double soilQualityIndex;
    String country;

// Agriculture Default Constructor
    Agriculture() {
        this.farmName = "Not Given";
        this.location = "Not Given";
        this.totalArea = 0.0;
        this.numberOfWorkers = 0;
        this.annualBudget = 0.0;
        this.numberOfMachinery = 0;
        this.cropType = "Not Given";
        this.numberOfFields = 0;
        this.numberOfIrrigationSystems = 0;
        this.soilQualityIndex = 0.0;
        this.country = "Not Given";
    }

//Agriculture Parameterized Constructor
    Agriculture(String farmName, String location, double totalArea, int numberOfWorkers,
            double annualBudget, int numberOfMachinery, String cropType, int numberOfFields,
            int numberOfIrrigationSystems, double soilQualityIndex, String country) {
        this.farmName = farmName;
        this.location = location;
        this.totalArea = totalArea;
        this.numberOfWorkers = numberOfWorkers;
        this.annualBudget = annualBudget;
        this.numberOfMachinery = numberOfMachinery;
        this.cropType = cropType;
        this.numberOfFields = numberOfFields;
        this.numberOfIrrigationSystems = numberOfIrrigationSystems;
        this.soilQualityIndex = soilQualityIndex;
        this.country = country;
    }

//Agriculture Setters
    void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    void setAnnualBudget(double annualBudget) {
        this.annualBudget = annualBudget;
    }

    void setNumberOfMachinery(int numberOfMachinery) {
        this.numberOfMachinery = numberOfMachinery;
    }

    void setCropType(String cropType) {
        this.cropType = cropType;
    }

    void setNumberOfFields(int numberOfFields) {
        this.numberOfFields = numberOfFields;
    }

    void setNumberOfIrrigationSystems(int numberOfIrrigationSystems) {
        this.numberOfIrrigationSystems = numberOfIrrigationSystems;
    }

    void setSoilQualityIndex(double soilQualityIndex) {
        this.soilQualityIndex = soilQualityIndex;
    }

    void setCountry(String country) {
        this.country = country;
    }

//Agriculture Getters
    String getFarmName() {
        return farmName;
    }

    String getLocation() {
        return location;
    }

    double getTotalArea() {
        return totalArea;
    }

    int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    double getAnnualBudget() {
        return annualBudget;
    }

    int getNumberOfMachinery() {
        return numberOfMachinery;
    }

    String getCropType() {
        return cropType;
    }

    int getNumberOfFields() {
        return numberOfFields;
    }

    int getNumberOfIrrigationSystems() {
        return numberOfIrrigationSystems;
    }

    double getSoilQualityIndex() {
        return soilQualityIndex;
    }

    String getCountry() {
        return country;
    }

//Agriculture Display
    void Display() {
        System.out.println("Farm Name: " + farmName);
        System.out.println("Location: " + location);
        System.out.println("Total Area: " + totalArea);
        System.out.println("Number of Workers: " + numberOfWorkers);
        System.out.println("Annual Budget:" + annualBudget);
        System.out.println("Number of Machinery: " + numberOfMachinery);
        System.out.println("Crop Type: " + cropType);
        System.out.println("Number of Fields: " + numberOfFields);
        System.out.println("Number of Irrigation Systems: " + numberOfIrrigationSystems);
        System.out.println("Soil Quality Index: " + soilQualityIndex);
        System.out.println("Country: " + country);
    }
}

// CropFarming class
class CropFarming extends Agriculture {
    int numberOfCrops;
    double averageYield; 
    int numberOfGreenhouses;
// CropFarming Default Constructor
    CropFarming() {
        super();
        this.numberOfCrops = 0;
        this.averageYield = 0.0;
        this.numberOfGreenhouses = 0;
    }
// CropFarming Parameterized Constructor
    CropFarming(int numberOfCrops, double averageYield, int numberOfGreenhouses) {
        super();
        this.numberOfCrops = numberOfCrops;
        this.averageYield = averageYield;
        this.numberOfGreenhouses = numberOfGreenhouses;
    }
// CropFarming Setters
    void setNumberOfCrops(int numberOfCrops) {
        this.numberOfCrops = numberOfCrops;
    }

    void setAverageYield(double averageYield) {
        this.averageYield = averageYield;
    }

    void setNumberOfGreenhouses(int numberOfGreenhouses) {
        this.numberOfGreenhouses = numberOfGreenhouses;
    }
// CropFarming Getters
    int getNumberOfCrops() {
        return numberOfCrops;
    }

    double getAverageYield() {
        return averageYield;
    }

    int getNumberOfGreenhouses() {
        return numberOfGreenhouses;
    }
// CropFarming Display
    void Display() {
        super.Display();
        System.out.println("Number of Crops: " + numberOfCrops);
        System.out.println("Average Yield: " + averageYield);
        System.out.println("Number of Greenhouses: " + numberOfGreenhouses);
    }
}

// AnimalHusbandry
class AnimalHusbandry extends Agriculture {
    int numberOfAnimals;
    String animalType;
    int numberOfBarns;
// AnimalHusbandry Default Constructor
    AnimalHusbandry() {
        super();
        this.numberOfAnimals = 0;
        this.animalType = "Not Given";
        this.numberOfBarns = 0;
    }
// AnimalHusbandry Parameterized Constructor
    AnimalHusbandry(int numberOfAnimals, String animalType, int numberOfBarns) {
        super();
        this.numberOfAnimals = numberOfAnimals;
        this.animalType = animalType;
        this.numberOfBarns = numberOfBarns;
    }
// AnimalHusbandry Setters
    void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    void setNumberOfBarns(int numberOfBarns) {
        this.numberOfBarns = numberOfBarns;
    }
// AnimalHusbandry Getters
    int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    String getAnimalType() {
        return animalType;
    }

    int getNumberOfBarns() {
        return numberOfBarns;
    }
// AnimalHusbandry Display
    void Display() {
        super.Display();
        System.out.println("Number of Animals: " + numberOfAnimals);
        System.out.println("Animal Type: " + animalType);
        System.out.println("Number of Barns: " + numberOfBarns);
    }
}

// Horticulture Class
class Horticulture extends Agriculture {
    int numberOfOrchards;
    int numberOfFlowersPlanted;
    double gardenArea; 
// Horticulture Default Constructor
    Horticulture() {
        super();
        this.numberOfOrchards = 0;
        this.numberOfFlowersPlanted = 0;
        this.gardenArea = 0.0;
    }
// Horticulture Parameterized Constructor
    Horticulture(int numberOfOrchards, int numberOfFlowersPlanted, double gardenArea) {
        super();
        this.numberOfOrchards = numberOfOrchards;
        this.numberOfFlowersPlanted = numberOfFlowersPlanted;
        this.gardenArea = gardenArea;
    }
// Horticulture Setters    
    void setNumberOfOrchards(int numberOfOrchards) {
        this.numberOfOrchards = numberOfOrchards;
    }

    void setNumberOfFlowersPlanted(int numberOfFlowersPlanted) {
        this.numberOfFlowersPlanted = numberOfFlowersPlanted;
    }

    void setGardenArea(double gardenArea) {
        this.gardenArea = gardenArea;
    }
// Horticulture Getters
    int getNumberOfOrchards() {
        return numberOfOrchards;
    }

    int getNumberOfFlowersPlanted() {
        return numberOfFlowersPlanted;
    }

    double getGardenArea() {
        return gardenArea;
    }
// Horticulture Display
    void Display() {
        super.Display();
        System.out.println("Number of Orchards: " + numberOfOrchards);
        System.out.println("Number of Flowers Planted: " + numberOfFlowersPlanted);
        System.out.println("Garden Area: " + gardenArea);
    }
}

// Test Class
class TestAgriculture {
    public static void main(String[] args) {
        CropFarming c1 = new CropFarming(20, 4.5, 10);
        AnimalHusbandry a1 = new AnimalHusbandry(5, "Cattle", 3);
        Horticulture h1 = new Horticulture(10, 5000, 2.5);

        c1.Display();
        System.out.println();
        a1.Display();
        System.out.println();
        h1.Display();

        
    }
}
