package metody;

public class MetricUnitsConverter {
    double metreToCentimetre (double x) {
        return x * 100;
    }
    double metreToMillimetre (double x) {
        return x * 1000;
    }
    double centimetreToMetre (double x) {
        return x / 100;
    }
    double millimetreToMetre (double x) {
        return x / 1000;
    }
}
