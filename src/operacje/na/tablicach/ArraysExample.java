package operacje.na.tablicach;

import java.util.Arrays;

class ArraysExample {
    public static void main(String[] args) {
        String[] names = {"Basia", "Kasia", "Wojtek", "Agnieszka", "Kacper"};
        Integer[] numbers = {4, 7, 2, 1, 14, 23, 10, 5};

        printArray(names);
        printArray(numbers);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));

        String[] names2 = Arrays.copyOf(names, names.length);
        Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(names2));
        System.out.println(Arrays.toString(numbers2));

        System.out.println(Arrays.equals(names2, names));
        System.out.println(Arrays.equals(numbers, numbers2));

        Arrays.sort(names);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));

        String[] strings = new String[5];
        Arrays.fill(strings, "Jacek");
        System.out.println(Arrays.toString(strings));
    }

    public static <T> void printArray (T[] array) {
        for (T t: array) {
            System.out.println(t);
        }
    }
}
