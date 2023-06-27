package mapy;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Company {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, Employee> employees = new HashMap<>();

    public void addEmployee () {
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter person's salary: ");
        String salary = scanner.nextLine();
        Employee employee = new Employee(firstName, lastName, salary);
        String firstAndLastName = employee.getFirstName() + " " + employee.getLastName();
        if (employees.containsKey(firstAndLastName)) {
            System.out.println("Can not add, person exist!");
        } else {
            employees.put(firstAndLastName, employee);
        }
    }

    public String infoAboutEmployee (String employee) {
        Set<String> keySet = employees.keySet();
        for (String s : keySet) {
            if (s.equals(employee)) {
                return employees.get(s).toString();
            }
        }
        return null;
    }
}
