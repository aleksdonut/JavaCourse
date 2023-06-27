package zbiory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

class Exercise {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\aleks\\Downloads\\namespl.txt";
        TreeSet<String> namesSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                return -string1.compareTo(string2);
            }
        });

        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader);
        ) {
            while (bufferedReader.readLine() != null) {
                namesSet.add(bufferedReader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Names: " + namesSet);
        System.out.println("First name: " + namesSet.first());
        System.out.println("Last name: " + namesSet.last());
    }
}
