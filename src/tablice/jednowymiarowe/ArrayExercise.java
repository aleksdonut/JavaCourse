package tablice.jednowymiarowe;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        ArraySumUp asu = new ArraySumUp();
        int[] tab1 = {5,10,15};
        int[] tab2 = {10,20,30};

        int a = Arrays.stream(tab1).sum();
        int b = Arrays.stream(tab2).sum();

        System.out.println(a+b);
        System.out.println(asu.arraySummary(tab1, tab2));

    }
}
