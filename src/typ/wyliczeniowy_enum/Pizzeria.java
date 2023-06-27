package typ.wyliczeniowy_enum;

import java.util.Scanner;

class Pizzeria {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("Choose one of the below pizzas: ");
            Pizza[] pizzas = Pizza.values();
            for (int i = 0; i < pizzas.length; i++) {
                System.out.println(pizzas[i].toString());
            }
            Scanner scanner = new Scanner(System.in);
            String pizza = scanner.nextLine();
            System.out.println("You've chosen pizza " + pizza + ". Is it correct? Write YES or NO");
            String userInput = scanner.nextLine();
            if (userInput.equals("YES")) {
                flag = false;
                scanner.close();
            }
        }
    }

}
