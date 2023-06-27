package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int number = 0;
        boolean error = true;
        do {
            try {
                number = scanner.nextInt();
                error = false;
                System.out.println("Enter value is correct");
            } catch (InputMismatchException inputMismatchException) {
                System.err.println("Entered value isn't a serial number");
                inputMismatchException.printStackTrace();
                scanner.nextLine();
            }
        } while (error);
        System.out.println("You have entered number " + number);
        scanner.close();
    }
}
