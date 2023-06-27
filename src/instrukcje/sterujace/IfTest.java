package instrukcje.sterujace;

public class IfTest {
    public static void main(String[] args) {
        int a = 40;
        boolean aPositive = a > 0;
        boolean aEven = a % 2 == 0;

        if (aPositive && aEven) {
            System.out.println("A jest liczba parzysta i dodatnia");
        } else if (aPositive) {
            System.out.println("A jest liczba dodatnia");
        } else if (aEven) {
            System.out.println("A jest liczba parzysta");
        } else {
            System.out.println("Liczba A nie jest ani dodatnia ani parzysta");
        }
    }
}
