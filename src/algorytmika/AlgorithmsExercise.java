package algorytmika;

import java.util.Scanner;

public class AlgorithmsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (sum <= 100) {
            System.out.println("Input number: ");
            int number = scanner.nextInt();
            sum += number;
        }

        if (sum % 2 == 0) {
            System.out.println("Sum is even");
        } else {
            System.out.println("Sum is odd");
        }
    }
}
