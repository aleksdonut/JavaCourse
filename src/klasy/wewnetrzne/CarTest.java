package klasy.wewnetrzne;

public class CarTest {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.refuel(80);
        car.go();

        Car.Engine engine = new Car.Engine("BMW");

    }
}
