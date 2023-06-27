package tablice.jednowymiarowe;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Jan", "Kasia", "Basia"};

        System.out.println(numbers[0]);
        System.out.println(names[0]);

        numbers[0] = 5;
        names[0] = "Jan";

        System.out.println(numbers[0]);
        System.out.println(names[0]);

    }
}
