package klasy.obiekty;

public class Company {
    public static void main(String[] args) {
        Employee employeeOne = new Employee();
        employeeOne.name = "Aleksander";
        employeeOne.lastName = "Nowak";
        employeeOne.yearOfBirth = 1995;
        employeeOne.lengthOfService = 5;
        String employeeOneInfo = employeeOne.name + ", " + employeeOne.lastName + ", " + employeeOne.yearOfBirth + ", " + employeeOne.lengthOfService;

        Employee employeeTwo = new Employee();
        employeeTwo.name = "Krzysztof";
        employeeTwo.lastName = "Kowalski";
        employeeTwo.yearOfBirth = 1980;
        employeeTwo.lengthOfService = 15;
        String employeeTwoInfo = employeeTwo.name + ", " + employeeTwo.lastName + ", " + employeeTwo.yearOfBirth + ", " + employeeTwo.lengthOfService;

        Employee employeeThree = new Employee();
        employeeThree.name = "Jan";
        employeeThree.lastName = "Rodriguez";
        employeeThree.yearOfBirth = 1965;
        employeeThree.lengthOfService = 35;
        String employeeThreeInfo = employeeThree.name + ", " + employeeThree.lastName + ", " + employeeThree.yearOfBirth + ", " + employeeThree.lengthOfService;

        System.out.println(employeeOneInfo);
        System.out.println(employeeTwoInfo);
        System.out.println(employeeThreeInfo);
    }
}
