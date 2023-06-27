package iteratory;

import java.util.*;

class IteratorExample {
    public static void main(String[] args) {
        //hasNext() - czy jest nastepny obiekt?
        //next() - pobranie następnego obiektu
        //remove() - usuwanie wybranego obiektu

//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(45);
//        numbers.add(3);
//        numbers.add(21);
//        numbers.add(150);
//        numbers.add(1);
//
//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        List<String> names = new ArrayList<>();
        names.add("Kasia");
        names.add("Kasia");
        names.add("Basia");
        names.add("Basia");
        names.add("Basia");
        names.add("Kajtek");
        names.add("Wojtek");
        names.add("Maniek");

//        System.out.println(">>>Loop 1<<<");
//        for (int i = 0; i < names.size(); i++) {
//            String name = names.get(i);
//            System.out.println(name);
//            if (name.equals("Basia")) {
//                names.remove("Basia");
//                i--;
//            }
//        }
//        System.out.println(names);

        System.out.println(">>>Loop 2<<<");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            if (name.equals("Kasia")) {
                iterator.remove();
            }
        }
        System.out.println(names);

//        System.out.println(">>>Loop 3<<<");
//        for (String name : names) {
//            System.out.println(name);
//            if (name.equals("Kasia")) {
//                names.remove("Kasia");
//            }
//        }
    }
}
