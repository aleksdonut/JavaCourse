package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class PersonOperators {
    public static void main(String[] args) {
        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniowski"};
        int[] ages = {22, 33, 44, 55};
        Random random = new Random();
        Supplier<Person> supplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };

        List<Person> people = generateRandomList(5, supplier);

        System.out.println(">>>1<<<");
        consumeList(people, p -> System.out.println(p));
        System.out.println(">>>2<<<");
        consumeList(people, person -> person.setAge(person.getAge() + 1));
        consumeList(people, p -> System.out.println(p));
        System.out.println(">>>3<<<");
        List<Person> adults = filterByPredicate(people, person -> person.getAge() >= 18);
        consumeList(adults, p -> System.out.println(p));

        System.out.println(">>>4<<<");
        List<Person> janPeople = filterByPredicate(people, person -> "Jan".equals(person.getFirstName()));
        consumeList(janPeople, p -> System.out.println(p));

        System.out.println(">>>5<<<");
        List<String> firstNames1 = convertList(people, person -> person.getFirstName());
        consumeList(firstNames1, p -> System.out.println(p));
    }

    private static <T> List<T> generateRandomList (int elements, Supplier<T> supplier) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            result.add(supplier.get());
        }
        return result;
    }

    private static <T, R> List<R> convertList(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            R result = function.apply(t);
            resultList.add(result);
        }
        return resultList;
    }


    private static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
