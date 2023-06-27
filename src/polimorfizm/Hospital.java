package polimorfizm;

class Hospital {
    private static int MAX_PERSONS = 100;
    Person[] persons = new Person[MAX_PERSONS];
    private static int OCCUPIED_WORKPLACES = 0;

    public void addPerson(Person person) {
        persons[OCCUPIED_WORKPLACES] = person;
        OCCUPIED_WORKPLACES++;
    }

    public void getInfo() {
        for (int i = 0; i<OCCUPIED_WORKPLACES; i++) {
            if (persons[i] instanceof Doctor) {
                System.out.println(((Doctor)persons[i]).getInfo());
            } else if (persons[i] instanceof Nurse) {
                System.out.println(((Nurse)persons[i]).getInfo());
            }
        }
    }
}
