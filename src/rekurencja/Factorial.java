package rekurencja;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(numberFactorial(10));
    }

    private static int numberFactorial(int n) {
        return n > 1 ? n * numberFactorial(n-1) : 1;
    }
}
