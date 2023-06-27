package strumienie;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class Exercise {
    public static void main(String[] args) {
        int[] ints = IntStream
                .iterate(0, x -> x + 1)
                .limit(1001)
                .filter(x -> x > 100 && x < 1000)
                .filter(x -> x % 5 == 0)
                .map(x -> x * 3)
                .limit(10)
                .toArray();
        System.out.println(Arrays.toString(ints));
    }
}
