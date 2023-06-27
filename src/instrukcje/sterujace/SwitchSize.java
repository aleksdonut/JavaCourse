package instrukcje.sterujace;

import java.util.Scanner;

public class SwitchSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar (S, M, L, XL): ");
        String shortSize = scanner.nextLine();
        String size = "";

//        switch (shortSize) {
//            case "S":
//                size = "small";
//                break;
//            case "M":
//                size = "medium";
//                break;
//            case "L":
//                size = "large";
//                break;
//            case "XL":
//                size = "extra large";
//                break;
//            default:
//                size = "nieznany";
//        }

//        String size = switch (shortSize) {
//            case "S" -> "small";
//            case "M" -> "medium";
//            case "L" -> "large";
//            case "XL" -> "extra large";
//            default -> "nieznany";
//        };


//        String size = switch (shortSize) {
//            case "S":
//                yield "small";
//            case "M":
//                yield "medium";
//            case "L":
//                yield "large";
//            case "XL":
//                yield "extra large";
//            default:
//                yield "nieznany";
//        };


        System.out.println("Wybrano rozmiar: " + size);
    }
}
