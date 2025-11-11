class Appliance {
    String brand;
    double power;   // in watts

    Appliance() {
        this.brand = "";
        this.power = 0.0;
    }

    Appliance(String brand, double power) {
        this.brand = brand;
        this.power = power;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setPower(double power) {
        this.power = power;
    }

    String getBrand() {
        return this.brand;
    }

    double getPower() {
        return this.power;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + "W");
    }
} // Appliance class ends


class Fan extends Appliance {
    int speedLevels;

    Fan() {
        super();
        this.speedLevels = 0;
    }

    Fan(String brand, double power, int speedLevels) {
        super(brand, power);
        this.speedLevels = speedLevels;
    }

    void setSpeedLevels(int speedLevels) {
        this.speedLevels = speedLevels;
    }

    int getSpeedLevels() {
        return this.speedLevels;
    }

    void displayInfo() {
        System.out.println("Fan Details:");
        super.displayInfo();
        System.out.println("Speed Levels: " + speedLevels);
    }
} // Fan class ends


class Refrigerator extends Appliance {
    int capacity;    // in liters

    Refrigerator() {
        super();
        this.capacity = 0;
    }

    Refrigerator(String brand, double power, int capacity) {
        super(brand, power);
        this.capacity = capacity;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    int getCapacity() {
        return this.capacity;
    }

    void displayInfo() {
        System.out.println("Refrigerator Details:");
        super.displayInfo();
        System.out.println("Capacity: " + capacity + "L");
    }
} // Refrigerator class ends


class TestAppliance {
    public static void main(String[] args) {
        Fan f1 = new Fan("Usha", 75.0, 3);
        Refrigerator r1 = new Refrigerator("Samsung", 150.0, 250);

        f1.displayInfo();
        System.out.println();
        r1.displayInfo();
    }
}
// TestAppliance class ends here