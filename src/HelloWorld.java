public class HelloWorld {
    public static void main(String[] args) {
        int age = 25;
        boolean selection = true;
        char initialName = 'J';
        char initialSurname = 'K';
        System.out.println("Czesc Jan, slyszalem, ze masz " + age + " lat i uczysz się programowania. Czy to prawda?");
        System.out.println(selection);
        System.out.println("Czy Twoje inicjaly to " + initialName + " " + initialSurname);
        System.out.println("Tak, " + selection);

        System.out.println("Mam Audi A4");
        System.out.print("Rocznik: ");
        System.out.println("2004");
        System.out.print("Silnik o pojemnosci: ");
        System.out.println("2.0");

        String carBrand = "Mercedes-Benz";
        String carModel = "GLE Coupe 63S AMG";
        int yearOfProduction = 2022;
        double price = 899000.0;
        System.out.println("This is " + carBrand + " " + carModel + ". Produced in " + yearOfProduction + ". Excercises.Car costs " + price + ".");

        int x = 5;
        int y = 10;
        System.out.println(x > y);
        System.out.println(x * 2 > y);
        System.out.println(x + 3 < y && y > x - 2);
        System.out.println(x * y % 2);

        System.out.println("This is a fucking test how it is to write on stand desk. Pretty cool! Thanks for watching subscribe, drop a like, leave a comment!");
        System.out.println("Work area is so big, I think it will be very hard to get a dirty desk. Think so that 140 per 80 will be enough, but we will se it when I buy a monitor.");
        System.out.println("How about monitor? It will be a 34 inch monitor, brand by Huawei.");
    }
}
