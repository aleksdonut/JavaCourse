package typ.abstrakcyjny.others;

class Amphibia implements Car, Boat{

    @Override
    public void printName() {
        System.out.println("Amphibia it is a little: ");
        Car.super.printName();
        System.out.println("and a little ");
        Boat.super.printName();
    }
}
