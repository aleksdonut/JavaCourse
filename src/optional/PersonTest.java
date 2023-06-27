package optional;

import java.util.Optional;

class PersonTest {
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(1, "Jan", "Kowalski"));
        db.add(new Person(2, "Karol", "Zawadzki"));
        db.add(new Person(3, "Bartosz", "Abacki"));
        db.add(new Person(4, "Ania", "Walczak"));

//        Optional<Person> personOpt1 = db.findById(2);
//        personOpt1.ifPresent(PersonTest::printLastName);
//        if (personOpt1.isPresent()) {
//            Person person = personOpt1.get();
//            System.out.println(person.getLastName());
//        }
//        Optional<Person> personOpt2 = db.findById(55);
//        personOpt2.ifPresent(PersonTest::printLastName);
//        personOpt2.ifPresentOrElse(
//                PersonTest::printLastName,
//                () -> System.out.println("There is no person with pointed ID")
//        );
//        if (personOpt2.isPresent()) {
//            System.out.println(personOpt2.get().getLastName());
//        } else {
//            System.out.println("There is no person with ID 55");
//        }

        String lastNameById = db.findLastNameById(55);
        System.out.println(lastNameById);

    }

    private static void printLastName (Person person) {
        System.out.println(person.getLastName());
    }
}
