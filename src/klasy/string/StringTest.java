package klasy.string;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Ania";
        String str2 = "Ania";
        System.out.println("str1 == str2" + (str1 == str2));
        System.out.println("str1.equals(str2)"+str1.equals(str2));

//        String s1 = new String("Ania");
//        String s2 = new String("Ania");
//        System.out.println("s1 == s2" + (s1 == s2));
//        System.out.println("s1.equals(s2)"+s1.equals(s2));

        StringBuilder stringBuilder = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        String numbers = stringBuilder.toString();
        System.out.println(numbers);
        long time = System.nanoTime() - start;
        System.out.println(time);

        String words = " One two three four five ";
        System.out.println(words);
        String s1 = words.substring(1,5);
        System.out.println(s1);
        String s2 = words.replaceAll("two", "hello");
        System.out.println(s2);
        String s3 = words.trim();
        System.out.println(s3);
        char s4 = words.charAt(2);
        System.out.println(s4);
        System.out.println(words.toUpperCase());
        System.out.println(words.toLowerCase());
        System.out.println(words.length());
        String[] s5 = words.trim().split(" ");
        System.out.println(Arrays.toString(s5));
    }
}
