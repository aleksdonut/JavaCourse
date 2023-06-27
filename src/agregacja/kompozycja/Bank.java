package agregacja.kompozycja;

public class Bank {
    public static void main(String[] args) {
        Address addressOne = new Address();
        addressOne.street = "Street";
        addressOne.buildingNumber = "1";
        addressOne.flatNumber = "10";
        addressOne.postCode = "92-458";
        addressOne.city = "Chicago";

        Address addressTwo = new Address();
        addressTwo.street = "Street";
        addressTwo.buildingNumber = "2";
        addressTwo.flatNumber = "20";
        addressTwo.postCode = "81-347";
        addressTwo.city = "Miami";

        Person personOne = new Person();
        personOne.firstName = "Jan";
        personOne.lastName = "Kowalski";
        personOne.pesel = "12345678901";
        personOne.livingAddress = addressOne;
        personOne.registeredAddress = addressTwo;

        BankAccount accountOne = new BankAccount();
        accountOne.owner = personOne;
        accountOne.balance = 10_000;

        Credit creditOne = new Credit();
        creditOne.borrower = personOne;
        creditOne.cashBorrowed = 5000;
        creditOne.cashReturned = 0;
        creditOne.interestRate = 0.1;
        creditOne.termMonths = 12;

        System.out.println(personOne.firstName + ", " + personOne.lastName + ", " + personOne.pesel + ", " + accountOne.balance);
        System.out.println(addressOne.street + ", " + addressOne.buildingNumber + ", " + addressOne.flatNumber + ", " + addressOne.postCode + ", " + addressOne.city);
        System.out.println(creditOne.cashBorrowed + ", " + creditOne.cashReturned + ", " + creditOne.interestRate + ", " + creditOne.termMonths);

    }
}
