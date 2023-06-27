package interfejs.comparable;

import java.util.Arrays;
import java.util.Scanner;

class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {4,7,22,1,6,11,14,16,19,23,28,25,39,32,37,47,89,1111,237};
        System.out.println("Unsorted table: ");
        System.out.println(Arrays.toString(numbers));
        compareToLowToHigh(numbers);
        System.out.println("Low to high: " + Arrays.toString(numbers));
        compareToHighToLow(numbers);
        System.out.println("High to low: " + Arrays.toString(numbers));
    }

    public static int[] compareToLowToHigh (int[] table){
        int[] tmp = new int[table.length];
        for (int i = table.length-1; i > 0; i--) {
            for (int j = 0; j < table.length-1; j++) {
                if (table[j] > table[j+1]) {
                    tmp[j] = table[j];
                    table[j] = table[j+1];
                    table[j+1] = tmp[j];
                }
            }
        }
        return table;
    }

    public static int[] compareToHighToLow (int[] table){
        int[] tmp = new int[table.length];
        for (int i = table.length-1; i > 0; i--) {
            for (int j = 0; j < table.length-1; j++) {
                if (table[j] < table[j+1]) {
                    tmp[j] = table[j];
                    table[j] = table[j+1];
                    table[j+1] = tmp[j];
                }
            }
        }
        return table;
    }
}
