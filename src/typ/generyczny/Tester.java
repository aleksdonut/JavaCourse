package typ.generyczny;

public class Tester {
    public static void main(String[] args) {
//        IntContainer intContainer = new IntContainer();
//        intContainer.setArray(new int[]{1, 2, 3, 4, 5});
//        intContainer.printArray();
//
//        StringContainer stringContainer = new StringContainer();
//        stringContainer.setArray(new String[]{"Ania", "Kasia", "Basia"});
//        stringContainer.printArray();

        Container<Integer> container = new Container<>();
        container.setArray(new Integer[]{1, 2, 3, 4, 5});
        container.printArray();
        Integer[] array = container.getArray();
        System.out.println(array[0] + array[1] + array[2] + array[3] + array[4]);

        print5Times(5);
        print5Times("abcd");
    }

    private static <T> void print5Times (T argument) {
        for (int i = 0; i < 5; i++) {
            System.out.println(argument);
        }
    }
}
