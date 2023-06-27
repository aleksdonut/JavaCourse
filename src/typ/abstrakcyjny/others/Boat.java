package typ.abstrakcyjny.others;

public interface Boat {
    default void printName() {
        System.out.println("Boat");
    }
}
