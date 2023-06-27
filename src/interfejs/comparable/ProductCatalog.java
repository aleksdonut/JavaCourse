package interfejs.comparable;

import java.util.Arrays;
import java.util.Comparator;

class ProductCatalog {
    public static void main(String[] args) {
//        Product product1 = new Product("Knorr", "Racuchy", 7.20);
//        Product product2 = new Product("Amino", "Zupa ogórkowa", 3.90);
//        System.out.println(product1.compareTo(product2));

        Product[] products = new Product[7];
        products[0] = new Product("Knorr", "Placki ziemniaczane", 6.40);
        products[1] = new Product("Knorr", "Racuchy", 7.20);
        products[2] = new Product("Winiary", "Zupa pomidorowa", 4.20);
        products[3] = new Product("Winiary", "Zupa pieczarkowa", 4.10);
        products[4] = new Product("Winiary", "Rosół", 3.60);
        products[5] = new Product("Amino", "Zupa pomidorowa", 3.90);
        products[6] = new Product("Amino", "Zupa ogórkowa", 3.90);

        System.out.println("Nieposortowane");
        for (Product p : products) {
            System.out.println(p);
        }

        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getProducer().compareTo(p2.getProducer());
            }
        });
        System.out.println("Posortowane");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
