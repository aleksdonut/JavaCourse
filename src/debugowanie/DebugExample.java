package debugowanie;

import java.util.Scanner;

public class DebugExample {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = getArraySize();
        int[] numbers = createArray(size);
        int multiplier = getMultiplier();
        multiplyAllNumbersBy(numbers, multiplier);
        printArray(numbers);
    }

    private static int getArraySize() {
        System.out.println("Specify amount of numbers to input: ");
        int result = scanner.nextInt();
        return result;
    }

    private static int[] createArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Specify next number: ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static int getMultiplier() {
        System.out.println("Specify a multiplier: ");
        return scanner.nextInt();
    }

    private static void multiplyAllNumbersBy(int[] array, int multiplier) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= multiplier;
        }
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
