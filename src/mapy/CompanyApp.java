package mapy;

import java.util.Scanner;

public class CompanyApp {
    public final static int ADD_EMPLOYEE = 1;
    public final static int SEARCH_FOR_EMPLOYEE = 2;
    public static void main(String[] args) {
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);
        boolean operator = true;
        while (operator) {
            int choose = menu();
            switch (choose) {
                case 1 -> company.addEmployee();
                case 2 -> {
                    System.out.println("Enter first and last name: ");
                    String employee = scanner.nextLine();
                    System.out.println(company.infoAboutEmployee(employee));
                }
                default -> {
                    scanner.close();
                    operator = false;
                }
            }
        }

    }

    public static int menu () {
        System.out.println(ADD_EMPLOYEE + " - add employee");
        System.out.println(SEARCH_FOR_EMPLOYEE + " - search for employee");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        scanner.nextLine();
        return choose;
    }
}
