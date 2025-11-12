class Defence {
    String nameOfHead;
    int numberOfTroops;
    double budget;
    int numberOfDepartments;
    int numberOfVehicles;
    String locationOfHeadquarters;
    String countryName;
    int manpowerCount;
    int numberOfCasualties;
    int numberOfMissionsPerformed;
    int numberOfBases;

    // Default constructor
    Defence() {
        this.nameOfHead = "Not Given";
        this.numberOfTroops = 0;
        this.budget = 0.0;
        this.numberOfDepartments = 0;
        this.numberOfVehicles = 0;
        this.locationOfHeadquarters = "Not Given";  
        this.countryName = "Not Given";
        this.manpowerCount = 0;
        this.numberOfCasualties = 0;
        this.numberOfMissionsPerformed = 0;
        this.numberOfBases = 0;
    }

    // Parameterized constructor
    Defence(String nameOfHead, int numberOfTroops, double budget, int numberOfDepartments,int numberOfVehicles, String locationOfHeadquarters, String countryName,int manpowerCount, int numberOfCasualties, int numberOfMissionsPerformed,int numberOfBases) {
        this.nameOfHead = nameOfHead;
        this.numberOfTroops = numberOfTroops;
        this.budget = budget;
        this.numberOfDepartments = numberOfDepartments;
        this.numberOfVehicles = numberOfVehicles;
        this.locationOfHeadquarters = locationOfHeadquarters;  
        this.countryName = countryName;
        this.manpowerCount = manpowerCount;
        this.numberOfCasualties = numberOfCasualties;
        this.numberOfMissionsPerformed = numberOfMissionsPerformed;
        this.numberOfBases = numberOfBases;       
    }

    // Setters and Getters
    void setNameOfHead(String nameOfHead) {
        this.nameOfHead = nameOfHead;
    }
    void setNumberOfTroops(int numberOfTroops) {
        this.numberOfTroops = numberOfTroops;
    }
    void setBudget(double budget) {
        this.budget = budget;
    }
    void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }
    void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }
    void setLocationOfHeadquarters(String locationOfHeadquarters) {
        this.locationOfHeadquarters = locationOfHeadquarters;
    }
    void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    void setManpowerCount(int manpowerCount) {
        this.manpowerCount = manpowerCount;
    }
    void setNumberOfCasualties(int numberOfCasualties) {
        this.numberOfCasualties = numberOfCasualties;
    }
    void setNumberOfMissionsPerformed(int numberOfMissionsPerformed) {
        this.numberOfMissionsPerformed = numberOfMissionsPerformed;
    }
    void setNumberOfBases(int numberOfBases) {
        this.numberOfBases = numberOfBases;
    }
    String getNameOfHead() {
        return this.nameOfHead;
    }
    int getNumberOfTroops() {
        return this.numberOfTroops;
    }
    double getBudget() {
        return this.budget;
    }
    int getNumberOfDepartments() {
        return this.numberOfDepartments;
    }
    int getNumberOfVehicles() {
        return this.numberOfVehicles;
    }
    String getLocationOfHeadquarters() {
        return this.locationOfHeadquarters;
    }
    String getCountryName() {
        return this.countryName;
    }
    int getManpowerCount() {
        return this.manpowerCount;
    }
    int getNumberOfCasualties() {
        return this.numberOfCasualties;
    }
    int getNumberOfMissionsPerformed() {
        return this.numberOfMissionsPerformed;
    }
    int getNumberOfBases() {
        return this.numberOfBases;
    }

    //Display
    void Display(){
        System.out.println("Name of Head: " + nameOfHead);
        System.out.println("Number of Troops: " + numberOfTroops);
        System.out.println("Budget: " + budget);
        System.out.println("Number of Departments: " + numberOfDepartments);
        System.out.println("Number of Vehicles: " + numberOfVehicles);
        System.out.println("Location of Headquarters: " + locationOfHeadquarters);
        System.out.println("Country Name: " + countryName);
        System.out.println("Manpower Count: " + manpowerCount);
        System.out.println("Number of Casualties: " + numberOfCasualties);
        System.out.println("Number of Missions Performed: " + numberOfMissionsPerformed);
        System.out.println("Number of Bases: " + numberOfBases);
    }


}

// Army class

