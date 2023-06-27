package klasy.string;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("How many words do you want to upload?");
        Scanner scanner = new Scanner(System.in);
        int numberOfWords = scanner.nextInt();
        scanner.nextLine();

        System.out.println("It's time to upload your words!");
        String[] words = new String[numberOfWords];
        for (int i = 0; i <= numberOfWords-1; i++) {
            words[i] = scanner.nextLine();
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i].substring(words[i].length()-1));
        }
        String outputString = stringBuilder.toString();
        System.out.printf("Output result is %s", outputString);
    }
}
