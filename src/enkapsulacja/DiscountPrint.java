package enkapsulacja;

public class DiscountPrint {
    public void printWelcome (Client client, double price, double discountPrice) {
        String firstName = client.getFirstName();
        String lastName = client.getLastName();

        if (lastName == null && firstName != null) {
            System.out.println("Hello " + firstName);
            printPrices(price, discountPrice);
        } else if (firstName == null && lastName != null) {
            System.out.println("Good morning MS/MSR " + lastName);
            printPrices(price, discountPrice);
        } else if (firstName == null && lastName == null) {
            System.out.println("Hello unknown");
            printPrices(price, discountPrice);
        } else {
            System.out.println("Welcome " + firstName + " " + lastName);
            printPrices(price, discountPrice);
        }
    }

    private void printPrices (double price, double discountPrice) {
        System.out.println("Price before discount " + price +", after discount " + discountPrice);
    }
}
