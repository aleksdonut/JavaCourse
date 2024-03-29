package referencje.metod;

import java.util.List;
import java.util.function.Consumer;

class ComputerMethods {
    public static void main(String[] args) {
        List<Computer> computers = List.of(
                new Computer("Lenovo", 3000, 45),
                new Computer("HP", 3200, 66),
                new Computer("Apple", 3400, 78),
                new Computer("Asus", 2800, 42));

        consume(computers, c -> Computer.overclock(c));
        consume(computers, ComputerMethods::printComputerWithTemperature);
    }

    private static void printComputerWithTemperature(Computer computer) {
        String text = computer.getName() + " " + computer.getCpu();
        if (computer.getTemperature() < 50)
            text += " / cold";
        else
            text += " / hot";

        System.out.println(text);
    }

    private static void consume(List<Computer> computers, Consumer<Computer> consumer) {
        for (Computer computer : computers) {
            consumer.accept(computer);
        }
    }
}
