package klasy.collections;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class CollectionOperation {
    public static void main(String[] args) {
        String sentence = "Strona testowa służy dwóm celom: stanowi wizualne potwierdzenie "
                + "działania drukarki i może również zawierać informacje pomocne podczas "
                + "rozwiązywania problemów, takie jak szczegóły dotyczące sterownika drukarki.";

        List<String> words = Arrays.asList(sentence.split(" "));
        System.out.println(">>>1<<<");
        printCollection(words);

        System.out.println(">>>2<<<");
        Collections.shuffle(words);
        printCollection(words);

        System.out.println(">>>3<<<");
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        printCollection(words);

        System.out.println(">>>4<<<");
        System.out.println(Collections.binarySearch(words, "drukarki"));

        System.out.println(">>>5<<<");
        System.out.println(Collections.frequency(words, "Strona"));

        System.out.println(">>>6<<<");
        System.out.println(Collections.min(words, String.CASE_INSENSITIVE_ORDER));

        System.out.println(">>>7<<<");
        System.out.println(Collections.max(words, String.CASE_INSENSITIVE_ORDER));
    }

    private static void printCollection(List<String> collection) {
        for (String s : collection) {
            System.out.print(s + "; ");
        }
        System.out.println();
    }
}
