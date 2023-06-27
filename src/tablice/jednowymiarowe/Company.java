package tablice.jednowymiarowe;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[20];
        employees[0] = new Employee("Jan", "Kowalski", 3500);
        employees[1] = new Employee("Kamil", "Nowak", 3700);

        int employeeIndex = 1;
        if (employeeIndex >= 0 && employeeIndex < employees.length) {
            System.out.println(employees[employeeIndex].getFirstName() + " " + employees[employeeIndex].getLastName() + " " + employees[employeeIndex].getSalary());
        }
    }
}
