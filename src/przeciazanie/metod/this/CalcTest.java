package przeciazanie_metod_this;

public class CalcTest {
    public static void main(String[] args) {
        przeciazanie_metod_this.Calculator calculator = new przeciazanie_metod_this.Calculator();

        System.out.println(calculator.addTwoNumbers(5,5));
        System.out.println(calculator.addThreeNumbers(5,5,5));
        System.out.println(calculator.subtractTwoNumbers(10,5));
        System.out.println(calculator.subtractThreeNumbers(25,15,5));
    }
}
