package typ.opakowujacy;

public class WrapperTypes {
    /*
    byte - Byte
    int - Integer
    double - Double
    float - Float
    char - Character
    boolean - Boolean
     */
    public static void main(String[] args) {
        String stringNumber = "25";
        int i = Integer.parseInt(stringNumber);
        Integer integer = Integer.valueOf(stringNumber);

        Integer value = Integer.valueOf(250);
        Integer value2 = Integer.valueOf(250);

        System.out.println(value.equals(value2));

    }
}
