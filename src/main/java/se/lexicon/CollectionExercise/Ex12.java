package se.lexicon.CollectionExercise;

import java.util.HashMap;
import java.util.Map;

/**
 * 12. Create a new class and call it Car. Add fields for Id,Brand and Model + getters and setters
 * Create a new hashMap of type <Integer,Car> and populate it with elements containing an
 * id(Integer) and a car object(Car). Lastly, print out only the car's brand
 */

public class Ex12 {
    public static void main(String[] args) {
        HashMap<Integer, Car> car = new HashMap<>();

        Car car1 = new Car(21, "Toyota", "AAA");
        Car car2 = new Car( 23, "Volvo", "SBS");
        Car car3 = new Car(12,"Hyundai", "LSA");
        Car car4 = new Car(14, "ABS","SMA");

        car.put(car1.getId(), car1);
        car.put(car2.getId(), car2);
        car.put(car3.getId(), car3);
        car.put(car4.getId(), car4);

        for(Car i: car.values()){
            System.out.println(i.getCarBrand());
        }
    }
}
