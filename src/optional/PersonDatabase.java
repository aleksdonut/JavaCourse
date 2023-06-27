package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class PersonDatabase {
    private List<Person> people = new ArrayList<>();

    void add(Person person) {
        if (person == null) {
            throw new NullPointerException("Can't add null reference");
        }
        findById(person.getId()).ifPresent(p -> {
            throw new IllegalArgumentException("Object already exist");
        });
//        Optional.ofNullable(person).ifPresentOrElse(
//                person1 -> findById(person1.getId()).ifPresent(
//                        person2 -> {
//                            throw new IllegalArgumentException("Object already exist");
//                        }),
//                () -> {
//                    throw new NullPointerException("Can't add null reference");
//                }
//        );
        people.add(person);
    }

    Optional<Person> findById (int id) {
        for (Person person : people) {
            if (person.getId() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    String findLastNameById (int id) {
        return findById(id)
                .map(Person::getLastName)
                .orElse("Anonymous");
    }
}
