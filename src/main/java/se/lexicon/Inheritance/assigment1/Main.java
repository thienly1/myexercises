package se.lexicon.Inheritance.assigment1;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(1245, "ABC1234", "Hyundai", 100, 200);
        truck.drive();

        Car car = new Car(3452, "AB125", "Toyota", 3, 5);
        car.drive();

        Motorcycle motorcycle = new Motorcycle(7658, "MO2345", "yaomi", "Electriccycle", "Black");
        motorcycle.drive();

    }
}
