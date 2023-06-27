package tablice.jednowymiarowe;

import java.util.Arrays;

public class ArraySumUp {
    int arraySummary (int[] tableOne, int[] tableTwo) {
        int a = Arrays.stream(tableOne).sum();
        int b = Arrays.stream(tableTwo).sum();

        return a+b;
    }
}
