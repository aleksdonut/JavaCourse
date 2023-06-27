package konstrukcja_super;

class ComputerStore {
    public static void main(String[] args) {
        Computer computer = new Computer(45, 16384);
        Notebook notebook = new Notebook(40, 8192,10000);

        System.out.println(computer.getCpuTemperature() + " " + computer.getRamMemory());
        System.out.println(notebook.getCpuTemperature() + " " + notebook.getRamMemory() + " " + notebook.getBatteryCapacity());

    }
}