class Army extends Defence {
    int numberOfTanks;
    int numberOfGuns;
    int numberOfGrenades;
    int numberOfBattalions;

// Default constructor
    Army() {
        super();
        this.numberOfTanks = 0;
        this.numberOfGuns = 0;
        this.numberOfGrenades = 0;
        this.numberOfBattalions = 0;
    }
    Army(int numberOfTanks, int numberOfGuns, int numberOfGrenades, int numberOfBattalions){
        super();
        this.numberOfTanks = numberOfTanks;
        this.numberOfGuns = numberOfGuns;
        this.numberOfGrenades = numberOfGrenades;
        this.numberOfBattalions = numberOfBattalions;
    }

// Setters and Getters
    void setNumberOfTanks(int numberOfTanks) {
        this.numberOfTanks = numberOfTanks;
    }
    void setNumberOfGuns(int numberOfGuns) {
        this.numberOfGuns = numberOfGuns;
    }
    void setNumberOfGrenades(int numberOfGrenades) {
        this.numberOfGrenades = numberOfGrenades;
    }
    void setNumberOfBattalions(int numberOfBattalions) {
        this.numberOfBattalions = numberOfBattalions;
    }
    int getNumberOfTanks() {
        return this.numberOfTanks;
    }
    int getNumberOfGuns() {
        return this.numberOfGuns;
    }
    int getNumberOfGrenades() {
        return this.numberOfGrenades;
    }
    int getNumberOfBattalions() {
        return this.numberOfBattalions;
    }

// Display
    void Display() {
        super.Display();
        System.out.println("Number of Tanks: " + numberOfTanks);
        System.out.println("Number of Guns: " + numberOfGuns);
        System.out.println("Number of Grenades: " + numberOfGrenades);
        System.out.println("Number of Battalions: " + numberOfBattalions);
    }

}

// Navy class
class Navy extends Defence {
    int numberOfShips;
    int numberOfSubmarines;
    int numberOfTorpedos;

// Default constructor
    Navy() {
        super();
        this.numberOfShips = 0;
        this.numberOfSubmarines = 0;
        this.numberOfTorpedos = 0;
    }

// Parameterized constructor

    Navy(int numberOfShips, int numberOfSubmarines, int numberOfTorpedos) {
        super();
        this.numberOfShips = numberOfShips;
        this.numberOfSubmarines = numberOfSubmarines;
        this.numberOfTorpedos = numberOfTorpedos;
    }

// Setters and Getters
    void setNumberOfShips(int numberOfShips) {
        this.numberOfShips = numberOfShips;
    }
    void setNumberOfSubmarines(int numberOfSubmarines) {
        this.numberOfSubmarines = numberOfSubmarines;
    }
    void setNumberOfTorpedos(int numberOfTorpedos) {
        this.numberOfTorpedos = numberOfTorpedos;
    }
    int getNumberOfShips() {
        return this.numberOfShips;
    }
    int getNumberOfSubmarines() {
        return this.numberOfSubmarines;
    }
    int getNumberOfTorpedos() {
        return this.numberOfTorpedos;
    }
// Display
    void Display() {
        super.Display();
        System.out.println("Number of Ships:"+numberOfShips);
        System.out.println("Number of Submarines:"+numberOfSubmarines);
        System.out.println("Number of Torpedos:"+numberOfTorpedos);
    }

}

// Airforce class
    class Airforce extends Defence {
        int numberOfMissiles;
        int numberOfAircraft;
        int numberOfSquadrons;

// Default constructor
        Airforce() {
            super();
            this.numberOfMissiles = 0;
            this.numberOfAircraft = 0;
            this.numberOfSquadrons = 0;
        }

// Parameterized constructor
        Airforce(int numberOfMissiles, int numberOfAircraft, int numberOfSquadrons) {
            super();
            this.numberOfMissiles = numberOfMissiles;
            this.numberOfAircraft = numberOfAircraft;
            this.numberOfSquadrons = numberOfSquadrons;
        }

// Setters and Getters
        void setNumberOfMissiles(int numberOfMissiles) {
            this.numberOfMissiles = numberOfMissiles;
        }
        void setNumberOfAircraft(int numberOfAircraft) {
            this.numberOfAircraft = numberOfAircraft;
        }
        void setNumberOfSquadrons(int numberOfSquadrons) {
            this.numberOfSquadrons = numberOfSquadrons;
        }
        int getNumberOfMissiles() {
            return this.numberOfMissiles;
        }
        int getNumberOfAircraft() {
            return this.numberOfAircraft;
        }
        int getNumberOfSquadrons() {
            return this.numberOfSquadrons;
        }
// Display
        void Display() {
            super.Display();
            System.out.println("Number of Missiles:"+numberOfMissiles);
            System.out.println("Number of Aircraft:"+numberOfAircraft);
            System.out.println("Number of Squadrons:"+numberOfSquadrons);
        }
    }

class TestDefence {
    public static void main(String[] args) {
        Army a = new Army();
        Navy n = new Navy();
        Airforce af = new Airforce();


        a.Display();
        System.out.println();
        n.Display();
        System.out.println();
        af.Display();
    }
}
