package typ.wyliczeniowy_enum;

import java.util.Scanner;

public class ShirtShop {
    public static void main(String[] args) {
//        System.out.println("SMALL " + TShirt.SMALL);
//        System.out.println("MEDIUM " + TShirt.MEDIUM);
//        System.out.println("LARGE " + TShirt.LARGE);
        System.out.println(Size.SMALL.getDescription() + " " + Size.SMALL.name() + " " + Size.SMALL.ordinal());
        System.out.println(Size.MEDIUM.getDescription() + " " + Size.MEDIUM.name() + " " + Size.MEDIUM.ordinal());
        System.out.println(Size.LARGE.getDescription() + " " + Size.LARGE.name() + " " + Size.LARGE.ordinal());

        Size[] values = Size.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].toString());
        }

        Scanner scanner = new Scanner(System.in);
        String size = scanner.nextLine();
        Size shirtSize = Size.fromDescription(size);

        TShirt tShirt = new TShirt();
        tShirt.setSize(shirtSize);
        System.out.println("Rozmiar tShirta " + tShirt.getSize().getDescription());
    }
}
