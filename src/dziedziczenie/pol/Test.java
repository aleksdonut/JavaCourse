package dziedziczenie.pol;

class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setDoors(5);
        car1.setWheels(4);
        car1.setEngine(new Engine(120, "petrol"));
        car1.setFuel(40.0);

        car1.printInfo();
    }
}
