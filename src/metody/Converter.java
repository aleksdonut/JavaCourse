package metody;

public class Converter {
    public static void main(String[] args) {
        MetricUnitsConverter muc = new MetricUnitsConverter();
        TimeUnitsConverter tuc = new TimeUnitsConverter();

        double x = 1;
        int y = 14;

        System.out.println(muc.metreToMillimetre(x));
        System.out.println(muc.metreToCentimetre(x));
        System.out.println(muc.millimetreToMetre(x));
        System.out.println(muc.centimetreToMetre(x));

        System.out.println(tuc.hoursToMinutes(tuc.minutesToSeconds(tuc.secondsToMilliseconds(y))));
    }
}
