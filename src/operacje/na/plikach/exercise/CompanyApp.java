package operacje.na.plikach.exercise;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        String fileName = "employees.obj";
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose option");
            System.out.println("1 - add employee, 2 - save employees list to file, 3 - read employees list from file");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    try {
                        Employee employee = company.createEmployee();
                        company.addEmployee(employee);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("A new employee can not be recruited");
                    }
                    break;
                case 2:
                    try (var fileOutputStream = new FileOutputStream(fileName);
                         var objectOutputStream = new ObjectOutputStream(fileOutputStream)
                    ) {
                        objectOutputStream.writeObject(company.employees);
                        System.out.println("Employees list saved!");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try (var fileInputStream = new FileInputStream(fileName);
                         var objectInputStream = new ObjectInputStream(fileInputStream)
                    ) {
                        company.employees = (Employee[]) objectInputStream.readObject();
                        for (int i = 0; i < company.employees.length; i++) {
                            System.out.println(company.employees[i].getFirstName() + " " + company.employees[i].getLastName() + " " + company.employees[i].getSalary());
                        }
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }
}
