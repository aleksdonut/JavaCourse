package typ.abstrakcyjny.others;

public interface Car {
    default void printName() {
        System.out.println("Car");
    }
}
