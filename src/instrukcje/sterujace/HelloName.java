package instrukcje.sterujace;

public class HelloName {
    public static void main(String[] args) {
        final String name1 = "Krzysiek";
        final String name2 = "Piotrek";
        final String name3 = "Marek";
        final String name4 = "Maciek";
        String name = "Maciek";

        switch (name){
            case name1:
            case name2:
            case name3:
                System.out.println("Siema uzytkowniku, witaj w aplikacji!");
                break;
            case name4:
                System.out.println("Witam Panie prezesie!");
                break;
            default:
                System.out.println("Witaj nieznany!");
        }

        int option = 2;

        switch (option) {
            case 0:
                System.out.println("Koniec programu");
                break;
            case 1:
                System.out.println("Dodawanie nowej osoby");
                break;
            default:
                System.out.println("Opcja nieznana");
        }
    }
}
