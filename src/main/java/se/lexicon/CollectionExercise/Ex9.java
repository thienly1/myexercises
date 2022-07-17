package se.lexicon.CollectionExercise;

import java.util.HashMap;

/**
 * 9. Create a new hashMap of type <Integer,String> and populate it with elements containing an
 * id(Integer) and a car brand(String). Lastly, print out the entire hashMap
 */

public class Ex9 {
    public static void main(String[] args) {
        HashMap<Integer, String> car = new HashMap<>();

        Car car1 = new Car(21, "Toyota");
        Car car2 = new Car( 23, "Volvo");
        Car car3 = new Car(12,"Hyundai");
        Car car4 = new Car(14, "ABS");

        car.put(car1.getId(), car1.getCarBrand());
        car.put(car2.getId(), car2.getCarBrand());
        car.put(car3.getId(), car3.getCarBrand());
        car.put(car4.getId(), car4.getCarBrand());
        car.put(34, "Mersedes");

        System.out.println(car);
    }
}
