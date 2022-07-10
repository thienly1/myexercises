package se.lexicon.Inheritance.assigment1;

/**
 * 1. Using inheritance, create a program that prints out a different message
 * depending on which child class is called.
 * a. Define an abstract class called Vehicle and give it appropriate properties/fields.
 * (Example:
 * int vehicleId = 1;
 * String registrationNumber = “ABC123”
 * String brand = “Volvo”
 * etc...)
 * b. Define three child classes: Car, Motorcycle and Truck. These classes should all extend the
 * Vehicle class.
 * In addition, all three classes should have properties/fields unique to them.
 * (Example:
 * Car - numberOfDoors, numberOfPassengers...
 * Truck - maxSpeed, maxWeight...
 * Motorcycle - motorcycleType...)
 * c. Create an abstract method in the Vehicle class called drive().
 * Next, override the drive() method in all child classes and give it a different implementation
 * depending on type of vehicle.
 * (Example:
 * Car - drive() { System.out.println(“Car is driving...”) }
 * )
 * d. Finally, make instances of all the child classes and call the drive() method from each class.
 * Assuming your implementation of the drive() method differs in each child class, you should get
 * three different print outs.
 */
public abstract class Vehicle {
    private int vehicleId;
    private String registrationNumber;
    private String brand;

    public Vehicle(int vehicleId, String registrationNumber, String brand) {
        this.vehicleId = vehicleId;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }
    public abstract void drive();

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
