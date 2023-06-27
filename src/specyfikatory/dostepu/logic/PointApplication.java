package specyfikatory.dostepu.logic;

import specyfikatory.dostepu.controller.PointController;
import specyfikatory.dostepu.data.Point;

public class PointApplication {
    public static void main(String[] args) {
        PointController pointController = new PointController();
        Point point = new Point(5,8);
        System.out.println(point.getX());
        System.out.println(point.getY());
        pointController.addX(point);
        System.out.println(point.getX());
        System.out.println(point.getY());
        pointController.minusX(point);
        System.out.println(point.getX());
        System.out.println(point.getY());
        pointController.addY(point);
        System.out.println(point.getX());
        System.out.println(point.getY());
        pointController.minusY(point);
        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}
