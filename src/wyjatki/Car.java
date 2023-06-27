package wyjatki;

class Car {
    private static final double FUEL_CONSUMPTION = 8;
    private static final double MAX_FUEL = 50;
    private double fuel;

    public void refuel(double additionalFuel) {
        if (fuel + additionalFuel > MAX_FUEL)
            throw new IllegalArgumentException("Bak jest za maly aby zatankowac tyle paliwa");
        else
            fuel += additionalFuel;
    }

    public void drive() {
        if (fuel - FUEL_CONSUMPTION < 0)
            throw new IllegalStateException("Masz za malo paliwa, zatankuj");
        else
            fuel -= FUEL_CONSUMPTION;
    }

    @Override
    public String toString() {
        return "Fuel level: " + fuel;
    }
}
