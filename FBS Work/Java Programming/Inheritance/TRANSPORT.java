// Transport Class

class Transport {
    String transportName;
    int capacity;
    double speed;
    double fuelConsumption;
    int numberOfVehicles;
    String countryOfOperation;
    String headquartersLocation;
    int numberOfEmployees;
    double annualBudget;
    int numberOfAccidents;
    int numberOfRoutes;

    // Transport Default Constructor
    Transport() {
        this.transportName = "Not Given";
        this.capacity = 0;
        this.speed = 0.0;
        this.fuelConsumption = 0.0;
        this.numberOfVehicles = 0;
        this.countryOfOperation = "Not Given";
        this.headquartersLocation = "Not Given";
        this.numberOfEmployees = 0;
        this.annualBudget = 0.0;
        this.numberOfAccidents = 0;
        this.numberOfRoutes = 0;
    }

    // Transport Parameterized Constructor
    Transport(String transportName, int capacity, double speed, double fuelConsumption,
            int numberOfVehicles, String countryOfOperation, String headquartersLocation,
            int numberOfEmployees, double annualBudget, int numberOfAccidents, int numberOfRoutes) {
        this.transportName = transportName;
        this.capacity = capacity;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.numberOfVehicles = numberOfVehicles;
        this.countryOfOperation = countryOfOperation;
        this.headquartersLocation = headquartersLocation;
        this.numberOfEmployees = numberOfEmployees;
        this.annualBudget = annualBudget;
        this.numberOfAccidents = numberOfAccidents;
        this.numberOfRoutes = numberOfRoutes;
    }

    // Transport Setters
    void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    void setCountryOfOperation(String countryOfOperation) {
        this.countryOfOperation = countryOfOperation;
    }

    void setHeadquartersLocation(String headquartersLocation) {
        this.headquartersLocation = headquartersLocation;
    }

    void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    void setAnnualBudget(double annualBudget) {
        this.annualBudget = annualBudget;
    }

    void setNumberOfAccidents(int numberOfAccidents) {
        this.numberOfAccidents = numberOfAccidents;
    }

    void setNumberOfRoutes(int numberOfRoutes) {
        this.numberOfRoutes = numberOfRoutes;
    }

    //Transport  Getters
    String getTransportName() {
        return this.transportName;
    }

    int getCapacity() {
        return this.capacity;
    }

    double getSpeed() {
        return this.speed;
    }

    double getFuelConsumption() {
        return this.fuelConsumption;
    }

    int getNumberOfVehicles() {
        return this.numberOfVehicles;
    }

    String getCountryOfOperation() {
        return this.countryOfOperation;
    }

    String getHeadquartersLocation() {
        return this.headquartersLocation;
    }

    int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    double getAnnualBudget() {
        return this.annualBudget;
    }

    int getNumberOfAccidents() {
        return this.numberOfAccidents;
    }

    int getNumberOfRoutes() {
        return this.numberOfRoutes;
    }

    // Transport Display
    void Display() {
        System.out.println("Transport Name: " + transportName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Consumption: " + fuelConsumption);
        System.out.println("Number of Vehicles: " + numberOfVehicles);
        System.out.println("Country of Operation: " + countryOfOperation);
        System.out.println("Headquarters Location: " + headquartersLocation);
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println("Annual Budget: " + annualBudget);
        System.out.println("Number of Accidents: " + numberOfAccidents);
        System.out.println("Number of Routes: " + numberOfRoutes);
    }
}

// AirTransport class
class AirTransport extends Transport {
    int numberOfPlanes;
    int numberOfPilots;
    int numberOfAirports;

// AirTransport Default Constructor
    AirTransport() {
        super();
        this.numberOfPlanes = 0;
        this.numberOfPilots = 0;
        this.numberOfAirports = 0;
    }

// AirTransport Parameterized Constructor
    AirTransport(int numberOfPlanes, int numberOfPilots, int numberOfAirports) {
        super();
        this.numberOfPlanes = numberOfPlanes;
        this.numberOfPilots = numberOfPilots;
        this.numberOfAirports = numberOfAirports;
    }
// AirTransport Setters
    void setNumberOfPlanes(int numberOfPlanes) {
        this.numberOfPlanes = numberOfPlanes;
    }

