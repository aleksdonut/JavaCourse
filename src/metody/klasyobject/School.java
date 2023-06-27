package metody.klasyobject;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Jan Kowalski", 25);
        Student student2 = new Student("Jan Kowalski", 25);
        Student student3 = new Student("Marta Zawadzka", 33);

        System.out.println(student1.toString());


//        System.out.println(student1.hashCode());
//        System.out.println(student2.hashCode());
//        System.out.println(student3.hashCode());
//
//        System.out.println(student1.equals(student2));
//
//        String string1 = "FB";
//        String string2 = "Ea";
//
//        System.out.println(string1.equals(string2));
//        System.out.println(string1.hashCode());
//        System.out.println(string2.hashCode());
    }
}
