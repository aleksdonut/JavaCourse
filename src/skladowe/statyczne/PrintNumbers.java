package skladowe.statyczne;

import java.util.Scanner;

public class PrintNumbers {
    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter number: ");
            int start = scanner.nextInt();
            System.out.println("Enter second number: ");
            int end = scanner.nextInt();
            printNumbers(start, end);
        } while (scanner.nextInt() != EXIT);

        scanner.close();

    }

    private static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
