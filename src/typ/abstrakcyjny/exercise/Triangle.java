package typ.abstrakcyjny.exercise;

class Triangle implements Shape {
    double a;
    double b;
    double c;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return (a * h) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
