package przeciazanie_metod_this;

public class Car {
    String brand;
    String model;
    int year;
    String color;

    Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }

    Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

}
