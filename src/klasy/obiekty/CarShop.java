package klasy.obiekty;

public class CarShop {
    public static void main(String[] args) {
        Car carOne = new Car();
        carOne.brand = "Audi";
        carOne.model = "A6";
        carOne.color = "black";
        carOne.wheelSize = 20;
        carOne.doors = 5;

        System.out.println(carOne.brand + ", " + carOne.model + ", " + carOne.color + ", " + carOne.wheelSize + ", " + carOne.doors);

        Car carTwo = new Car();
        carTwo.brand = "Toyota";
        carTwo.model = "Yaris";
        carTwo.color = "white";
        carTwo.wheelSize = 15;
        carTwo.doors = 5;

        System.out.println(carTwo.brand + ", " + carTwo.model + ", " + carTwo.color + ", " + carTwo.wheelSize + ", " + carTwo.doors);
    }
}
