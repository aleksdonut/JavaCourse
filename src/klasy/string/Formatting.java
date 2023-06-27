package klasy.string;

class Formatting {
    public static void main(String[] args) {
        //%[index_argumentu$][flagi][szerokość][.precyzja]konwersja
        String firstName = "Aleksander";
        String lastName = "Quaiok";
        int age = 25;
        char gender = 'M';
        double height = 189.0;

        //%b - boolean
        //%c - char
        //%d - decimal
        //%f - float
        //%s - String

        System.out.println(firstName + " " + lastName + " " + age + " " + gender + " " + height);

        System.out.printf("Name: %s, surname: %s, age: %d, gender: %c, height: %f%n", firstName, lastName, age, gender, height);
        System.out.printf("Name: %2$s, surname: %3$s, age: %4$d, gender: %5$c, height: %1$f%n", height, firstName, lastName, age, gender);

        String format = "Name: %s, surname: %s, age: %d, gender: %c, height: %f%n";
        String output = String.format(format, firstName, lastName, age, gender, height);
        String format1 = "Name: %s, surname: %s, age: %d, gender: %c, height: %f%n";
        String output1 = format1.formatted(firstName, lastName, age, gender, height);
        System.out.println(output);
        System.out.println(output1);

        System.out.println("This is the end");

        double number = 123.4567890;
        System.out.printf("%.2f", number);

        int number1 = 123;
        System.out.printf("%5d%n", number1);
        double number2 = 123.456;
        System.out.printf("%10.2f%n", number2);
        String name1 = "Jan";
        System.out.printf("%10s%n", name1);

        double positiveNumber = 123.4567890;
        System.out.printf("%+.2f%n", positiveNumber);

        double negativeNumber = -1.234;
        System.out.printf("%(010.2f%n", negativeNumber);

        int bigNumber = 123456789;
        System.out.printf("%,d%n", bigNumber);

        String name2 = "Anna";
        String name3 = "Kazimierz";
        int age1 = 22;
        int age2 = 33;
        System.out.printf("%-20s%s%n", "Name", "Age");
        System.out.printf("%-20s%s%n", name2, age1);
        System.out.printf("%-20s%s%n", name3, age2);

    }
}
