package typ.abstrakcyjny.exercise;

class Circle implements Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * r;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(r, 2);
    }
}
