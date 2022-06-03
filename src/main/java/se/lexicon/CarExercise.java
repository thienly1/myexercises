package se.lexicon;

class Car {
    String carBrand;
    String registrationNumber;
    int maxSpeed;
    String ownName;
    int seatNumber;
    public String getCarInformation() {
        return "Car brand: " + carBrand + "; Registration number: " + registrationNumber + "; Max speed: " + maxSpeed + "; Owner Number: " + ownName + "; quantity of car seats: "
                + seatNumber;
    }
}
public class CarExercise {
    public static void main(String[] args) {
        Car volvo = new Car();
        Car toyota = new Car();

        volvo.carBrand = "Volvo";
        volvo.registrationNumber = "NUG089";
        volvo.maxSpeed = 100;
        volvo.ownName = "Ly";
        volvo.seatNumber = 4;

        toyota.carBrand = "Toyota";
        toyota.registrationNumber = "NUG012";
        toyota.maxSpeed = 150;
        toyota.ownName = "Sarah";
        toyota.seatNumber = 7;

        System.out.println(toyota.getCarInformation());
    }
}

