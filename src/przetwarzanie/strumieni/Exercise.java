package przetwarzanie.strumieni;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\aleks\\IdeaProjects\\FirstProject\\src\\przetwarzanie\\strumieni\\lorem_ipsum.txt";
        List<String> wordList = new ArrayList<>();
        List<String> wordList2 = new ArrayList<>();
        String s = null;
        int counter = 0;
        int wordLength = 0;
        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader);
        ) {
            while ((s = bufferedReader.readLine()) != null) {
                wordList.addAll(Arrays.asList(s.toLowerCase().split(" ")));
            }
            System.out.println(wordList);
            for (String tmp : wordList) {
                wordList2.add(tmp.replaceAll("[^a-zA-Z0-9]", ""));
            }
            System.out.println(wordList2);
            for (String word : wordList2) {
                if (word.startsWith("s")) {
                    counter++;
                }
                if (word.length() == 5) {
                    wordLength++;
                }
            }
            System.out.println(counter);
            System.out.println(wordLength);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

