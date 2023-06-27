package enkapsulacja;

public class DiscountApp {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        DiscountPrint discountPrint = new DiscountPrint();

        Client clientOne = new Client("Jan", "Kowalski", true);
        double price = 1100;
        double discountPrice = discountService.calculateDiscountPrice(clientOne, price);
        discountPrint.printWelcome(clientOne, price, discountPrice);
    }
}
