package metody;

public class Calc {
    int addTwoNumbers(int a, int b) {
        return a + b;
    }

    void addAndPrint(int x, int y) {
        int sum = addTwoNumbers(x, y);
        System.out.println(sum);
    }
}
