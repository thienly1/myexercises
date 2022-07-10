package se.lexicon.Inheritance.assigment1;

public class Car extends  Vehicle {

    private int numberOfDoors;
    private int numberOfPassengers;

    public Car(int vehicleId, String registrationNumber, String brand, int numberOfDoors, int numberOfPassengers) {
        super(vehicleId, registrationNumber, brand);
        this.numberOfDoors = numberOfDoors;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    public void drive(){
        System.out.println(" The Car with ID: " + getVehicleId()+ " has number of doors: " + getNumberOfDoors() + " and passengers: " + getNumberOfPassengers());

    }
}
