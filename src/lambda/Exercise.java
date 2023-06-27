package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Exercise {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> supplier = () -> random.nextInt(1, 100);
        List<Integer> numbers = generateList(10, supplier);
        printList(numbers, p -> System.out.printf(p + " "));
        System.out.println();
        List<Integer> evenNumbers = generateEvenNumbersList(numbers, p -> (int) p % 2 == 0);
        printList(evenNumbers, p -> System.out.printf(p + " "));
    }

    private static List<Integer> generateEvenNumbersList(List<Integer> numbers, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : numbers) {
            if (predicate.test(integer)) {
                result.add(integer);
            }
        }
        return result;
    }

    private static List<Integer> generateList(int elements, Supplier supplier) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            result.add((Integer) supplier.get());
        }
        return result;
    }

    private static <T> void printList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

}
