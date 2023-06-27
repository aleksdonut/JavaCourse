package zbiory;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
//        HashSet<Integer> integers = new HashSet<>();
//        integers.add(5);
//        integers.add(10);
//        integers.add(15);
//        integers.add(20);

//        HashSet<String> strings = new HashSet<>();
//        strings.add("AA");
//        strings.add("BB");
//        strings.add("CC");
//        System.out.println(strings);
//        System.out.println("AA".hashCode());
//        System.out.println(strings.contains("CC"));
//        strings.remove("BB");
//        System.out.println(strings.size());

//        TreeSet<Integer> integers = new TreeSet<>();
//        integers.add(2);
//        integers.add(2);
//        integers.add(1);
//        integers.add(3);
//        integers.add(5);
//        integers.add(3);
//        System.out.println(integers);
//        System.out.println(integers.size());
//        System.out.println(integers.first());
//        System.out.println(integers.last());
//        System.out.println(integers.contains(4));
//        System.out.println(integers.contains(5));

//        TreeSet<Person> people = new TreeSet<>();
//        people.add(new Person("Jan", "Kowalski"));
//        people.add(new Person("Ania", "Kawalec"));
//        people.add(new Person("Szymon", "Zalewski"));
//        System.out.println(people);
//        System.out.println(people.size());
//        System.out.println(people.first());
//        System.out.println(people.last());
//        System.out.println(people.contains(new Person("Jan", "Kowalski")));

//        Set<Person> people = new TreeSet<>();
//        people.add(new Person("Jan", "Kowalski"));
//        people.add(new Person("Ania", "Kawalec"));
//        people.add(new Person("Szymon", "Zalewski"));
//        System.out.println(people);
//        System.out.println(people.size());
//        if (people instanceof TreeSet)
//            System.out.println(((TreeSet)people).first());
//        if (people instanceof TreeSet)
//            System.out.println(((TreeSet)people).last());
//        System.out.println(people.contains(new Person("Jan", "Kowalski")));

        Set<String> names = Set.of("Marek", "Kasia", "Karol", "Basia");
        System.out.println(names);

    }
}
