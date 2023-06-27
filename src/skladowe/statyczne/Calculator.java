package skladowe.statyczne;

import static java.lang.Math.pow;

class Calculator {

    static final double PI = Math.PI;
    //Do zmiennej stałej odwołujemy się poprzez klasę a nie obiekt klasy w której się znajduje

    static double circleArea(double r) {
        return PI * pow(r, 2);
    }

    static double circlePerimeter(double r) {
        return 2 * PI * r;
    }
}
