package konstruktory;

public class ComputerStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Intel i5", 8192);
        comp1.printInfo();
        Computer comp2 = new Computer("AMD Ryzen 1700", 16_384);
        comp2.printInfo();
    }
}
