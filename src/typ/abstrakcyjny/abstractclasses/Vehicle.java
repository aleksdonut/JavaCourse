package typ.abstrakcyjny.abstractclasses;

abstract class Vehicle {
    private int speed;

    public abstract void speedUp();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
