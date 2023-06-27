package data.czas;

import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Exercise {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to start the timer!");
        scanner.nextLine();
        Instant t1 = Instant.now();
        System.out.println("Press enter to stop the timer");
        scanner.nextLine();
        Instant t2 = Instant.now();
        Duration gap = Duration.between(t1, t2);
        System.out.println(gap.toMinutes() + ":" + gap.getSeconds());
    }
}
