package mapy;

import java.util.*;

class NotebookStore {
    public static void main(String[] args) {
        Map<String, Integer> people = Map.of("Jan",12345, "Karol", 23456, "Zofia", 34567);
        System.out.println(people);
//        Map<Notebook, Integer> notebooks = new HashMap<>();
//        notebooks.put(new Notebook("Lenovo", "B590"), 12);
//        notebooks.put(new Notebook("Dell", "Inspirion0211A"), 3);
//        notebooks.put(new Notebook("HP", "G2A33EA"), 8);
//        notebooks.put(new Notebook("HP", "G2A33EA"), 5);
//        notebooks.put(new Notebook("Dell", "XPS0091V"), 6);
//
//        Set<Map.Entry<Notebook, Integer>> entries = notebooks.entrySet();
//        for (Map.Entry<Notebook, Integer> entry : entries) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

//        linkedHashMap - zachowuje kolejność dodania;
//        treemap - sortuje na podstawie kluczy;

//        String key = "G2A33EA";
//        Notebook notebook = notebooks.get(key);
//        System.out.println(notebook);
//        notebooks.remove("B590");
//        System.out.println(notebooks);
//        Collection<Notebook> values = notebooks.values();
//        System.out.println(values);

//        Set<String> keys = notebooks.keySet();
//        for (String key : keys) {
//            System.out.println(key + ":" + notebooks.get(key));
//        }

//        Set<Map.Entry<String, Notebook>> entries = notebooks.entrySet();
//        for (Map.Entry<String, Notebook> entry : entries) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
    }
}
