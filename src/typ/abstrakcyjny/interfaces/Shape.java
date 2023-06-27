package typ.abstrakcyjny.interfaces;

interface Shape {

    double PI = 3.14;
    double calculateArea();
    double calculatePerimeter();

    default String getData() {
        return calculateArea() + " " + calculatePerimeter();
    }
}
