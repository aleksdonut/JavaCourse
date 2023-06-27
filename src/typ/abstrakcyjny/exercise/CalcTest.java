package typ.abstrakcyjny.exercise;

import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double h = 0;
        double r = 0;

        while (true) {

            System.out.println("Choose which shape's area or perimeter you want to calculate?");
            String choose = """
                    1 - triangle area
                    2 - triangle perimeter
                    3 - circle area
                    4 - circle perimeter
                    5 - rectangle area
                    6 - rectangle perimeter
                    """;
            System.out.println(choose);
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter base length");
                    a = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter height");
                    h = scanner.nextDouble();
                    Shape triangle = new Triangle(a, h);
                    System.out.println("Area is " + triangle.calculateArea());
                    break;
                case 2:
                    System.out.println("Enter length of first side");
                    a = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter length of second side");
                    b = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter length of third side");
                    c = scanner.nextDouble();
                    scanner.nextLine();
                    Triangle triangle1 = new Triangle(a, b, c);
                    System.out.println("Perimeter is " + triangle1.calculatePerimeter());
                    break;
                case 3:
                    System.out.println("Enter radius of the circle");
                    r = scanner.nextDouble();
                    scanner.nextLine();
                    Shape circle = new Circle(r);
                    System.out.println("Area is " + circle.calculateArea());
                    break;
                case 4:
                    System.out.println("Enter radius of the circle");
                    r = scanner.nextDouble();
                    scanner.nextLine();
                    Shape circle1 = new Circle(r);
                    System.out.println("Perimeter is " + circle1.calculatePerimeter());
                    break;
                case 5:
                    System.out.println("Enter length of first side");
                    a = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter length of second side");
                    b = scanner.nextDouble();
                    scanner.nextLine();
                    Shape rectangle = new Rectangle(a, b);
                    System.out.println("Area is " + rectangle.calculateArea());
                    break;
                case 6:
                    System.out.println("Enter length of first side");
                    a = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter length of second side");
                    b = scanner.nextDouble();
                    scanner.nextLine();
                    Shape rectangle1 = new Rectangle(a, b);
                    System.out.println("Perimeter is " + rectangle1.calculatePerimeter());
                    break;
                default:
                    System.out.println("Bad option, enter value one more time");
                    break;
            }
        }
    }
}
