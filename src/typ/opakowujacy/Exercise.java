package typ.opakowujacy;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise {
    public static void main(String[] args) {
        String fileName = "test.txt";
        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader);
             ) {
            String line = null;
            BigInteger result = BigInteger.ZERO;
            int sum = 0;
            int counter = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (counter >= 3) {
                    BigInteger bigInteger = new BigInteger(line);
                    result = result.add(bigInteger);
                } else {
                    int a = Integer.parseInt(line);
                    sum += a;
                    counter++;
                }
            }
                System.out.println(sum);
                System.out.println(result);
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