    void setNumberOfPilots(int numberOfPilots) {
        this.numberOfPilots = numberOfPilots;
    }

    void setNumberOfAirports(int numberOfAirports) {
        this.numberOfAirports = numberOfAirports;
    }

// AirTransport Getters

    int getNumberOfPlanes() {
        return this.numberOfPlanes;
    }

    int getNumberOfPilots() {
        return this.numberOfPilots;
    }

    int getNumberOfAirports() {
        return this.numberOfAirports;
    }
//AirTransport Display
    void Display() {
        super.Display();
        System.out.println("Number of Planes: " + numberOfPlanes);
        System.out.println("Number of Pilots: " + numberOfPilots);
        System.out.println("Number of Airports: " + numberOfAirports);
    }
}

//  WaterTransport Class
class WaterTransport extends Transport {
    int numberOfShips;
    int numberOfPorts;
    int numberOfCrewMembers;

// WaterTransport Default Constructor
    WaterTransport() {
        super();
        this.numberOfShips = 0;
        this.numberOfPorts = 0;
        this.numberOfCrewMembers = 0;
    }

// WaterTransport Parameterized Constructor
    WaterTransport(int numberOfShips, int numberOfPorts, int numberOfCrewMembers) {
        super();
        this.numberOfShips = numberOfShips;
        this.numberOfPorts = numberOfPorts;
        this.numberOfCrewMembers = numberOfCrewMembers;
    }

// WaterTransport Setters
    void setNumberOfShips(int numberOfShips) {
        this.numberOfShips = numberOfShips;
    }

    void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }

    void setNumberOfCrewMembers(int numberOfCrewMembers) {
        this.numberOfCrewMembers = numberOfCrewMembers;
    }

// WaterTransport Getters
    int getNumberOfShips() {
        return this.numberOfShips;
    }

    int getNumberOfPorts() {
        return this.numberOfPorts;
    }

    int getNumberOfCrewMembers() {
        return this.numberOfCrewMembers;
    }

// WaterTransport Display
    void Display() {
        super.Display();
        System.out.println("Number of Ships: " + numberOfShips);
        System.out.println("Number of Ports: " + numberOfPorts);
        System.out.println("Number of Crew Members: " + numberOfCrewMembers);
    }
}

// LandTransport Class
class LandTransport extends Transport {
    int numberOfBuses;
    int numberOfTrains;
    int numberOfDrivers;

// LandTransport Default Constructor
    LandTransport() {
        super();
        this.numberOfBuses = 0;
        this.numberOfTrains = 0;
        this.numberOfDrivers = 0;
    }

// LandTransport Parameterized Constructor
    LandTransport(int numberOfBuses, int numberOfTrains, int numberOfDrivers) {
        super();
        this.numberOfBuses = numberOfBuses;
        this.numberOfTrains = numberOfTrains;
        this.numberOfDrivers = numberOfDrivers;
    }
// LandTransport Setters
    void setNumberOfBuses(int numberOfBuses) {
        this.numberOfBuses = numberOfBuses;
    }

    void setNumberOfTrains(int numberOfTrains) {
        this.numberOfTrains = numberOfTrains;
    }

    void setNumberOfDrivers(int numberOfDrivers) {
        this.numberOfDrivers = numberOfDrivers;
    }
// LandTransport Getters
    int getNumberOfBuses() {
        return this.numberOfBuses;
    }

    int getNumberOfTrains() {
        return this.numberOfTrains;
    }

    int getNumberOfDrivers() {
        return this.numberOfDrivers;
    }
// LandTransport Display
    void Display() {
        super.Display();
        System.out.println("Number of Buses: " + numberOfBuses);
        System.out.println("Number of Trains: " + numberOfTrains);
        System.out.println("Number of Drivers: " + numberOfDrivers);
    }
}

// Test Class
class TestTransport {
    public static void main(String[] args) {
        AirTransport air = new AirTransport();
        WaterTransport water = new WaterTransport();
        LandTransport land = new LandTransport();

        air.Display();
        System.out.println();
        water.Display();
        System.out.println();
        land.Display();
    }
}
