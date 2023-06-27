package debugowanie;

import java.util.Arrays;
import java.util.Scanner;

class EvenAdder {
    public static void main(String[] args) {
        int[] array = createEvenArray(5);
        int[] reversed = reverseArray(array);
        System.out.println(Arrays.toString(reversed));
    }

    /**
     * @param size - number of elements to read
     * @return array containing even numbers
     */
    private static int[] createEvenArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Specify next number:");
            int next = scanner.nextInt();
            if (next % 2 == 0) {
                result[i] = next;
            } else {
                System.out.println("Wrong number, enter only even numbers!");
                i--;
            }
        }
        return result;
    }

    /**
     * @param array - array to be reversed
     * @return - reversed array
     */
    private static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[1] = array[array.length - i - 1];
        }
        return reversed;
    }
}