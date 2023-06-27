package metody.klasyobject;

class DataStore {
    private static final int MAX_COMPUTERS = 100;
    private static int numbersOfComputers = 0;
    private int numbersOfIdenticalComputers;
    private String info;
    Computer[] computers = new Computer[MAX_COMPUTERS];

    void add(Computer computer) {
        computers[numbersOfComputers] = computer;
        numbersOfComputers++;
    }

    void getInfo() {
        for (int i = 0; i < numbersOfComputers; i++) {
            System.out.println(computers[i].toString());
        }
    }


    int checkAvailability(Computer computer) {
        for (int i = 0; i < numbersOfComputers; i++) {
            if (computer.equals(computers[i])) {
                numbersOfIdenticalComputers++;
            }
        }
        return numbersOfIdenticalComputers;
    }
}
