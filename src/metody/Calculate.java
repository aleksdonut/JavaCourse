package metody;

public class Calculate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double x = 5.0;
        double y = 10.0;
        System.out.println(calculator.add(x,y));
        System.out.println(calculator.subtract(x,y));
        System.out.println(calculator.multiply(x,y));
        System.out.println(calculator.divide(x,y));
    }
}
