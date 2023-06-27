package specyfikatory.dostepu.logic;

import specyfikatory.dostepu.data.Car;

class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car(2022, "Audi", "A6", "black");
        Car car2 = new Car(2020, "Audi", "A4");
        car2.setColor("red");
        car2.setYear(2022);

        System.out.println(car1.getBrand() + ", " + car1.getModel() + ", " + car1.getYear() + ", " + car1.getColor());
        System.out.println(car2.getBrand() + ", " + car2.getModel() + ", " + car2.getYear() + ", " + car2.getColor());
    }
}
