package kolejki;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    public static final int ADD = 1;
    public static final int GET = 2;
    public static final int EXIT = 3;

    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        Queue<Task> tasks = new PriorityQueue<>();

        while (flag) {
            System.out.println("Enter number of option: 1 - add task, 2 - get highest priority task, 3 - exit");
            int operator = scanner.nextInt();
            scanner.nextLine();
            System.out.println(tasks);
            switch (operator) {
                case ADD -> tasks.add(addTask());
                case GET -> System.out.println(tasks.poll().toString());
                case EXIT -> {
                    scanner.close();
                    flag = false;
                }
            }
        }
    }

    public static Task addTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name");
        String name = scanner.nextLine();
        System.out.println("Enter something about task");
        String description = scanner.nextLine();
        System.out.println("Enter priority of task: Low, Medium, High");
        String priority = scanner.nextLine();
        return new Task(name, description, Priority.fromDescription(priority));
    }
}
