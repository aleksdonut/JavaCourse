package petle;

import java.util.Scanner;

public class LoopExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many digits you want to add together?");
        int numberOfDigits = scanner.nextInt();
        int tmp = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            System.out.println("Enter number");
            tmp = tmp + scanner.nextInt();
        }

        System.out.println("Sum of all digits is " + tmp);
        scanner.close();
    }
}
