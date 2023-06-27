package typ.abstrakcyjny.others;

public interface Example {
    default void complicatedMethod() {
        read();
        calculate();
        save();
    }

    private void read() {

    }

    private void calculate() {

    }

    private void save() {

    }
}
