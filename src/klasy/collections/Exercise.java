package klasy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Exercise {
    public static void main(String[] args) {
        List<Integer> numbers = generate();
        randomize(numbers);
        int counter = checkResult(numbers);
        System.out.println("Liczba trafionych: " + counter);
    }

    private static List makeList() {
        List<Integer> tmp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter six numbers");
        int operator = 6;
        while (operator > 0) {
            tmp.add(scanner.nextInt());
            operator--;
        }
        return tmp;
    }
    private static int checkResult(List<Integer> list) {
        int sum = 0;
        List<Integer> tmp = makeList();
        for (int i = 0; i < tmp.size(); i++) {
            for (int j = 0; j < list.size()-42; j++) {
                if (tmp.get(i).equals(list.get(j))) {
                    sum++;
                }
            }
        }
        return sum;
    }

    private static void randomize(List<Integer> list) {
        Collections.shuffle(list);
    }

    private static List<Integer> generate() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            list.add(i);
        }
        return list;
    }
}
