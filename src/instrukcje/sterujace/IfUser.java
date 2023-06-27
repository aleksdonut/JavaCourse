package instrukcje.sterujace;

public class IfUser {
    public static void main(String[] args) {
        User userOne = new User("Jan", "Kowalski");
        System.out.println("Wybierz opcje: ");
        System.out.println("0 - wyjscie z programu");
        System.out.println("1 - wyswietl informacje o uzytkowniku");
        System.out.println("2 - modyfikacja danych");

        int option = 2;

        if (option == 0) {
            System.out.println("Bye bye");
        } else if (option == 1) {
            System.out.println("Uzytkownik " + userOne.getFirstName() + " " + userOne.getLastName());
        } else if (option == 2) {
            userOne.setFirstName("Marcin");
            userOne.setLastName("Nowak");
            System.out.println("Zmieniono dane uzytkownika " + userOne.getFirstName() + " " + userOne.getLastName());
        } else {
            System.out.println("Bledna opcja");
        }
    }
}
