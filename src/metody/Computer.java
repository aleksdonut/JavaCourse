package metody;

public class Computer {
    String processor;
    int memory;

    void printInfo() {
        System.out.println(getInfo());
    }

    String getInfo(){
        return processor + ", " + memory;
    }
}
