package przeciazanie_metod_this;

public class Calculator {
    int addTwoNumbers(int a, int b) {
        return a + b;
    }

    int addThreeNumbers(int a, int b, int c) {
        return addTwoNumbers(a, b) + c;
    }

    int subtractTwoNumbers(int a, int b) {
        return a - b;
    }

    int subtractThreeNumbers(int a, int b, int c) {
        return subtractTwoNumbers(a, b) - c;
    }
}
