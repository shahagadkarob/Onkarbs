class Car {
    String model;
    String brand;
    double price;
    String colour;
    double fuelCapacity;

    void setModel(String model)
    {
        this.model = model;
    }
    void setBrand(String brand)
    {
        this.brand = brand;
    }
    void setPrice(double price)
    {
        this.price = price;
    }
    void setColour(String colour)
    {
        this.colour = colour;
    }
    void setFuelCapacity(double fuelCapacity)
    {
        this.fuelCapacity = fuelCapacity;
    }
}//Car class ends here

class testCar {
    public static void main(String args[]){
        Car c1 = new Car();

        c1.setModel("City");
        c1.setBrand("Honda");
        c1.setPrice(1500000);
        c1.setColour("White");
        c1.setFuelCapacity(40);

        System.out.println("Car Model:"+c1.model+"\nCar Brand:"+c1.brand+"\nCar Price:"+c1.price+"\nCar Colour:"+c1.colour+"\nCar Fuel Capacity:"+c1.fuelCapacity);
    }
}//testCar class ends here
