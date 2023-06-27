package strumienie;

import java.nio.charset.CoderResult;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class TerminalOperations {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 399, "Marketing")
        );

        Double reduce = courses.map(Course::getPrice).reduce(0.0, Double::sum);
        System.out.println(reduce);

//        courses.forEach(System.out::println);
//        long count = courses.count();
//        System.out.println(count);

//        Optional<Course> cheapestCourse = courses.min(Comparator.comparingDouble(Course::getPrice));
//        cheapestCourse.ifPresent(System.out::println);

//        boolean courseUnder100 = courses.anyMatch(course -> course.getPrice() < 100);
//        System.out.println(courseUnder100);

        //allMatch - wszystkie spełniają kryterium
        //noneMatch - żaden nie spełnia warunku kryterium

//        Course[] coursesArray = courses.toArray(Course[]::new);
//        System.out.println(Arrays.toString(coursesArray));

//        List<Course> collect = courses.collect(Collectors.toList());
//        System.out.println(collect);
//        Set<Course> collect1 = courses.collect(Collectors.toSet());

//        TreeSet<Course> collect = courses.collect(Collectors.toCollection(TreeSet::new));

//        Stream<String> names = Stream.of("Ania", "Kasia", "Basia");
//        String reduce = names.reduce("", String::concat);
//        System.out.println(reduce);

    }
}
