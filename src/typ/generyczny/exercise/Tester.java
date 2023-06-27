package typ.generyczny.exercise;

public class Tester {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        pair.setT("S");
        pair.setV(25);
        System.out.println(pair.getT());
        System.out.println(pair.getV());

        Pair<Integer, String> pair1 = new Pair<>();
        pair1.setT(25);
        pair1.setV("R");
        System.out.println(pair1.getT());
        System.out.println(pair1.getV());
    }
}

