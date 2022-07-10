package se.lexicon.Inheritance.assigment1;

public class Motorcycle extends Vehicle {

    private String motorcycleType;
    private String colour;

    public Motorcycle(int vehicleId, String registrationNumber, String brand, String motorcycleType, String colour) {
        super(vehicleId, registrationNumber, brand);
        this.motorcycleType = motorcycleType;
        this.colour = colour;
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void drive(){
        System.out.println(" The motorbycle with ID: " + getVehicleId() + " has colour: " +getColour());

    }
}
