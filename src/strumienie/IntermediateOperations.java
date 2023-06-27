package strumienie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
//        Stream<Course> courses = Stream.of(
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
//                new Course(3L, "Zarządzanie zespołem", 159, "Biznes"),
//                new Course(4L, "Tajniki Google", 299, "Marketing"),
//                new Course(5L, "Python od podstaw", 169, "Programowanie")
//        );

//        Stream<Course> expensiveCourses = courses.filter(x -> x.getPrice() < 200);
//        expensiveCourses.forEach(System.out::println);

//        Course[] cheapCourses = {
//                new Course(1L, "Java", 49, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 79, "Rozwój osobisty")
//        };
//
//        Course[] expensiveCourses = {
//                new Course(3L, "Zarządzanie zespołem", 299, "Biznes"),
//                new Course(4L, "Tajniki Google", 169, "Marketing")
//        };
//
//        Stream.of(cheapCourses, expensiveCourses)
//                .flatMap(Arrays::stream)
//                .forEach(System.out::println);

//        List<Integer> collect = IntStream.iterate(0, n -> n + 1)
//                .limit(100)
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(collect);

//        Stream<Course> courses = Stream.of(
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(4L, "Tajniki Google", 299, "Marketing"),
//                new Course(1L, "Java", 249, "Programowanie")
//        );
//
//        Stream<Course> distinct = courses.distinct();
//        distinct.forEach(System.out::println);

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Zarządzanie zespołem", 159, "Biznes"),
                new Course(4L, "Tajniki Google", 299, "Marketing"),
                new Course(5L, "Java od podstaw", 169, "Programowanie")
        );

//        List<String> javaTitles = courses.map(Course::getName)
//                .filter(name -> name.toLowerCase().contains("java"))
//                .collect(Collectors.toList());
//        System.out.println(javaTitles);

//        Stream<Course> sorted = courses.sorted(Comparator.comparingDouble(Course::getPrice));
//        sorted.forEach(System.out::println);

//        List<String> javaTitles = courses
//                .filter(c -> c.getName().toLowerCase().contains("java"))
//                .peek(course -> System.out.println("Filtered stream: " + course))
//                .map(Course::getName)
//                .collect(Collectors.toList());
//        System.out.println(javaTitles);

        courses
                .sorted(Comparator.comparingDouble(Course::getPrice))
                .skip(3)
                .forEach(System.out::println);

    }
}
