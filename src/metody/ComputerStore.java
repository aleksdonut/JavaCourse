package metody;

public class ComputerStore {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer comp1 = factory.create("Intel i7", 16_384);
        Computer comp2 = new Computer();
        comp2.processor = "AMD Ryzen 1700";
        comp2.memory = 16_384;

        comp1.printInfo();
        comp2.printInfo();

        System.out.println(comp1.getInfo());

        ComputerUpgrade computerUpgrade = new ComputerUpgrade();
        computerUpgrade.addMemory(comp1, 1024);
        comp1.printInfo();
    }
}
