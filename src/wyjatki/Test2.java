package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean error = true;
        do {
            try {
                System.out.println("Enter first value");
                numbers[0] = scanner.nextInt();
                System.out.println("Enter second value");
                numbers[1] = scanner.nextInt();
                System.out.println("Which value you want to print?");
                System.out.println("Number " + numbers[scanner.nextInt()-1]);
                error = false;
            } catch (InputMismatchException exception) {
                System.out.println("You haven't entered decimal number");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("You should enter 1 or 2, try one more time");
            } finally {
                scanner.nextLine();
            }
        } while (error);
    }
}
