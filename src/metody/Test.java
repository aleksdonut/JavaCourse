package metody;

public class Test {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int result1 = calc.addTwoNumbers(5, 10);
        int result2 = calc.addTwoNumbers(50, 10);
        int result3 = calc.addTwoNumbers(33,164);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        calc.addAndPrint(5,10);
    }
}
