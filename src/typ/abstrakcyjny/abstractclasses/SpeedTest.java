package typ.abstrakcyjny.abstractclasses;

public class SpeedTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle plane = new Plane();

        car.speedUp();
        plane.speedUp();

        System.out.println(car.getSpeed());
        System.out.println(plane.getSpeed());
    }
}
