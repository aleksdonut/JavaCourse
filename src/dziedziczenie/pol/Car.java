package dziedziczenie.pol;

class Car extends WheeledVehicle {
    private int doors;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    void printInfo() {
        System.out.println(getEngine().getPower() + " " + getEngine().getType() + " " + getWheels());
    }
}
