package typ.abstrakcyjny.interfaces;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 10);

        System.out.println(circle.getData());
        System.out.println(rectangle.getData());

        System.out.println(StringUtils.reverseString("abc"));
    }
}
