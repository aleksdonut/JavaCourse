package lambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Functions {
    public static void main(String[] args) {
        String original = "   WIELKI NAPIS   ";
        Function<String, String> function = source -> source.toLowerCase().trim();
        String changed = function.apply(original);
        System.out.println(changed);
        Consumer<String> printMethod = System.out::println;
        printMethod.accept("ABC");

        Predicate<Integer> checkIfAdult = age -> age >= 18;
        System.out.println(checkIfAdult.test(19));

        String[] firstNames = {"Jan", "Karol", "Piotr"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski"};
        int[] ages = {22, 33, 44};
        Random random = new Random();
        Supplier<Person> randomPersonGenerator = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };
        Person person = randomPersonGenerator.get();
        System.out.println(person);
    }
}
/*
f(x)=x*x
(int x) -> x*x
(int x) -> return x*x
(x) -> x*x
if (x>0) return x*x;
else return 0;
 */
