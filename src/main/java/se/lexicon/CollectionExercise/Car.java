package se.lexicon.CollectionExercise;

public class Car {
    private int id;
    private  String carBrand;
    private  String model;

    public Car(int id, String carBrand) {
        this.id = id;
        this.carBrand = carBrand;
    }

    public Car(int id, String carBrand, String model) {
        this.id = id;
        this.carBrand = carBrand;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
