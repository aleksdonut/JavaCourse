package operacje.na.tablicach;

import java.util.Arrays;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        boolean operator = true;
        Scanner scanner = new Scanner(System.in);
        PersonDatabase personDatabase = new PersonDatabase();
        while (operator) {
            System.out.println("1 - Add person");
            System.out.println("2 - Remove person");
            System.out.println("3 - Show ID of person");
            System.out.println("4 - Show people in table");
            System.out.println("5 - Show number of people in table");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Enter PESEL number: ");
                    String peselNumber = scanner.nextLine();
                    personDatabase.add(new Person(firstName, lastName, peselNumber));
                    break;
                case 2:
                    System.out.println("Which person you want to remove from table?");
                    System.out.println("Enter first name: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    Person person = personDatabase.get(number);
                    personDatabase.remove(person);
                    break;
                case 3:
                    System.out.println("Enter a number of person which you want to show ID: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(personDatabase.get(index));
                    break;
                case 4:
                    printArray(personDatabase.people);
                    break;
                case 5:
                    System.out.println(personDatabase.size());
                    break;
                default:
                    scanner.close();
                    operator = false;
            }
        }
    }

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}
