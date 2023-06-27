package petle;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = 500;
        int userInput;

        System.out.println("Guess the number");
        while((userInput = scanner.nextInt()) != number) {
            if (userInput > number) {
                System.out.println("Number is to big");
            }
            else {
                System.out.println("Number is to small");
            }
        }

        System.out.println("Congratulations, you have guessed the number");
        scanner.close();

        do {
            System.out.println("Guess the number");
            userInput = scanner.nextInt();
            if (userInput > number){
                System.out.println("Number is to big");
            }
            else {
                System.out.println("Number is to small");
            }
        } while (userInput != number);

        System.out.println("Congratulations, you have guessed the number");
        scanner.close();
    }
}
