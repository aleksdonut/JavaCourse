package wczytywanie.danych;

import java.util.Locale;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter a ");
        double a = scanner.nextDouble();
        System.out.println("Enter b ");
        double b = scanner.nextDouble();

        scanner.close();
        System.out.println("Sum of a and b is " + (a+b));
    }
}
