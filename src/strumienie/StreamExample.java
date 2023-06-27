package strumienie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StreamExample {
    public static void main(String[] args) throws FileNotFoundException {
//        Stream<String> stringStream = Stream.of("a", "b", "c");
//        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

//        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
//        int[] evenNumbers = intStream.filter(x -> x % 2 == 0).toArray();
//        System.out.println(Arrays.toString(evenNumbers));

//        Stream<String> letters = Stream.of("a", "b", "c");
//        String[] upperCaseLetters = letters
//                .map(s -> s.toUpperCase())
//                .toArray(String[]::new);
//        System.out.println(Arrays.toString(upperCaseLetters));

//        int[] numbers = IntStream.rangeClosed(0, 100).toArray();
//        System.out.print(Arrays.toString(numbers));
        Scanner scanner = new Scanner(new File("C:\\Users\\aleks\\IdeaProjects\\FirstProject\\src\\strumienie\\test.txt"));
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
        scanner
                .tokens()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
