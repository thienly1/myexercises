package se.lexicon.Inheritance.assigment1;

public class Truck extends Vehicle {

    private double maxSpeed;
    private  double maxWeight;

    public Truck(int vehicleId, String registrationNumber, String brand, double maxSpeed, double maxWeight) {
        super(vehicleId, registrationNumber, brand);
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    @Override
    public void drive(){
        System.out.println(" The truck with Id: " + getVehicleId()+ " has max speed: " + getMaxSpeed() + " and can not carry over " + getMaxWeight());

    }
}
