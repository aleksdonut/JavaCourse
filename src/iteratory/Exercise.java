package iteratory;

import java.util.*;

class Exercise {
    public static void main(String[] args) {
        Map<String, Person> people = new TreeMap<>();
        Person person1 = new Person("Jan", "Kowalski", 25);
        Person person2 = new Person("Adam", "Abacki", 15);
        Person person3 = new Person("Marek", "Markowski", 35);
        people.put(person1.getLastName(), person1);
        people.put(person2.getLastName(), person2);
        people.put(person3.getLastName(), person3);

        Set<Map.Entry<String, Person>> entries = people.entrySet();
        for (Map.Entry<String, Person> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
