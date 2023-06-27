package operacje.na.plikach.exercise;

import java.util.Scanner;

public class Company {
    public static final int MAX_EMPLOYEES = 3;
    private int counter = 0;
    Employee[] employees = new Employee[MAX_EMPLOYEES];

    public void addEmployee (Employee employee) {
        employees[counter] = employee;
        counter++;
        System.out.println("Employee successfully added");
    }

    public Employee createEmployee () {
        if (counter < MAX_EMPLOYEES) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first name: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter salary: ");
            int salary = scanner.nextInt();
            scanner.nextLine();
            return new Employee(firstName, lastName, salary);
        }
        return null;
    }
}
