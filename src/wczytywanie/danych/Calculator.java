package wczytywanie.danych;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();
        System.out.println("Enter number a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number b: ");
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter sign of operation u want to do with two numbers (add (+), subtraction(-), multiplication(*), division(/): ");
        String sign = scanner.nextLine();

        switch (sign) {
            case "+":
                System.out.println("Result is " + operations.add(a, b));
                break;
            case "-":
                System.out.println("Result is " + operations.subtraction(a, b));
                break;
            case "*":
                System.out.println("Result is " + operations.multiplication(a, b));
                break;
            case "/":
                System.out.println("Result is " + operations.division(a, b));
                break;
            default:
                System.out.println("Wrong option!");
        }
    }
}
