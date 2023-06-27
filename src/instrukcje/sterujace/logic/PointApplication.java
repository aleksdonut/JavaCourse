package instrukcje.sterujace.logic;

import specyfikatory.dostepu.controller.PointController;
import specyfikatory.dostepu.data.Point;

import java.util.Scanner;

public class PointApplication {
    public static void main(String[] args) {
        PointController pointController = new PointController();
        Point point = new Point(5, 8);

        System.out.println("Program to move a point with coordinates " + point.getX() + ";" + point.getY());
        System.out.println("0 - end the program");
        System.out.println("1 - Move point right");
        System.out.println("2 - Move point up");
        System.out.println("3 - Move point left");
        System.out.println("4 - Move point down");
        System.out.println("Enter your option: ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();


        switch (option) {
            case "0":
                System.out.println("End of program!");
                break;
            case "1":
                pointController.addX(point);
                System.out.println("New point coordinates: " + point.getX() + ";" + point.getY());
                break;
            case "2":
                pointController.addY(point);
                System.out.println("New point coordinates: " + point.getX() + ";" + point.getY());
                break;
            case "3":
                pointController.minusX(point);
                System.out.println("New point coordinates: " + point.getX() + ";" + point.getY());
                break;
            case "4":
                pointController.minusY(point);
                System.out.println("New point coordinates: " + point.getX() + ";" + point.getY());
                break;
            default:
                System.out.println("Wrong option!");
        }
    }
}
