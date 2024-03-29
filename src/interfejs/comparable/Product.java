package interfejs.comparable;

import java.util.Comparator;

class Product implements Comparable<Product>{
    private String producer;
    private String name;
    private double price;

    public Product(String producer, String name, double price) {
        this.producer = producer;
        this.name = name;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name= " + name + ", producer= " + producer + ", price= " + price + "]";
    }

    @Override
    public int compareTo(Product product) {
        if (this.price > product.price)
            return 1;
        else if (this.price < product.price)
            return -1;
        int producerCompare = producer.compareTo(product.producer);
        if (producerCompare != 0)
            return producerCompare;
        return this.name.compareTo(product.name);
    }

    static public class ProductNameComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }
}
