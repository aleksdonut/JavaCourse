package listy;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class NumbersSum {
    static StringBuilder stringBuilder = new StringBuilder();
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean operator = true;
        while (operator) {
            try {
                System.out.println("Enter decimal number or exit to finish");
                Integer scannedNumber = scanner.nextInt();
                    numbersList.add(scannedNumber);
                    if (numbersList.size() == 1) {
                        System.out.println(numbersList.get(0) + " = " + numbersList.get(0));
                    } else if (numbersList.size() == 2) {
                        numbersList.add(numbersList.get(0) + numbersList.get(1));
                        System.out.println(numbersList.get(0) + " + " + numbersList.get(1) + " = " + numbersList.get(2));
                    } else {
                        System.out.println(printResult(numbersList));
                        stringBuilder.delete(0, stringBuilder.length());
                    }
                } catch (InputMismatchException e) {
                operator = false;
            }
        }
    }

    public static String printResult (List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        list.add(sum);
        for (int i = 0; i < list.size()-1; i++) {
            if (i == list.size()-2) {
                stringBuilder.append(list.get(i));
            } else {
                stringBuilder.append(list.get(i)).append(" + ");
            }
        }
        String numbers = stringBuilder.toString();
        return numbers + " = " + list.get(list.size()-1);
    }
}
