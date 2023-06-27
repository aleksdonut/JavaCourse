package wyjatki;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Which operation you want to do with two numbers?");
        System.out.println("If add enter +, if subtraction enter -, if multiply enter *, if divide enter /");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("Now enter first number: ");
        double x = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double y = scanner.nextDouble();
        try {
            calculator.chooseMathematicalOperation(option, x, y);
        } catch (UnknownOperationException e) {
            System.err.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}

