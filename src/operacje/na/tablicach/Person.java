package operacje.na.tablicach;

class Person {
    private String firstName;
    private String lastName;
    private String peselNumber;

    public Person(String firstName, String lastName, String peselNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselNumber = peselNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public void setPeselNumber(String peselNumber) {
        this.peselNumber = peselNumber;
    }

    public void equals(Person person1, Person person2) {
        if (person1.equals(person2)) {
            System.out.println("They are the same people");
        } else {
            System.out.println("People are different");
        }
    }

    public String toString() {
        return "Person: " + firstName + " " + lastName + ", PESEL: " + peselNumber;
    }
}
