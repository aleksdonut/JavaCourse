package typ.opakowujacy;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        double a = 0.7;
        double b = 0.3;
        System.out.println(a-b);

        BigInteger bigInteger = new BigInteger("999999999999999999999999999999999999999999999999999999999999999999999");
        BigInteger bigInteger1 = new BigInteger("555555555555555555555555555555555");
        BigInteger result = bigInteger.add(bigInteger1);
        System.out.println(result);

        BigDecimal bigDecimal = new BigDecimal(a);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(b);
        BigDecimal result1 = bigDecimal.subtract(bigDecimal1);
        System.out.println(result1);
    }
}
