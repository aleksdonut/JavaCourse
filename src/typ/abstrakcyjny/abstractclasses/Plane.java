package typ.abstrakcyjny.abstractclasses;

public class Plane extends Vehicle {

    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 100);
    }
}
