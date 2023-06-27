package operacje.na.tablicach;

import java.util.Arrays;

class PersonDatabase {
    private static final int SIZE = 1;
    Person[] people = new Person[SIZE];
    int emptyPlace = 0;

    public void add(Person person) {
        try {
            people[emptyPlace] = person;
            emptyPlace++;
            if (emptyPlace == people.length) {
                people = Arrays.copyOf(people, people.length*2);
            }
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void remove(Person person) {
        Person[] tmp = new Person[people.length];
        try {
            for (int i = 0, j = 0; i < people.length; i++) {
                if (!(person.equals(people[i]))) {
                    tmp[j] = people[i];
                    j++;
                }
            }
            people = Arrays.copyOf(tmp, tmp.length);
            emptyPlace--;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public Person get(int index) throws ArrayIndexOutOfBoundsException{
        return new Person(people[index].getFirstName(), people[index].getLastName(), people[index].getPeselNumber());
    }

    public int size() {
        int counter = 0;
        for (Person p : people) {
            if (p != null)
                counter++;
        }
        return counter;
    }
}
